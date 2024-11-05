package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.Language;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * We recommend using the CatalogsLocale values.
 **/
@ApiModel(description="We recommend using the CatalogsLocale values.")

public class CatalogsItemsRequestLanguage  {
    @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsRequestLanguage catalogsItemsRequestLanguage = (CatalogsItemsRequestLanguage) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsRequestLanguage {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

