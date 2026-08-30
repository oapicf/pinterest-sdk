package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UserWebsiteVerification
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserWebsiteVerification   {
  @JsonProperty("dns_txt_record")
  private String dnsTxtRecord;

  @JsonProperty("file_content")
  private String fileContent;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("metatag")
  private String metatag;

  @JsonProperty("verification_code")
  private String verificationCode;

  public UserWebsiteVerification dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  /**
   * DNS TXT record to check against for the website to be claimed
   * @return dnsTxtRecord
   */
  @ApiModelProperty(value = "DNS TXT record to check against for the website to be claimed")
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
  @ApiModelProperty(value = "A full html file to upload to the website in order for it to be claimed")
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
  @ApiModelProperty(value = "File expected to find on the website being claimed")
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
  @ApiModelProperty(value = "Metatag the verification process searchs for the website to be claimed")
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
  @ApiModelProperty(value = "Code to check against the user claiming the website")
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

