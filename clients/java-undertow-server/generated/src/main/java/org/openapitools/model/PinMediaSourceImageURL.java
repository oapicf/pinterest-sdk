/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Image URL-based media source
 */

@ApiModel(description = "Image URL-based media source")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaSourceImageURL   {
  


  public enum SourceTypeEnum {
    IMAGE_URL("image_url");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceTypeEnum sourceType;
  private String url;
  private Boolean isStandard = true;

  /**
   */
  public PinMediaSourceImageURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   */
  public PinMediaSourceImageURL url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  public PinMediaSourceImageURL isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImageURL pinMediaSourceImageURL = (PinMediaSourceImageURL) o;
    return Objects.equals(sourceType, pinMediaSourceImageURL.sourceType) &&
        Objects.equals(url, pinMediaSourceImageURL.url) &&
        Objects.equals(isStandard, pinMediaSourceImageURL.isStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, url, isStandard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageURL {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
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

