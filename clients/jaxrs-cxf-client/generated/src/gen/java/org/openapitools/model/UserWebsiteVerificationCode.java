package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserWebsiteVerificationCode  {
  
  @ApiModelProperty(example = "e1edcc1a43976c646367e9c6c9a9b7b6", value = "Code to check against the user claiming the website")
 /**
   * Code to check against the user claiming the website
  **/
  private String verificationCode;

  @ApiModelProperty(example = "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6", value = "DNS TXT record to check against for the website to be claimed")
 /**
   * DNS TXT record to check against for the website to be claimed
  **/
  private String dnsTxtRecord;

  @ApiModelProperty(example = "<meta name=\"p:domain_verify\" content=\"e1edcc1a43976c646367e9c6c9a9b7b6\"/>", value = "Metatag the verification process searchs for the website to be claimed")
 /**
   * Metatag the verification process searchs for the website to be claimed
  **/
  private String metatag;

  @ApiModelProperty(example = "pinterest-e1edc.html", value = "File expected to find on the website being claimed")
 /**
   * File expected to find on the website being claimed
  **/
  private String filename;

  @ApiModelProperty(value = "A full html file to upload to the website in order for it to be claimed")
 /**
   * A full html file to upload to the website in order for it to be claimed
  **/
  private String fileContent;
 /**
   * Code to check against the user claiming the website
   * @return verificationCode
  **/
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }

  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  public UserWebsiteVerificationCode verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

 /**
   * DNS TXT record to check against for the website to be claimed
   * @return dnsTxtRecord
  **/
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }

  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  public UserWebsiteVerificationCode dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

 /**
   * Metatag the verification process searchs for the website to be claimed
   * @return metatag
  **/
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }

  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

  public UserWebsiteVerificationCode metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

 /**
   * File expected to find on the website being claimed
   * @return filename
  **/
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public UserWebsiteVerificationCode filename(String filename) {
    this.filename = filename;
    return this;
  }

 /**
   * A full html file to upload to the website in order for it to be claimed
   * @return fileContent
  **/
  @JsonProperty("file_content")
  public String getFileContent() {
    return fileContent;
  }

  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

  public UserWebsiteVerificationCode fileContent(String fileContent) {
    this.fileContent = fileContent;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

