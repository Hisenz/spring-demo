package dao.impl;

import pojo.User;

import java.util.Map;

public class MapDI {
    private Map<String, User> userMap;

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }
}
