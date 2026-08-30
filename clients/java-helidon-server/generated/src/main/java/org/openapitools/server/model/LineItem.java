package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LineItem   {

    private String productBrand;
    private String productCategory;
    private Integer productId;
    private String productName;
    private String productPrice;
    private Integer productQuantity;
    private String productVariant;
    private String productVariantId;

    /**
     * Default constructor.
     */
    public LineItem() {
    // JSON-B / Jackson
    }

    /**
     * Create LineItem.
     *
     * @param productBrand Product brand. For example, &#39;Parker&#39;.
     * @param productCategory Product category. For example, &#39;Shoes&#39;.
     * @param productId Product ID. For example, 1414.
     * @param productName Product name. For example, &#39;Parker Boots&#39;.
     * @param productPrice Product price. For example, &#39;99.99&#39;.
     * @param productQuantity Product quantity. For example, 2.
     * @param productVariant Product variant. For example, &#39;Red&#39;.
     * @param productVariantId Product variant ID. For example, &#39;1414-34832&#39;.
     */
    public LineItem(
        String productBrand, 
        String productCategory, 
        Integer productId, 
        String productName, 
        String productPrice, 
        Integer productQuantity, 
        String productVariant, 
        String productVariantId
    ) {
        this.productBrand = productBrand;
        this.productCategory = productCategory;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productVariant = productVariant;
        this.productVariantId = productVariantId;
    }



    /**
     * Product brand. For example, 'Parker'.
     * @return productBrand
     */
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * Product category. For example, 'Shoes'.
     * @return productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * Product ID. For example, 1414.
     * @return productId
     */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Product name. For example, 'Parker Boots'.
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Product price. For example, '99.99'.
     * @return productPrice
     */
    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Product quantity. For example, 2.
     * @return productQuantity
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * Product variant. For example, 'Red'.
     * @return productVariant
     */
    public String getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(String productVariant) {
        this.productVariant = productVariant;
    }

    /**
     * Product variant ID. For example, '1414-34832'.
     * @return productVariantId
     */
    public String getProductVariantId() {
        return productVariantId;
    }

    public void setProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineItem {\n");
        
        sb.append("    productBrand: ").append(toIndentedString(productBrand)).append("\n");
        sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
        sb.append("    productQuantity: ").append(toIndentedString(productQuantity)).append("\n");
        sb.append("    productVariant: ").append(toIndentedString(productVariant)).append("\n");
        sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

