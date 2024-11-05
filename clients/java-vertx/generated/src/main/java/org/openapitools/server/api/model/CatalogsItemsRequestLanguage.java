package org.openapitools.server.api.model;

import java.util.Objects;
import org.openapitools.server.api.model.CatalogsLocale;
import org.openapitools.server.api.model.Language;

/**
 * We recommend using the CatalogsLocale values.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemsRequestLanguage   {
  

  public CatalogsItemsRequestLanguage () {

  }

  public CatalogsItemsRequestLanguage () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsRequestLanguage catalogsItemsRequestLanguage = (CatalogsItemsRequestLanguage) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
