package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsAiContentDisclosureLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AI content disclosure for a single asset of a catalog item.
 */
@ApiModel(description = "AI content disclosure for a single asset of a catalog item.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsAiContentDisclosure   {
  @JsonProperty("disclosure")
  
  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();

  @JsonProperty("url")
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
   */
  @ApiModelProperty(example = "[\"ai_modified\"]", required = true, value = "Disclosure labels that apply to this asset.")
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
   */
  @ApiModelProperty(example = "https://scene.example.com/image/image_v2.jpg", required = true, value = "URL of the asset. Must match one of image_link, additional_image_link, or video_link.")
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

