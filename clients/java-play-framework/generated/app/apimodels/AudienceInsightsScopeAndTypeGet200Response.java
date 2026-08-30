package apimodels;

import apimodels.AudienceDefinition;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AudienceInsightsScopeAndTypeGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceInsightsScopeAndTypeGet200Response   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid AudienceDefinition> items = new ArrayList<>();

  public AudienceInsightsScopeAndTypeGet200Response items(List<@Valid AudienceDefinition> items) {
    this.items = items;
    return this;
  }

  public AudienceInsightsScopeAndTypeGet200Response addItemsItem(AudienceDefinition itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<@Valid AudienceDefinition> getItems() {
    return items;
  }

  public void setItems(List<@Valid AudienceDefinition> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet200Response = (AudienceInsightsScopeAndTypeGet200Response) o;
    return Objects.equals(items, audienceInsightsScopeAndTypeGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightsScopeAndTypeGet200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

