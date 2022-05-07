package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Image URL-based media source")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public class PinMediaSourceImageURL   {
  

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    IMAGE_URL("image_url");
    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }


  private SourceTypeEnum sourceType;

  private String url;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
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
        Objects.equals(url, pinMediaSourceImageURL.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageURL {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

