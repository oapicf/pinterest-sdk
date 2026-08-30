package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInnerStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsLocalStoresDelete200ResponseInner  {
  
 /**
  * The ID of the local store.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  private String id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CampaignAdPreviewDelete200ResponseInnerStatus status;
 /**
  * The ID of the local store.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CatalogsLocalStoresDelete200ResponseInner id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CatalogsLocalStoresDelete200ResponseInner status(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
    return this;
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
    return Objects.equals(this.id, catalogsLocalStoresDelete200ResponseInner.id) &&
        Objects.equals(this.status, catalogsLocalStoresDelete200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

