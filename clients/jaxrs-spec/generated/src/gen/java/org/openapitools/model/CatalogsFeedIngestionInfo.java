package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsFeedIngestionInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class CatalogsFeedIngestionInfo   {
  
  private @Valid Integer inStock;
  private @Valid Integer outOfStock;
  private @Valid Integer preorder;

  /**
   **/
  public CatalogsFeedIngestionInfo inStock(Integer inStock) {
    this.inStock = inStock;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("in_stock")
  public Integer getInStock() {
    return inStock;
  }

  @JsonProperty("in_stock")
  public void setInStock(Integer inStock) {
    this.inStock = inStock;
  }

/**
   **/
  public CatalogsFeedIngestionInfo outOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("out_of_stock")
  public Integer getOutOfStock() {
    return outOfStock;
  }

  @JsonProperty("out_of_stock")
  public void setOutOfStock(Integer outOfStock) {
    this.outOfStock = outOfStock;
  }

/**
   **/
  public CatalogsFeedIngestionInfo preorder(Integer preorder) {
    this.preorder = preorder;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("preorder")
  public Integer getPreorder() {
    return preorder;
  }

  @JsonProperty("preorder")
  public void setPreorder(Integer preorder) {
    this.preorder = preorder;
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
    return Objects.equals(this.inStock, catalogsFeedIngestionInfo.inStock) &&
        Objects.equals(this.outOfStock, catalogsFeedIngestionInfo.outOfStock) &&
        Objects.equals(this.preorder, catalogsFeedIngestionInfo.preorder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStock, outOfStock, preorder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionInfo {\n");
    
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
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

