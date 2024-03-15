package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PinMediaSourceImagesURLItemsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceImagesURLItemsInner   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("url")
  private String url;

  public PinMediaSourceImagesURLItemsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Destination link for the image.")
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
  @ApiModelProperty(required = true, value = "URL of image to upload.")
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
    return Objects.equals(this.title, pinMediaSourceImagesURLItemsInner.title) &&
        Objects.equals(this.description, pinMediaSourceImagesURLItemsInner.description) &&
        Objects.equals(this.link, pinMediaSourceImagesURLItemsInner.link) &&
        Objects.equals(this.url, pinMediaSourceImagesURLItemsInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, url);
  }

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

