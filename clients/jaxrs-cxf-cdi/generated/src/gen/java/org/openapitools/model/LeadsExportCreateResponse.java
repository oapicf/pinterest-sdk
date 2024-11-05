package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LeadsExportCreateResponse   {
  
  private String leadsExportId;

  /**
   * ID for the leads export job
   **/
  public LeadsExportCreateResponse leadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
    return this;
  }

  
  @ApiModelProperty(example = "123456789012", value = "ID for the leads export job")
  @JsonProperty("leads_export_id")
 @Pattern(regexp="^\\d+$")  public String getLeadsExportId() {
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
    return Objects.equals(this.leadsExportId, leadsExportCreateResponse.leadsExportId);
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

