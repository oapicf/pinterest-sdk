/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedIngestionErrors;
import org.openapitools.model.CatalogsFeedIngestionInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CatalogsFeedIngestionDetails
 */
@JsonPropertyOrder({
  CatalogsFeedIngestionDetails.JSON_PROPERTY_ERRORS,
  CatalogsFeedIngestionDetails.JSON_PROPERTY_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-07T06:42:01.683468Z[Etc/UTC]")
public class CatalogsFeedIngestionDetails   {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  @JsonProperty(JSON_PROPERTY_ERRORS)
  private CatalogsFeedIngestionErrors errors;

  public static final String JSON_PROPERTY_INFO = "info";
  @JsonProperty(JSON_PROPERTY_INFO)
  private CatalogsFeedIngestionInfo info;

  public CatalogsFeedIngestionDetails errors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @JsonProperty(value = "errors")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public CatalogsFeedIngestionErrors getErrors() {
    return errors;
  }

  public void setErrors(CatalogsFeedIngestionErrors errors) {
    this.errors = errors;
  }

  public CatalogsFeedIngestionDetails info(CatalogsFeedIngestionInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   **/
  @JsonProperty(value = "info")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
    return Objects.equals(this.errors, catalogsFeedIngestionDetails.errors) &&
        Objects.equals(this.info, catalogsFeedIngestionDetails.info);
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
