package beans;

public class Products {
    private int productId;
    private String productName;

    public Products(){}

    public Products(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
