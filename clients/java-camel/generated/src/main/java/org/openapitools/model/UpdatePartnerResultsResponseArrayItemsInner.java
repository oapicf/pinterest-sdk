package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessError;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdatePartnerResultsResponseArrayItemsInner
 */

@JsonTypeName("UpdatePartnerResultsResponseArray_items_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerResultsResponseArrayItemsInner {

  private JsonNullable<BusinessAccessError> exception = JsonNullable.<BusinessAccessError>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") @Size(max = 18) String> memberOrPartnerId = JsonNullable.<String>undefined();

  public UpdatePartnerResultsResponseArrayItemsInner exception(BusinessAccessError exception) {
    this.exception = JsonNullable.of(exception);
    return this;
  }

  /**
   * Get exception
   * @return exception
   */
  @Valid 
  @Schema(name = "exception", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exception")
  public JsonNullable<BusinessAccessError> getException() {
    return exception;
  }

  public void setException(JsonNullable<BusinessAccessError> exception) {
    this.exception = exception;
  }

  public UpdatePartnerResultsResponseArrayItemsInner memberOrPartnerId(String memberOrPartnerId) {
    this.memberOrPartnerId = JsonNullable.of(memberOrPartnerId);
    return this;
  }

  /**
   * Get memberOrPartnerId
   * @return memberOrPartnerId
   */
  @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "member_or_partner_id", example = "1234567890123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member_or_partner_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") @Size(max = 18) String> getMemberOrPartnerId() {
    return memberOrPartnerId;
  }

  public void setMemberOrPartnerId(JsonNullable<String> memberOrPartnerId) {
    this.memberOrPartnerId = memberOrPartnerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePartnerResultsResponseArrayItemsInner updatePartnerResultsResponseArrayItemsInner = (UpdatePartnerResultsResponseArrayItemsInner) o;
    return equalsNullable(this.exception, updatePartnerResultsResponseArrayItemsInner.exception) &&
        equalsNullable(this.memberOrPartnerId, updatePartnerResultsResponseArrayItemsInner.memberOrPartnerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(exception), hashCodeNullable(memberOrPartnerId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerResultsResponseArrayItemsInner {\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    memberOrPartnerId: ").append(toIndentedString(memberOrPartnerId)).append("\n");
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

