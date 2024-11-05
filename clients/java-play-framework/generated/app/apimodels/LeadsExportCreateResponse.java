package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LeadsExportCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadsExportCreateResponse   {
  @JsonProperty("leads_export_id")
  @Pattern(regexp="^\\d+$")

  private String leadsExportId;

  public LeadsExportCreateResponse leadsExportId(String leadsExportId) {
    this.leadsExportId = leadsExportId;
    return this;
  }

   /**
   * ID for the leads export job
   * @return leadsExportId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

