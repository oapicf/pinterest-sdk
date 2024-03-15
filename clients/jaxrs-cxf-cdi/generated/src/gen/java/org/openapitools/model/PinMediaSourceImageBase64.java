package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Base64-encoded image media source
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Base64-encoded image media source")
public class PinMediaSourceImageBase64   {
  

public enum SourceTypeEnum {

    @JsonProperty("image_base64") IMAGE_BASE64(String.valueOf("image_base64"));


    private String value;

    SourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private SourceTypeEnum sourceType;


public enum ContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")), @JsonProperty("image/png") PNG(String.valueOf("image/png"));


    private String value;

    ContentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
        for (ContentTypeEnum b : ContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ContentTypeEnum contentType;

  private String data;

  private Boolean isStandard = true;

  /**
   **/
  public PinMediaSourceImageBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
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
  public PinMediaSourceImageBase64 contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content_type")
  @NotNull
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   **/
  public PinMediaSourceImageBase64 data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }


  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   **/
  public PinMediaSourceImageBase64 isStandard(Boolean isStandard) {
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
    PinMediaSourceImageBase64 pinMediaSourceImageBase64 = (PinMediaSourceImageBase64) o;
    return Objects.equals(this.sourceType, pinMediaSourceImageBase64.sourceType) &&
        Objects.equals(this.contentType, pinMediaSourceImageBase64.contentType) &&
        Objects.equals(this.data, pinMediaSourceImageBase64.data) &&
        Objects.equals(this.isStandard, pinMediaSourceImageBase64.isStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, contentType, data, isStandard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageBase64 {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

