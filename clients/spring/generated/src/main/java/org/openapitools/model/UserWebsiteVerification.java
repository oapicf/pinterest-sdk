package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * UserWebsiteVerification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteVerification {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String dnsTxtRecord;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String fileContent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String filename;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String metatag;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String verificationCode;

  public UserWebsiteVerification dnsTxtRecord(@Nullable String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  /**
   * DNS TXT record to check against for the website to be claimed
   * @return dnsTxtRecord
   */
  
  @Schema(name = "dns_txt_record", description = "DNS TXT record to check against for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dns_txt_record")
  public @Nullable String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  @JsonProperty("dns_txt_record")
  public void setDnsTxtRecord(@Nullable String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  public UserWebsiteVerification fileContent(@Nullable String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

  /**
   * A full html file to upload to the website in order for it to be claimed
   * @return fileContent
   */
  
  @Schema(name = "file_content", description = "A full html file to upload to the website in order for it to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_content")
  public @Nullable String getFileContent() {
    return fileContent;
  }

  @JsonProperty("file_content")
  public void setFileContent(@Nullable String fileContent) {
    this.fileContent = fileContent;
  }

  public UserWebsiteVerification filename(@Nullable String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * File expected to find on the website being claimed
   * @return filename
   */
  
  @Schema(name = "filename", description = "File expected to find on the website being claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public @Nullable String getFilename() {
    return filename;
  }

  @JsonProperty("filename")
  public void setFilename(@Nullable String filename) {
    this.filename = filename;
  }

  public UserWebsiteVerification metatag(@Nullable String metatag) {
    this.metatag = metatag;
    return this;
  }

  /**
   * Metatag the verification process searchs for the website to be claimed
   * @return metatag
   */
  
  @Schema(name = "metatag", description = "Metatag the verification process searchs for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metatag")
  public @Nullable String getMetatag() {
    return metatag;
  }

  @JsonProperty("metatag")
  public void setMetatag(@Nullable String metatag) {
    this.metatag = metatag;
  }

  public UserWebsiteVerification verificationCode(@Nullable String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  /**
   * Code to check against the user claiming the website
   * @return verificationCode
   */
  
  @Schema(name = "verification_code", description = "Code to check against the user claiming the website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_code")
  public @Nullable String getVerificationCode() {
    return verificationCode;
  }

  @JsonProperty("verification_code")
  public void setVerificationCode(@Nullable String verificationCode) {
    this.verificationCode = verificationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsiteVerification userWebsiteVerification = (UserWebsiteVerification) o;
    return Objects.equals(this.dnsTxtRecord, userWebsiteVerification.dnsTxtRecord) &&
        Objects.equals(this.fileContent, userWebsiteVerification.fileContent) &&
        Objects.equals(this.filename, userWebsiteVerification.filename) &&
        Objects.equals(this.metatag, userWebsiteVerification.metatag) &&
        Objects.equals(this.verificationCode, userWebsiteVerification.verificationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsTxtRecord, fileContent, filename, metatag, verificationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteVerification {\n");
    sb.append("    dnsTxtRecord: ").append(toIndentedString(dnsTxtRecord)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    metatag: ").append(toIndentedString(metatag)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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

