package apimodels;

import apimodels.CatalogsProductGroupUint32Criteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomNumber0Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomNumber0Filter   {
  @JsonProperty("CUSTOM_NUMBER_0")
  @NotNull
@Valid

  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

  public CustomNumber0Filter CUSTOM_NUMBER_0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    return this;
  }

   /**
   * Get CUSTOM_NUMBER_0
   * @return CUSTOM_NUMBER_0
  **/
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber0Filter customNumber0Filter = (CustomNumber0Filter) o;
    return Objects.equals(CUSTOM_NUMBER_0, customNumber0Filter.CUSTOM_NUMBER_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_0);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber0Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_0: ").append(toIndentedString(CUSTOM_NUMBER_0)).append("\n");
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

