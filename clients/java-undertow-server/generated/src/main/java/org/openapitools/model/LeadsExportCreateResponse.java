/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadsExportCreateResponse   {
  
  private String leadsExportId;

  /**
   * ID for the leads export job
   */
  public LeadsExportCreateResponse leadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
    return this;
  }

  
  @ApiModelProperty(example = "123456789012", value = "ID for the leads export job")
  @JsonProperty("leads_export_id")
  public String getLeadsExportId() {
    return leadsExportId;
  }
  public void setLeadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExportCreateResponse leadsExportCreateResponse = (LeadsExportCreateResponse) o;
    return Objects.equals(leadsExportId, leadsExportCreateResponse.leadsExportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsExportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportCreateResponse {\n");
    
    sb.append("    leadsExportId: ").append(toIndentedString(leadsExportId)).append("\n");
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

