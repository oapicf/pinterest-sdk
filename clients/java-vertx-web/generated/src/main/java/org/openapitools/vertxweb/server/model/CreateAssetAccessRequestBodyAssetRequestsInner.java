package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.Permissions;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetAccessRequestBodyAssetRequestsInner   {
  
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
  private String partnerId;

  public CreateAssetAccessRequestBodyAssetRequestsInner () {

  }

  public CreateAssetAccessRequestBodyAssetRequestsInner (Map<String, List<Permissions>> assetIdToPermissions, String partnerId) {
    this.assetIdToPermissions = assetIdToPermissions;
    this.partnerId = partnerId;
  }

    
  @JsonProperty("asset_id_to_permissions")
  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }
  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

    
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestBodyAssetRequestsInner createAssetAccessRequestBodyAssetRequestsInner = (CreateAssetAccessRequestBodyAssetRequestsInner) o;
    return Objects.equals(assetIdToPermissions, createAssetAccessRequestBodyAssetRequestsInner.assetIdToPermissions) &&
        Objects.equals(partnerId, createAssetAccessRequestBodyAssetRequestsInner.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdToPermissions, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestBodyAssetRequestsInner {\n");
    
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
