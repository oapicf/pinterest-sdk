package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsLocale;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The locale used within a feed for product descriptions.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The locale used within a feed for product descriptions.")
public class CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale catalogsCreativeAssetsFeedsCreateRequestDefaultLocale = (CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
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

