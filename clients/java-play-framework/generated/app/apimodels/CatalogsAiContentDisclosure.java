package apimodels;

import apimodels.CatalogsAiContentDisclosureLabel;
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
 * AI content disclosure for a single asset of a catalog item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsAiContentDisclosure   {
  @JsonProperty("disclosure")
  @NotNull
@Size(min=1)
@Valid

  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();

  @JsonProperty("url")
  @NotNull
@Size(max=2000)

  private String url;

  public CatalogsAiContentDisclosure disclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
    this.disclosure = disclosure;
    return this;
  }

  public CatalogsAiContentDisclosure addDisclosureItem(CatalogsAiContentDisclosureLabel disclosureItem) {
    if (this.disclosure == null) {
      this.disclosure = new ArrayList<>();
    }
    this.disclosure.add(disclosureItem);
    return this;
  }

   /**
   * Disclosure labels that apply to this asset.
   * @return disclosure
  **/
  public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
    return disclosure;
  }

  public void setDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
    this.disclosure = disclosure;
  }

  public CatalogsAiContentDisclosure url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
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
    CatalogsAiContentDisclosure catalogsAiContentDisclosure = (CatalogsAiContentDisclosure) o;
    return Objects.equals(disclosure, catalogsAiContentDisclosure.disclosure) &&
        Objects.equals(url, catalogsAiContentDisclosure.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosure, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

