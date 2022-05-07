package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public class CatalogsFeedIngestionDetails   {
  

  private CatalogsFeedIngestionErrors errors;

  private CatalogsFeedIngestionInfo info;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("errors")
  @NotNull
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }
  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("info")
  @NotNull
  public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }
  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestionDetails catalogsFeedIngestionDetails = (CatalogsFeedIngestionDetails) o;
    return Objects.equals(errors, catalogsFeedIngestionDetails.errors) &&
        Objects.equals(info, catalogsFeedIngestionDetails.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestionDetails {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

