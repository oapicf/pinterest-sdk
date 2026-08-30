package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CatalogsAiContentDisclosureLabel;

/**
 * AI content disclosure for a single asset of a catalog item.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsAiContentDisclosure   {
  
  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();
  private String url;

  public CatalogsAiContentDisclosure () {

  }

  public CatalogsAiContentDisclosure (List<CatalogsAiContentDisclosureLabel> disclosure, String url) {
    this.disclosure = disclosure;
    this.url = url;
  }

    
  @JsonProperty("disclosure")
  public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
    return disclosure;
  }
  public void setDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
    this.disclosure = disclosure;
  }

    
  @JsonProperty("url")
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
    return Objects.equals(disclosure, catalogsAiContentDisclosure.disclosure) &&
        Objects.equals(url, catalogsAiContentDisclosure.url);
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
