package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CartingRetailer;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CartingProduct   {

    private String cartingProductId;
    private Boolean displayPreferredRetailersOnly;
    private Boolean displayProductPrice;
    private List<@Valid CartingRetailer> preferredRetailers = new ArrayList<>();
    private Boolean randomizePreferredRetailers;

    /**
     * Default constructor.
     */
    public CartingProduct() {
    // JSON-B / Jackson
    }

    /**
     * Create CartingProduct.
     *
     * @param cartingProductId the internal Pinterest carting product id (different from industry product id)
     * @param displayPreferredRetailersOnly Whether to display only the preferred retailers for the carting product
     * @param displayProductPrice Whether to display the price for the carting product
     * @param preferredRetailers A sorted array of preferred retailers for the carting product
     * @param randomizePreferredRetailers Whether to randomize preferred retailers for the carting product
     */
    public CartingProduct(
        String cartingProductId, 
        Boolean displayPreferredRetailersOnly, 
        Boolean displayProductPrice, 
        List<@Valid CartingRetailer> preferredRetailers, 
        Boolean randomizePreferredRetailers
    ) {
        this.cartingProductId = cartingProductId;
        this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
        this.displayProductPrice = displayProductPrice;
        this.preferredRetailers = preferredRetailers;
        this.randomizePreferredRetailers = randomizePreferredRetailers;
    }



    /**
     * the internal Pinterest carting product id (different from industry product id)
     * @return cartingProductId
     */
    public String getCartingProductId() {
        return cartingProductId;
    }

    public void setCartingProductId(String cartingProductId) {
        this.cartingProductId = cartingProductId;
    }

    /**
     * Whether to display only the preferred retailers for the carting product
     * @return displayPreferredRetailersOnly
     */
    public Boolean getDisplayPreferredRetailersOnly() {
        return displayPreferredRetailersOnly;
    }

    public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
        this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    }

    /**
     * Whether to display the price for the carting product
     * @return displayProductPrice
     */
    public Boolean getDisplayProductPrice() {
        return displayProductPrice;
    }

    public void setDisplayProductPrice(Boolean displayProductPrice) {
        this.displayProductPrice = displayProductPrice;
    }

    /**
     * A sorted array of preferred retailers for the carting product
     * @return preferredRetailers
     */
    public List<@Valid CartingRetailer> getPreferredRetailers() {
        return preferredRetailers;
    }

    public void setPreferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
        this.preferredRetailers = preferredRetailers;
    }

    /**
     * Whether to randomize preferred retailers for the carting product
     * @return randomizePreferredRetailers
     */
    public Boolean getRandomizePreferredRetailers() {
        return randomizePreferredRetailers;
    }

    public void setRandomizePreferredRetailers(Boolean randomizePreferredRetailers) {
        this.randomizePreferredRetailers = randomizePreferredRetailers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartingProduct {\n");
        
        sb.append("    cartingProductId: ").append(toIndentedString(cartingProductId)).append("\n");
        sb.append("    displayPreferredRetailersOnly: ").append(toIndentedString(displayPreferredRetailersOnly)).append("\n");
        sb.append("    displayProductPrice: ").append(toIndentedString(displayProductPrice)).append("\n");
        sb.append("    preferredRetailers: ").append(toIndentedString(preferredRetailers)).append("\n");
        sb.append("    randomizePreferredRetailers: ").append(toIndentedString(randomizePreferredRetailers)).append("\n");
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

