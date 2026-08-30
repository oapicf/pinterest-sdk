package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadsExports  {
  
 /**
  * ID for the leads export job.
  */
  @ApiModelProperty(example = "123456789012", value = "ID for the leads export job.")

  private String leadsExportId;
 /**
   * ID for the leads export job.
   * @return leadsExportId
  **/
  @JsonProperty("leads_export_id")
  public String getLeadsExportId() {
    return leadsExportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsExports leadsExports = (LeadsExports) o;
    return Objects.equals(this.leadsExportId, leadsExports.leadsExportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsExportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExports {\n");
    
    sb.append("    leadsExportId: ").append(toIndentedString(leadsExportId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

