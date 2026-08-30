package apimodels;

import apimodels.CampaignAdPreviewDelete200ResponseInnerStatus;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CampaignAdPreviewDelete200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignAdPreviewDelete200ResponseInner   {
  @JsonProperty("status")
  @NotNull
@Valid

  private CampaignAdPreviewDelete200ResponseInnerStatus status;

  public CampaignAdPreviewDelete200ResponseInner status(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
    return status;
  }

  public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewDelete200ResponseInner campaignAdPreviewDelete200ResponseInner = (CampaignAdPreviewDelete200ResponseInner) o;
    return Objects.equals(status, campaignAdPreviewDelete200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewDelete200ResponseInner {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

