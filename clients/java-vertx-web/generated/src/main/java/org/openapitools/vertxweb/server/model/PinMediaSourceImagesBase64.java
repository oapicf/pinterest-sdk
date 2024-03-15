package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesBase64ItemsInner;

/**
 * Multiple Base64-encoded images media source
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSourceImagesBase64   {
  


  public enum SourceTypeEnum {
    MULTIPLE_IMAGE_BASE64("multiple_image_base64");

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
  private List<PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();
  private Integer index;

  public PinMediaSourceImagesBase64 () {

  }

  public PinMediaSourceImagesBase64 (SourceTypeEnum sourceType, List<PinMediaSourceImagesBase64ItemsInner> items, Integer index) {
    this.sourceType = sourceType;
    this.items = items;
    this.index = index;
  }

    
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("items")
  public List<PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }
  public void setItems(List<PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

    
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
    PinMediaSourceImagesBase64 pinMediaSourceImagesBase64 = (PinMediaSourceImagesBase64) o;
    return Objects.equals(sourceType, pinMediaSourceImagesBase64.sourceType) &&
        Objects.equals(items, pinMediaSourceImagesBase64.items) &&
        Objects.equals(index, pinMediaSourceImagesBase64.index);
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
