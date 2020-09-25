
package mall;

public class Ordered extends AbstractEvent {

    /* 변경 발생시 Delivery MAS와의 약조한 스팩은 유지
    *  -> 하위 호환성 확보
    * */

    private Long id;
    private String productId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
