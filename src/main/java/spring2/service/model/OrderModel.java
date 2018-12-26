package spring2.service.model;

import java.math.BigDecimal;

/**
 * @author 张文光
 * @version 1.0
 * @Date 2018/12/22 0022 13:35
 */
public class OrderModel {
    /**
     * 交易id
     */
    private String id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer itemId;


    /**
     * 若非空，则表示是以秒杀商品方式下单
     */
    private Integer promoId;

    /**
     * 购买商品时的单价，若promoid非空则表示秒杀商品价格
     */
    private BigDecimal itemPrice;

    /**
     * 商品数量
     */
    private Integer amount;

    /**
     * 购买金额 若promoid非空则表示秒杀商品价格
     */
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }
}