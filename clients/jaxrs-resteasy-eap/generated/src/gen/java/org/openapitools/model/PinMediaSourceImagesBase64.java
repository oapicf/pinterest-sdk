package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesBase64ItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Multiple Base64-encoded images media source")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceImagesBase64   {
  

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    MULTIPLE_IMAGE_BASE64("multiple_image_base64");
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
  private List<@Valid PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();
  private Integer index;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Array with image objects.
   **/
  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }
  public void setItems(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImagesBase64 pinMediaSourceImagesBase64 = (PinMediaSourceImagesBase64) o;
    return Objects.equals(this.sourceType, pinMediaSourceImagesBase64.sourceType) &&
        Objects.equals(this.items, pinMediaSourceImagesBase64.items) &&
        Objects.equals(this.index, pinMediaSourceImagesBase64.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, items, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64 {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

