package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkUpsertRequestCreate;
import org.openapitools.model.BulkUpsertRequestUpdate;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.")
public class BulkUpsertRequest   {
  
  private BulkUpsertRequestCreate create;

  private BulkUpsertRequestUpdate update;

  /**
   **/
  public BulkUpsertRequest create(BulkUpsertRequestCreate create) {
    this.create = create;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("create")
  public BulkUpsertRequestCreate getCreate() {
    return create;
  }
  public void setCreate(BulkUpsertRequestCreate create) {
    this.create = create;
  }


  /**
   **/
  public BulkUpsertRequest update(BulkUpsertRequestUpdate update) {
    this.update = update;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("update")
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
    return Objects.equals(this.create, bulkUpsertRequest.create) &&
        Objects.equals(this.update, bulkUpsertRequest.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, update);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertRequest {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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

