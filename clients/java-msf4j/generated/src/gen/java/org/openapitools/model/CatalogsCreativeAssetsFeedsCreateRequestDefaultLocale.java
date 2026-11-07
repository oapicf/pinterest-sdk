package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsLocale;

/**
 * The locale used within a feed for product descriptions.
 */
@ApiModel(description = "The locale used within a feed for product descriptions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-07T04:05:33.662988146Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale {\n");
    
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

