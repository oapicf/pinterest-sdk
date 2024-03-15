package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.BulkUpsertRequestCreate;
import org.openapitools.server.api.model.BulkUpsertRequestUpdate;

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkUpsertRequest   {
  
  private BulkUpsertRequestCreate create;
  private BulkUpsertRequestUpdate update;

  public BulkUpsertRequest () {

  }

  public BulkUpsertRequest (BulkUpsertRequestCreate create, BulkUpsertRequestUpdate update) {
    this.create = create;
    this.update = update;
  }

    
  @JsonProperty("create")
  public BulkUpsertRequestCreate getCreate() {
    return create;
  }
  public void setCreate(BulkUpsertRequestCreate create) {
    this.create = create;
  }

    
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
    return Objects.equals(create, bulkUpsertRequest.create) &&
        Objects.equals(update, bulkUpsertRequest.update);
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
