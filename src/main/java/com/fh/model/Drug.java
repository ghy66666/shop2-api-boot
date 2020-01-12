package com.fh.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Drug {

    /*
   药品(drug_Drug)表如下:
    id 药品id
    Drug_Name 药品名称
    Drug_Price价格
            Drug_Sales销量
    Drug_Stock库存
    Is_OTC 是否处方药 1是非处方药 2是处方药
            Area_Id产地id
    Brand_Id 品牌id
    person适合人群(1幼儿 2少年 3青年 4中年 5老年 6孕妇)
    Produced_Date 生产日期
    Expired_Date 过期日期
    Create_Date 创建时间
    Update_Date 修改时间*/

    private Integer id;

    private String drugName;

    private BigDecimal drugPrice;

    private Integer drugSales;

    private Integer drugStock;

    private Integer isOTC;

    private Integer areaId;

    private String areaName;

    private Integer brandId;

    private String brandName;

    private String person;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date producedDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expiredDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }

    public Integer getDrugSales() {
        return drugSales;
    }

    public void setDrugSales(Integer drugSales) {
        this.drugSales = drugSales;
    }

    public Integer getDrugStock() {
        return drugStock;
    }

    public void setDrugStock(Integer drugStock) {
        this.drugStock = drugStock;
    }

    public Integer getIsOTC() {
        return isOTC;
    }

    public void setIsOTC(Integer isOTC) {
        this.isOTC = isOTC;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Date getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(Date producedDate) {
        this.producedDate = producedDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
