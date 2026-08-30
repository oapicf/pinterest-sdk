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
 * CatalogsLocalStoresDelete200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsLocalStoresDelete200ResponseInner   {
  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("status")
  @NotNull
@Valid

  private CampaignAdPreviewDelete200ResponseInnerStatus status;

  public CatalogsLocalStoresDelete200ResponseInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the local store.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsLocalStoresDelete200ResponseInner status(CampaignAdPreviewDelete200ResponseInnerStatus status) {
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
    CatalogsLocalStoresDelete200ResponseInner catalogsLocalStoresDelete200ResponseInner = (CatalogsLocalStoresDelete200ResponseInner) o;
    return Objects.equals(id, catalogsLocalStoresDelete200ResponseInner.id) &&
        Objects.equals(status, catalogsLocalStoresDelete200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresDelete200ResponseInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

