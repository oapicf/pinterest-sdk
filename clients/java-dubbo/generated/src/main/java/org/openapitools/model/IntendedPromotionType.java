package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types
 */
public class IntendedPromotionType implements Serializable {
  private static final long serialVersionUID = 1L;


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
    sb.append("class IntendedPromotionType {\n");
    
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
