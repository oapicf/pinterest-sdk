/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.AdAccountsCountryResponseData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdAccountsCountryResponse {
  
  @SerializedName("items")
  private List<AdAccountsCountryResponseData> items = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AdAccountsCountryResponseData> getItems() {
    return items;
  }
  public void setItems(List<AdAccountsCountryResponseData> items) {
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
    AdAccountsCountryResponse adAccountsCountryResponse = (AdAccountsCountryResponse) o;
    return (this.items == null ? adAccountsCountryResponse.items == null : this.items.equals(adAccountsCountryResponse.items));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsCountryResponse {\n");
    
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
