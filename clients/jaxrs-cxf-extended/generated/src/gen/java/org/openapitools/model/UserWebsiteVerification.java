package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserWebsiteVerification  {
  
 /**
  * DNS TXT record to check against for the website to be claimed
  */
  @ApiModelProperty(value = "DNS TXT record to check against for the website to be claimed")
  private String dnsTxtRecord;

 /**
  * A full html file to upload to the website in order for it to be claimed
  */
  @ApiModelProperty(value = "A full html file to upload to the website in order for it to be claimed")
  private String fileContent;

 /**
  * File expected to find on the website being claimed
  */
  @ApiModelProperty(value = "File expected to find on the website being claimed")
  private String filename;

 /**
  * Metatag the verification process searchs for the website to be claimed
  */
  @ApiModelProperty(value = "Metatag the verification process searchs for the website to be claimed")
  private String metatag;

 /**
  * Code to check against the user claiming the website
  */
  @ApiModelProperty(value = "Code to check against the user claiming the website")
  private String verificationCode;
 /**
  * DNS TXT record to check against for the website to be claimed
  * @return dnsTxtRecord
  */
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  /**
   * Sets the <code>dnsTxtRecord</code> property.
   */
 public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  /**
   * Sets the <code>dnsTxtRecord</code> property.
   */
  public UserWebsiteVerification dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

 /**
  * A full html file to upload to the website in order for it to be claimed
  * @return fileContent
  */
  @JsonProperty("file_content")
  public String getFileContent() {
    return fileContent;
  }

  /**
   * Sets the <code>fileContent</code> property.
   */
 public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  /**
   * Sets the <code>fileContent</code> property.
   */
  public UserWebsiteVerification fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

 /**
  * File expected to find on the website being claimed
  * @return filename
  */
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
 public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * Sets the <code>filename</code> property.
   */
  public UserWebsiteVerification filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
  * Metatag the verification process searchs for the website to be claimed
  * @return metatag
  */
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }

  /**
   * Sets the <code>metatag</code> property.
   */
 public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

  /**
   * Sets the <code>metatag</code> property.
   */
  public UserWebsiteVerification metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

 /**
  * Code to check against the user claiming the website
  * @return verificationCode
  */
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }

  /**
   * Sets the <code>verificationCode</code> property.
   */
 public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  /**
   * Sets the <code>verificationCode</code> property.
   */
  public UserWebsiteVerification verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

