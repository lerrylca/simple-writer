package dao;

import entity.ShareEntity;

import java.util.List;

public interface ShareDao {
    public boolean save(ShareEntity share);
    public List<ShareEntity> query(int offset,int rows);
    public List<ShareEntity> queryMy(String username,int offset,int rows);
}