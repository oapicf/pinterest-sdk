package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsFeedIngestionInfo   {

    private Integer IN_STOCK;
    private Integer OUT_OF_STOCK;
    private Integer PREORDER;

    /**
     * Default constructor.
     */
    public CatalogsFeedIngestionInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedIngestionInfo.
     *
     * @param IN_STOCK The number of ingested products that are in stock.
     * @param OUT_OF_STOCK The number of ingested products that are in out of stock.
     * @param PREORDER The number of ingested products that are in preorder.
     */
    public CatalogsFeedIngestionInfo(
        Integer IN_STOCK, 
        Integer OUT_OF_STOCK, 
        Integer PREORDER
    ) {
        this.IN_STOCK = IN_STOCK;
        this.OUT_OF_STOCK = OUT_OF_STOCK;
        this.PREORDER = PREORDER;
    }



    /**
     * The number of ingested products that are in stock.
     * @return IN_STOCK
     */
    public Integer getINSTOCK() {
        return IN_STOCK;
    }

    public void setINSTOCK(Integer IN_STOCK) {
        this.IN_STOCK = IN_STOCK;
    }

    /**
     * The number of ingested products that are in out of stock.
     * @return OUT_OF_STOCK
     */
    public Integer getOUTOFSTOCK() {
        return OUT_OF_STOCK;
    }

    public void setOUTOFSTOCK(Integer OUT_OF_STOCK) {
        this.OUT_OF_STOCK = OUT_OF_STOCK;
    }

    /**
     * The number of ingested products that are in preorder.
     * @return PREORDER
     */
    public Integer getPREORDER() {
        return PREORDER;
    }

    public void setPREORDER(Integer PREORDER) {
        this.PREORDER = PREORDER;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedIngestionInfo {\n");
        
        sb.append("    IN_STOCK: ").append(toIndentedString(IN_STOCK)).append("\n");
        sb.append("    OUT_OF_STOCK: ").append(toIndentedString(OUT_OF_STOCK)).append("\n");
        sb.append("    PREORDER: ").append(toIndentedString(PREORDER)).append("\n");
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

