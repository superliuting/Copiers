package com.github.trang.copiers.test.bean;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author trang
 */
@Getter
@Setter
@ToString
public class SimpleSource {

    private Integer id;
    private Long time;
    private List<Integer> statusList;
    private List<Double> typeList;
    private Map<String, Object> map;
    private String same;

//    public SimpleSource() {
//    }

    public SimpleSource(Integer id) {
        this.id = id;
    }

    public SimpleSource(Integer id, Long time) {
        this.id = id;
        this.time = time;
    }

}