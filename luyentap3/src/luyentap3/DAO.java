/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap3;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public interface DAO {
        public void Insert(SanPham s);
        public void Update(int Location , SanPham s);
        public void Delete(int location);
        public ArrayList<SanPham> getList();
        public void setlist(ArrayList<SanPham> list);
}
