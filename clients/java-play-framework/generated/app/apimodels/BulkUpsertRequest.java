package apimodels;

import apimodels.BulkUpsertRequestCreate;
import apimodels.BulkUpsertRequestUpdate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkUpsertRequest   {
  @JsonProperty("create")
  @Valid

  private BulkUpsertRequestCreate create;

  @JsonProperty("update")
  @Valid

  private BulkUpsertRequestUpdate update;

  public BulkUpsertRequest create(BulkUpsertRequestCreate create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

