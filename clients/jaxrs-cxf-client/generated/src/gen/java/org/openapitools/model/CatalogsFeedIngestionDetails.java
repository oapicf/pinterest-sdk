package org.openapitools.model;

import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CatalogsFeedIngestionDetails  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedIngestionErrors errors;

  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedIngestionInfo info;
 /**
   * Get errors
   * @return errors
  **/
  @JsonProperty("errors")
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

 /**
   * Get info
   * @return info
  **/
  @JsonProperty("info")
  public CatalogsFeedIngestionInfo getInfo() {
    return info;
  }

  public void setInfo(CatalogsFeedIngestionInfo info) {
    this.info = info;
  }

  public CatalogsFeedIngestionDetails info(CatalogsFeedIngestionInfo info) {
    this.info = info;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

