package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BulkUpsertRequestCreate;
import com.prokarma.pkmst.model.BulkUpsertRequestUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
@ApiModel(description = "Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequest   {
  @JsonProperty("create")
  private BulkUpsertRequestCreate create;

  @JsonProperty("update")
  private BulkUpsertRequestUpdate update;

  public BulkUpsertRequest create(BulkUpsertRequestCreate create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(value = "")
  public BulkUpsertRequestCreate getCreate() {
    return create;
  }

  public void setCreate(BulkUpsertRequestCreate create) {
    this.create = create;
  }

  public BulkUpsertRequest update(BulkUpsertRequestUpdate update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
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

