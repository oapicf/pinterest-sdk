package org.openapitools.model;

import org.openapitools.model.PinMediaSourceImagesURLItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Multiple URL-based images media source
 */
public class PinMediaSourceImagesURL implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("index")
  private Integer index;

  /**
   * Array with image objects.
   */
  @JsonProperty("items")
  private List<PinMediaSourceImagesURLItem> items = new ArrayList<>();

  /**
   * The source type of the media.
   */
  @JsonProperty("source_type")
  private String sourceType;

  /**
   * 
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Array with image objects.
   * @return items
   */
  public List<PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  /**
   * The source type of the media.
   * @return sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
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
    return Objects.equals(this.index, pinMediaSourceImagesURL.index) &&
        Objects.equals(this.items, pinMediaSourceImagesURL.items) &&
        Objects.equals(this.sourceType, pinMediaSourceImagesURL.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, items, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURL {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
