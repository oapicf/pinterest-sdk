package apimodels;

import apimodels.CatalogsProductGroupUint32Criteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomNumber4Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomNumber4Filter   {
  @JsonProperty("CUSTOM_NUMBER_4")
  @NotNull
@Valid

  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;

  public CustomNumber4Filter CUSTOM_NUMBER_4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
    return this;
  }

   /**
   * Get CUSTOM_NUMBER_4
   * @return CUSTOM_NUMBER_4
  **/
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }

  public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber4Filter customNumber4Filter = (CustomNumber4Filter) o;
    return Objects.equals(CUSTOM_NUMBER_4, customNumber4Filter.CUSTOM_NUMBER_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_4);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber4Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_4: ").append(toIndentedString(CUSTOM_NUMBER_4)).append("\n");
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

