package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BulkUpsertRequestCreate;
import org.openapitools.model.BulkUpsertRequestUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */

@Schema(name = "BulkUpsertRequest", description = "Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkUpsertRequest {

  private BulkUpsertRequestCreate create;

  private BulkUpsertRequestUpdate update;

  public BulkUpsertRequest create(BulkUpsertRequestCreate create) {
    this.create = create;
    return this;
  }

  /**
   * Get create
   * @return create
  */
  @Valid 
  @Schema(name = "create", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create")
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
  */
  @Valid 
  @Schema(name = "update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

