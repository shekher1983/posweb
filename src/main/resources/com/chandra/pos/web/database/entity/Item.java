package com.chandra.pos.web.database.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: T4671
 * Date: 8/12/13
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String sku;

    @Basic
    private String name;

    @Basic
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
