package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteVerification {

  private String dnsTxtRecord;

  private String fileContent;

  private String filename;

  private String metatag;

  private String verificationCode;

  public UserWebsiteVerification dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  /**
   * DNS TXT record to check against for the website to be claimed
   * @return dnsTxtRecord
   */
  
  @Schema(name = "dns_txt_record", description = "DNS TXT record to check against for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  public UserWebsiteVerification fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

  /**
   * A full html file to upload to the website in order for it to be claimed
   * @return fileContent
   */
  
  @Schema(name = "file_content", description = "A full html file to upload to the website in order for it to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_content")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  public UserWebsiteVerification filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * File expected to find on the website being claimed
   * @return filename
   */
  
  @Schema(name = "filename", description = "File expected to find on the website being claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UserWebsiteVerification metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

  /**
   * Metatag the verification process searchs for the website to be claimed
   * @return metatag
   */
  
  @Schema(name = "metatag", description = "Metatag the verification process searchs for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }

  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

  public UserWebsiteVerification verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  /**
   * Code to check against the user claiming the website
   * @return verificationCode
   */
  
  @Schema(name = "verification_code", description = "Code to check against the user claiming the website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

