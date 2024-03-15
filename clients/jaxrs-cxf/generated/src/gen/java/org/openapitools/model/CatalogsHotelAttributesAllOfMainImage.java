package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The main hotel image
 **/
@ApiModel(description="The main hotel image")

public class CatalogsHotelAttributesAllOfMainImage  {
  
  @ApiModelProperty(value = "<p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>")
 /**
   * <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
  **/
  private String link;

  @ApiModelProperty(value = "Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image")
 /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  **/
  private List<String> tag;
 /**
   * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt;
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelAttributesAllOfMainImage link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
   * @return tag
  **/
  @JsonProperty("tag")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  public CatalogsHotelAttributesAllOfMainImage tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public CatalogsHotelAttributesAllOfMainImage addTagItem(String tagItem) {
    this.tag.add(tagItem);
    return this;
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
    return Objects.equals(this.link, catalogsHotelAttributesAllOfMainImage.link) &&
        Objects.equals(this.tag, catalogsHotelAttributesAllOfMainImage.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, tag);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

