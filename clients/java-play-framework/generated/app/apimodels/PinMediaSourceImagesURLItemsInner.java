package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PinMediaSourceImagesURLItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSourceImagesURLItemsInner   {
  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("link")
  
  private String link;

  @JsonProperty("url")
  @NotNull

  private String url;

  public PinMediaSourceImagesURLItemsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinMediaSourceImagesURLItemsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinMediaSourceImagesURLItemsInner link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Destination link for the image.
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaSourceImagesURLItemsInner url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of image to upload.
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner = (PinMediaSourceImagesURLItemsInner) o;
    return Objects.equals(title, pinMediaSourceImagesURLItemsInner.title) &&
        Objects.equals(description, pinMediaSourceImagesURLItemsInner.description) &&
        Objects.equals(link, pinMediaSourceImagesURLItemsInner.link) &&
        Objects.equals(url, pinMediaSourceImagesURLItemsInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURLItemsInner {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

