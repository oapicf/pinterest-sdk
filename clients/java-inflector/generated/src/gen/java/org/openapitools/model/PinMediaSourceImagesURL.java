package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImagesURLItemsInner;



/**
 * Multiple images urls-based media source
 **/

@ApiModel(description = "Multiple images urls-based media source")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceImagesURL   {
  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    MULTIPLE_IMAGE_URLS("multiple_image_urls");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("source_type")
  private SourceTypeEnum sourceType;

  @JsonProperty("items")
  private List<PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

  @JsonProperty("index")
  private Integer index;

  /**
   **/
  public PinMediaSourceImagesURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
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
  public PinMediaSourceImagesURL items(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }
  public void setItems(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  /**
   * minimum: 0
   **/
  public PinMediaSourceImagesURL index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
  public Integer getIndex() {
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
    PinMediaSourceImagesURL pinMediaSourceImagesURL = (PinMediaSourceImagesURL) o;
    return Objects.equals(sourceType, pinMediaSourceImagesURL.sourceType) &&
        Objects.equals(items, pinMediaSourceImagesURL.items) &&
        Objects.equals(index, pinMediaSourceImagesURL.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, items, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURL {\n");
    
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

