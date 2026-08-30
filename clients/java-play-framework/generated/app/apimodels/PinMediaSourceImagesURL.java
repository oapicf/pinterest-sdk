package apimodels;

import apimodels.PinMediaSourceImagesURLItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Multiple URL-based images media source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSourceImagesURL   {
  @JsonProperty("index")
  @Min(0)

  private Integer index;

  @JsonProperty("items")
  @NotNull
@Size(min=2,max=5)
@Valid

  private List<@Valid PinMediaSourceImagesURLItem> items = new ArrayList<>();

  /**
   * The source type of the media.
   */
  public enum SourceTypeEnum {
    MULTIPLE_IMAGE_URLS("multiple_image_urls");

    private final String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("source_type")
  @NotNull

  private SourceTypeEnum sourceType;

  public PinMediaSourceImagesURL index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * minimum: 0
   * @return index
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSourceImagesURL items(List<@Valid PinMediaSourceImagesURLItem> items) {
    this.items = items;
    return this;
  }

  public PinMediaSourceImagesURL addItemsItem(PinMediaSourceImagesURLItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with image objects.
   * @return items
  **/
  public List<@Valid PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  public PinMediaSourceImagesURL sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The source type of the media.
   * @return sourceType
  **/
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
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
    return Objects.equals(index, pinMediaSourceImagesURL.index) &&
        Objects.equals(items, pinMediaSourceImagesURL.items) &&
        Objects.equals(sourceType, pinMediaSourceImagesURL.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, items, sourceType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

