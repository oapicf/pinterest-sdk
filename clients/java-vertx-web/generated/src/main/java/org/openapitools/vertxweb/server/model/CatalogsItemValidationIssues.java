package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationErrors;
import org.openapitools.vertxweb.server.model.CatalogsItemValidationWarnings;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsItemValidationIssues   {
  
  private CatalogsItemValidationErrors errors;
  private String itemId;
  private Integer itemNumber;
  private CatalogsItemValidationWarnings warnings;

  public CatalogsItemValidationIssues () {

  }

  public CatalogsItemValidationIssues (CatalogsItemValidationErrors errors, String itemId, Integer itemNumber, CatalogsItemValidationWarnings warnings) {
    this.errors = errors;
    this.itemId = itemId;
    this.itemNumber = itemNumber;
    this.warnings = warnings;
  }

    
  @JsonProperty("errors")
  public CatalogsItemValidationErrors getErrors() {
    return errors;
  }
  public void setErrors(CatalogsItemValidationErrors errors) {
    this.errors = errors;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("item_number")
  public Integer getItemNumber() {
    return itemNumber;
  }
  public void setItemNumber(Integer itemNumber) {
    this.itemNumber = itemNumber;
  }

    
  @JsonProperty("warnings")
  public CatalogsItemValidationWarnings getWarnings() {
    return warnings;
  }
  public void setWarnings(CatalogsItemValidationWarnings warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemValidationIssues catalogsItemValidationIssues = (CatalogsItemValidationIssues) o;
    return Objects.equals(errors, catalogsItemValidationIssues.errors) &&
        Objects.equals(itemId, catalogsItemValidationIssues.itemId) &&
        Objects.equals(itemNumber, catalogsItemValidationIssues.itemNumber) &&
        Objects.equals(warnings, catalogsItemValidationIssues.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, itemId, itemNumber, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemValidationIssues {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
