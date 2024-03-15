package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The main hotel image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelAttributesAllOfMainImage   {
  @JsonProperty("link")
  
  private String link;

  @JsonProperty("tag")
  
  private List<String> tag = null;

  public CatalogsHotelAttributesAllOfMainImage link(String link) {
    this.link = link;
    return this;
  }

   /**
   * <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelAttributesAllOfMainImage tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public CatalogsHotelAttributesAllOfMainImage addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   * @return tag
  **/
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
    CatalogsHotelAttributesAllOfMainImage catalogsHotelAttributesAllOfMainImage = (CatalogsHotelAttributesAllOfMainImage) o;
    return Objects.equals(link, catalogsHotelAttributesAllOfMainImage.link) &&
        Objects.equals(tag, catalogsHotelAttributesAllOfMainImage.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, tag);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAttributesAllOfMainImage {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

