package org.openapitools.model;

import org.openapitools.model.CatalogsAiContentDisclosureLabel;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * AI content disclosure for a single asset of a catalog item.
 */
public class CatalogsAiContentDisclosure implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Disclosure labels that apply to this asset.
   */
  @JsonProperty("disclosure")
  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();

  /**
   * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
   */
  @JsonProperty("url")
  private String url;

  /**
   * Disclosure labels that apply to this asset.
   * @return disclosure
   */
  public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
    return disclosure;
  }

  public void setDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
    this.disclosure = disclosure;
  }

  /**
   * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
   * @return url
   */
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
    CatalogsAiContentDisclosure catalogsAiContentDisclosure = (CatalogsAiContentDisclosure) o;
    return Objects.equals(this.disclosure, catalogsAiContentDisclosure.disclosure) &&
        Objects.equals(this.url, catalogsAiContentDisclosure.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosure, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsAiContentDisclosure {\n");
    
    sb.append("    disclosure: ").append(toIndentedString(disclosure)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
