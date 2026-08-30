package org.openapitools.model;

import org.openapitools.model.BulkUpsertRequestCreate;
import org.openapitools.model.BulkUpsertRequestUpdate;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
public class BulkUpsertRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("create")
  private BulkUpsertRequestCreate create;

  @JsonProperty("update")
  private BulkUpsertRequestUpdate update;

  /**
   * 
   * @return create
   */
  public BulkUpsertRequestCreate getCreate() {
    return create;
  }

  public void setCreate(BulkUpsertRequestCreate create) {
    this.create = create;
  }

  /**
   * 
   * @return update
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
