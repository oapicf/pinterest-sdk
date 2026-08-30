package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The main hotel image
 */

@Schema(name = "CatalogsHotelMainImage", description = "The main hotel image")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelMainImage {

  private String link;

  @Valid
  private JsonNullable<List<String>> tag = JsonNullable.<List<String>>undefined();

  public CatalogsHotelMainImage link(String link) {
    this.link = link;
    return this;
  }

  /**
   * <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
   * @return link
   */
  
  @Schema(name = "link", description = "<= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelMainImage tag(List<String> tag) {
    this.tag = JsonNullable.of(tag);
    return this;
  }

  public CatalogsHotelMainImage addTagItem(String tagItem) {
    if (this.tag == null || !this.tag.isPresent()) {
      this.tag = JsonNullable.of(new ArrayList<>());
    }
    this.tag.get().add(tagItem);
    return this;
  }

  /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   * @return tag
   */
  
  @Schema(name = "tag", description = "Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public JsonNullable<List<String>> getTag() {
    return tag;
  }

  public void setTag(JsonNullable<List<String>> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelMainImage catalogsHotelMainImage = (CatalogsHotelMainImage) o;
    return Objects.equals(this.link, catalogsHotelMainImage.link) &&
        equalsNullable(this.tag, catalogsHotelMainImage.tag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, hashCodeNullable(tag));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelMainImage {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

