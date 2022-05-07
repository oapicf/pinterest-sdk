package apimodels;

import apimodels.CatalogsProductGroupCurrencyCriteria;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ItemIdFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemIdFilter   {
  @JsonProperty("ITEM_ID")
  @NotNull
@Valid

  private CatalogsProductGroupCurrencyCriteria ITEM_ID;

  public ItemIdFilter ITEM_ID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }

   /**
   * Get ITEM_ID
   * @return ITEM_ID
  **/
  public CatalogsProductGroupCurrencyCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemIdFilter itemIdFilter = (ItemIdFilter) o;
    return Objects.equals(ITEM_ID, itemIdFilter.ITEM_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ITEM_ID);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemIdFilter {\n");
    
    sb.append("    ITEM_ID: ").append(toIndentedString(ITEM_ID)).append("\n");
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

