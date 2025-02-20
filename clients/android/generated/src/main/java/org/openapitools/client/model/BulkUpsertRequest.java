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

import org.openapitools.client.model.BulkUpsertRequestCreate;
import org.openapitools.client.model.BulkUpsertRequestUpdate;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 **/
@ApiModel(description = "Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.")
public class BulkUpsertRequest {
  
  @SerializedName("create")
  private BulkUpsertRequestCreate create = null;
  @SerializedName("update")
  private BulkUpsertRequestUpdate update = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BulkUpsertRequestCreate getCreate() {
    return create;
  }
  public void setCreate(BulkUpsertRequestCreate create) {
    this.create = create;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BulkUpsertRequestUpdate getUpdate() {
    return update;
  }
  public void setUpdate(BulkUpsertRequestUpdate update) {
    this.update = update;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpsertRequest bulkUpsertRequest = (BulkUpsertRequest) o;
    return (this.create == null ? bulkUpsertRequest.create == null : this.create.equals(bulkUpsertRequest.create)) &&
        (this.update == null ? bulkUpsertRequest.update == null : this.update.equals(bulkUpsertRequest.update));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.create == null ? 0: this.create.hashCode());
    result = 31 * result + (this.update == null ? 0: this.update.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequest {\n");
    
    sb.append("  create: ").append(create).append("\n");
    sb.append("  update: ").append(update).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
