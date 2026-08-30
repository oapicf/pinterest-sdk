package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsAiContentDisclosureLabel;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AI content disclosure for a single asset of a catalog item.
 */

@Schema(name = "CatalogsAiContentDisclosure", description = "AI content disclosure for a single asset of a catalog item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsAiContentDisclosure {

  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();

  private String url;

  public CatalogsAiContentDisclosure() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsAiContentDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure, String url) {
    this.disclosure = disclosure;
    this.url = url;
  }

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
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "disclosure", example = "[\"ai_modified\"]", description = "Disclosure labels that apply to this asset.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disclosure")
  public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
    return disclosure;
  }

  @JsonProperty("disclosure")
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
  @NotNull @Size(max = 2000) 
  @Schema(name = "url", example = "https://scene.example.com/image/image_v2.jpg", description = "URL of the asset. Must match one of image_link, additional_image_link, or video_link.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

