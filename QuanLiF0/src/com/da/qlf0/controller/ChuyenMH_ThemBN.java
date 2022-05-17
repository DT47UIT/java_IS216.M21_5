/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.da.qlf0.controller;

import com.da.qlf0.bean.DanhMucBean;
import com.da.qlf0.bean.DanhMucThemBN;
import com.da.qlf0.view.GUI_ThemBN.BenhNen_ThemBN;
import com.da.qlf0.view.GUI_ThemBN.TTCoBan_ThemBN;
import com.da.qlf0.view.GUI_ThemBN.TiemVX_ThemBN;
import com.da.qlf0.view.GUI_ThemBN.TinhTrangTT_ThemBN;
import com.da.qlf0.view.HoTroPanel;
import com.da.qlf0.view.QuanLiBnPanel;
import com.da.qlf0.view.ThongKePanel;
import com.da.qlf0.view.TrangChuPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Minh Cuong
 */
public class ChuyenMH_ThemBN {
    
    
       private String kindSelected = "";
        private JPanel jpnRoot;
        private ArrayList<DanhMucThemBN> listItem = null;

    public ChuyenMH_ThemBN(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }
        
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "ThongTinCoBan";
       jpnItem.setBackground(new Color(0, 134, 179));
       jlbItem.setBackground(new Color(0, 134, 179));
       JPanel node = new TTCoBan_ThemBN();
       jpnRoot.removeAll();
       jpnRoot.setLayout(new BorderLayout());
       jpnRoot.add(node);
       jpnRoot.validate();
       jpnRoot.repaint();
    }
    public void setEvent(ArrayList<DanhMucThemBN> listItem) {
     this.listItem = listItem;
     for (DanhMucThemBN item : listItem) {
           item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
     }
}

class LabelEvent implements MouseListener {

      private JPanel node;
      private String kind;

      private JPanel jpnItem;
      private JLabel jlbItem;

      public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
           this.kind = kind;
           this.jpnItem = jpnItem;
           this.jlbItem = jlbItem;
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "ThongTinCoBan":
                    node = new TTCoBan_ThemBN();
                    break;
                case "TiemVX":
                    node = new TiemVX_ThemBN();
                    break;
                case "BenhNen":
                    node = new BenhNen_ThemBN();
                    break;
                case "TinhTrang":
                    node=new TinhTrangTT_ThemBN();
                    break;
                default:
                    break;
           }
           jpnRoot.removeAll();
           jpnRoot.setLayout(new BorderLayout());
           node.setSize(jpnRoot.getWidth(),jpnRoot.getHeight());
           jpnRoot.add(node);
           
           jpnRoot.validate();
           jpnRoot.repaint();
           setChangeBackground(kind);
           
      }

      @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(0, 134, 179));
           jlbItem.setBackground(new Color(0, 134, 179));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(0, 134, 179));
          jlbItem.setBackground(new Color(0, 134, 179));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(0, 180, 153));
                jlbItem.setBackground(new Color(0, 180, 153));
          }
      }

    }
    private void setChangeBackground( String kind){
        for(DanhMucThemBN item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJlb().setBackground(new Color(0, 134, 179));
                item.getJpn().setBackground(new Color(0, 134, 179));
                        
            }else{
                item.getJlb().setBackground(new Color(0, 180, 153));
                item.getJpn().setBackground(new Color(0, 180, 153));
            }
        }
    }
     
}
