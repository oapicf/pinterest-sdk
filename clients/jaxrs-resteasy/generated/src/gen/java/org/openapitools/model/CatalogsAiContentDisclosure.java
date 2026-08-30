package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsAiContentDisclosureLabel;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="AI content disclosure for a single asset of a catalog item.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsAiContentDisclosure   {
  
  private List<CatalogsAiContentDisclosureLabel> disclosure = new ArrayList<>();
  private String url;

  /**
   * Disclosure labels that apply to this asset.
   **/
  
  @ApiModelProperty(example = "[\"ai_modified\"]", required = true, value = "Disclosure labels that apply to this asset.")
  @JsonProperty("disclosure")
  @NotNull
 @Size(min=1)  @Valid
  public List<CatalogsAiContentDisclosureLabel> getDisclosure() {
    return disclosure;
  }
  public void setDisclosure(List<CatalogsAiContentDisclosureLabel> disclosure) {
    this.disclosure = disclosure;
  }

  /**
   * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
   **/
  
  @ApiModelProperty(example = "https://scene.example.com/image/image_v2.jpg", required = true, value = "URL of the asset. Must match one of image_link, additional_image_link, or video_link.")
  @JsonProperty("url")
  @NotNull
 @Size(max=2000)  public String getUrl() {
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

