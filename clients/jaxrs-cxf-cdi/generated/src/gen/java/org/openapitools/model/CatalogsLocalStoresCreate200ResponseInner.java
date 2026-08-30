package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInnerData;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CatalogsLocalStoresCreate200ResponseInner   {
  
  private CatalogsLocalStoresCreate200ResponseInnerData data;

  /**
   **/
  public CatalogsLocalStoresCreate200ResponseInner data(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
  public CatalogsLocalStoresCreate200ResponseInnerData getData() {
    return data;
  }
  public void setData(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInner catalogsLocalStoresCreate200ResponseInner = (CatalogsLocalStoresCreate200ResponseInner) o;
    return Objects.equals(this.data, catalogsLocalStoresCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInner {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

