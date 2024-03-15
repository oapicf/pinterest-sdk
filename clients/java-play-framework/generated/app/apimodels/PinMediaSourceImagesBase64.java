package apimodels;

import apimodels.PinMediaSourceImagesBase64ItemsInner;
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
 * Multiple Base64-encoded images media source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSourceImagesBase64   {
  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    MULTIPLE_IMAGE_BASE64("multiple_image_base64");

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
  
  private SourceTypeEnum sourceType;

  @JsonProperty("items")
  @NotNull
@Size(min=2,max=5)
@Valid

  private List<@Valid PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>();

  @JsonProperty("index")
  @Min(0)

  private Integer index;

  public PinMediaSourceImagesBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceImagesBase64 items(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
    return this;
  }

  public PinMediaSourceImagesBase64 addItemsItem(PinMediaSourceImagesBase64ItemsInner itemsItem) {
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
  public List<@Valid PinMediaSourceImagesBase64ItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaSourceImagesBase64ItemsInner> items) {
    this.items = items;
  }

  public PinMediaSourceImagesBase64 index(Integer index) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

