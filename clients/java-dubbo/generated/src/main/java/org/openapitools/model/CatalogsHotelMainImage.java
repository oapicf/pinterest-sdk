package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The main hotel image
 */
public class CatalogsHotelMainImage implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
   */
  @JsonProperty("link")
  private String link;

  /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   */
  @JsonProperty("tag")
  private List<String> tag;

  /**
   * &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
   * @return link
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   * @return tag
   */
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
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
        Objects.equals(this.tag, catalogsHotelMainImage.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, tag);
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
