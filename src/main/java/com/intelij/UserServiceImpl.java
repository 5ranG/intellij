package com.intelij;

public class UserServiceImpl implements UserSerivce{
    @Override
    public boolean insert(User user) {
        System.out.println(user + "사용자 추가");
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean select(String username) {
        return false;
    }

    @Override
    public boolean delete(String username) {
        return false;
    }
}
