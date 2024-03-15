package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestionInfo   {
  
  private Integer IN_STOCK;
  private Integer OUT_OF_STOCK;
  private Integer PREORDER;

  public CatalogsFeedIngestionInfo () {

  }

  public CatalogsFeedIngestionInfo (Integer IN_STOCK, Integer OUT_OF_STOCK, Integer PREORDER) {
    this.IN_STOCK = IN_STOCK;
    this.OUT_OF_STOCK = OUT_OF_STOCK;
    this.PREORDER = PREORDER;
  }

    
  @JsonProperty("IN_STOCK")
  public Integer getINSTOCK() {
    return IN_STOCK;
  }
  public void setINSTOCK(Integer IN_STOCK) {
    this.IN_STOCK = IN_STOCK;
  }

    
  @JsonProperty("OUT_OF_STOCK")
  public Integer getOUTOFSTOCK() {
    return OUT_OF_STOCK;
  }
  public void setOUTOFSTOCK(Integer OUT_OF_STOCK) {
    this.OUT_OF_STOCK = OUT_OF_STOCK;
  }

    
  @JsonProperty("PREORDER")
  public Integer getPREORDER() {
    return PREORDER;
  }
  public void setPREORDER(Integer PREORDER) {
    this.PREORDER = PREORDER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionInfo catalogsFeedIngestionInfo = (CatalogsFeedIngestionInfo) o;
    return Objects.equals(IN_STOCK, catalogsFeedIngestionInfo.IN_STOCK) &&
        Objects.equals(OUT_OF_STOCK, catalogsFeedIngestionInfo.OUT_OF_STOCK) &&
        Objects.equals(PREORDER, catalogsFeedIngestionInfo.PREORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IN_STOCK, OUT_OF_STOCK, PREORDER);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
