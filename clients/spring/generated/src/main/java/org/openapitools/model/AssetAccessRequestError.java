package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetAccessRequestError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetAccessRequestError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> messages = new ArrayList<>();

  public AssetAccessRequestError code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error in requesting asset access.
   * @return code
   */
  
  @Schema(name = "code", description = "Error code associated with the error in requesting asset access.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public AssetAccessRequestError messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public AssetAccessRequestError addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   */
  
  @Schema(name = "messages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages")
  public List<String> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetAccessRequestError assetAccessRequestError = (AssetAccessRequestError) o;
    return Objects.equals(this.code, assetAccessRequestError.code) &&
        Objects.equals(this.messages, assetAccessRequestError.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetAccessRequestError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

