package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserWebsiteVerificationCode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserWebsiteVerificationCode {

  private String verificationCode;

  private String dnsTxtRecord;

  private String metatag;

  private String filename;

  private String fileContent;

  public UserWebsiteVerificationCode verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  /**
   * Code to check against the user claiming the website
   * @return verificationCode
  */
  
  @Schema(name = "verification_code", example = "e1edcc1a43976c646367e9c6c9a9b7b6", description = "Code to check against the user claiming the website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public UserWebsiteVerificationCode dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  /**
   * DNS TXT record to check against for the website to be claimed
   * @return dnsTxtRecord
  */
  
  @Schema(name = "dns_txt_record", example = "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6", description = "DNS TXT record to check against for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  public UserWebsiteVerificationCode metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

  /**
   * Metatag the verification process searchs for the website to be claimed
   * @return metatag
  */
  
  @Schema(name = "metatag", example = "<meta name=\"p:domain_verify\" content=\"e1edcc1a43976c646367e9c6c9a9b7b6\"/>", description = "Metatag the verification process searchs for the website to be claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }

  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

  public UserWebsiteVerificationCode filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * File expected to find on the website being claimed
   * @return filename
  */
  
  @Schema(name = "filename", example = "pinterest-e1edc.html", description = "File expected to find on the website being claimed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UserWebsiteVerificationCode fileContent(String fileContent) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsiteVerificationCode userWebsiteVerificationCode = (UserWebsiteVerificationCode) o;
    return Objects.equals(this.verificationCode, userWebsiteVerificationCode.verificationCode) &&
        Objects.equals(this.dnsTxtRecord, userWebsiteVerificationCode.dnsTxtRecord) &&
        Objects.equals(this.metatag, userWebsiteVerificationCode.metatag) &&
        Objects.equals(this.filename, userWebsiteVerificationCode.filename) &&
        Objects.equals(this.fileContent, userWebsiteVerificationCode.fileContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationCode, dnsTxtRecord, metatag, filename, fileContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserWebsiteVerificationCode {\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    dnsTxtRecord: ").append(toIndentedString(dnsTxtRecord)).append("\n");
    sb.append("    metatag: ").append(toIndentedString(metatag)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
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

