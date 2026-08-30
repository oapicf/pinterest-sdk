package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Product tag request item containing the pin_id of the product to tag.
 */

@Schema(name = "ProductTagItem", description = "Product tag request item containing the pin_id of the product to tag.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductTagItem {

  private String pinId;

  public ProductTagItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductTagItem(String pinId) {
    this.pinId = pinId;
  }

  public ProductTagItem pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID of the product pin to tag onto the hero pin.
   * @return pinId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", description = "Pin ID of the product pin to tag onto the hero pin.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTagItem productTagItem = (ProductTagItem) o;
    return Objects.equals(this.pinId, productTagItem.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTagItem {\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

