package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetsResult;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetsResultsResponseArray   {
  @JsonProperty("items")
  private List<UpdatePartnerAssetsResult> items = null;

  /**
   * List of assigned/updated partner asset access.
   **/
  public UpdatePartnerAssetsResultsResponseArray items(List<UpdatePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of assigned/updated partner asset access.")
  @JsonProperty("items")
  public List<UpdatePartnerAssetsResult> getItems() {
    return items;
  }
  public void setItems(List<UpdatePartnerAssetsResult> items) {
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
    UpdatePartnerAssetsResultsResponseArray updatePartnerAssetsResultsResponseArray = (UpdatePartnerAssetsResultsResponseArray) o;
    return Objects.equals(items, updatePartnerAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResultsResponseArray {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

