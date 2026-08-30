package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UserWebsiteVerification   {
  
  private String dnsTxtRecord;

  private String fileContent;

  private String filename;

  private String metatag;

  private String verificationCode;

  /**
   * DNS TXT record to check against for the website to be claimed
   **/
  public UserWebsiteVerification dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  
  @ApiModelProperty(value = "DNS TXT record to check against for the website to be claimed")
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }
  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }


  /**
   * A full html file to upload to the website in order for it to be claimed
   **/
  public UserWebsiteVerification fileContent(String fileContent) {
    this.fileContent = fileContent;
    return this;
  }

  
  @ApiModelProperty(value = "A full html file to upload to the website in order for it to be claimed")
  @JsonProperty("file_content")
  public String getFileContent() {
    return fileContent;
  }
  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }


  /**
   * File expected to find on the website being claimed
   **/
  public UserWebsiteVerification filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(value = "File expected to find on the website being claimed")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Metatag the verification process searchs for the website to be claimed
   **/
  public UserWebsiteVerification metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

  
  @ApiModelProperty(value = "Metatag the verification process searchs for the website to be claimed")
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }
  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }


  /**
   * Code to check against the user claiming the website
   **/
  public UserWebsiteVerification verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  
  @ApiModelProperty(value = "Code to check against the user claiming the website")
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

