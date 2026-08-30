package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The main hotel image
 */
@ApiModel(description = "The main hotel image")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelMainImage   {
  @JsonProperty("link")
  private String link;

  @JsonProperty("tag")
  private List<String> tag = null;

  public CatalogsHotelMainImage link(String link) {
    this.link = link;
    return this;
  }

   /**
   * <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
   * @return link
  **/
  @ApiModelProperty(value = "<= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelMainImage tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public CatalogsHotelMainImage addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = ;
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   * @return tag
  **/
  @ApiModelProperty(value = "Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image")
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

