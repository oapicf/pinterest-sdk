package apimodels;

import apimodels.CatalogsProductGroupUint32Criteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomNumber1Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomNumber1Filter   {
  @JsonProperty("CUSTOM_NUMBER_1")
  @NotNull
@Valid

  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

  public CustomNumber1Filter CUSTOM_NUMBER_1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
    return this;
  }

   /**
   * Get CUSTOM_NUMBER_1
   * @return CUSTOM_NUMBER_1
  **/
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }

  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber1Filter customNumber1Filter = (CustomNumber1Filter) o;
    return Objects.equals(CUSTOM_NUMBER_1, customNumber1Filter.CUSTOM_NUMBER_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_1);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber1Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_1: ").append(toIndentedString(CUSTOM_NUMBER_1)).append("\n");
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

