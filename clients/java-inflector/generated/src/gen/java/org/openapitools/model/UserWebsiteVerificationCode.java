package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserWebsiteVerificationCode   {
  @JsonProperty("verification_code")
  private String verificationCode;

  @JsonProperty("dns_txt_record")
  private String dnsTxtRecord;

  @JsonProperty("metatag")
  private String metatag;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("file_content")
  private String fileContent;

  /**
   * Code to check against the user claiming the website
   **/
  public UserWebsiteVerificationCode verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

  
  @ApiModelProperty(example = "e1edcc1a43976c646367e9c6c9a9b7b6", value = "Code to check against the user claiming the website")
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }
  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

  /**
   * DNS TXT record to check against for the website to be claimed
   **/
  public UserWebsiteVerificationCode dnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
    return this;
  }

  
  @ApiModelProperty(example = "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6", value = "DNS TXT record to check against for the website to be claimed")
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }
  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

  /**
   * Metatag the verification process searchs for the website to be claimed
   **/
  public UserWebsiteVerificationCode metatag(String metatag) {
    this.metatag = metatag;
    return this;
  }

  
  @ApiModelProperty(example = "<meta name=\"p:domain_verify\" content=\"e1edcc1a43976c646367e9c6c9a9b7b6\"/>", value = "Metatag the verification process searchs for the website to be claimed")
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }
  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

  /**
   * File expected to find on the website being claimed
   **/
  public UserWebsiteVerificationCode filename(String filename) {
    this.filename = filename;
    return this;
  }

  
  @ApiModelProperty(example = "pinterest-e1edc.html", value = "File expected to find on the website being claimed")
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * A full html file to upload to the website in order for it to be claimed
   **/
  public UserWebsiteVerificationCode fileContent(String fileContent) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserWebsiteVerificationCode userWebsiteVerificationCode = (UserWebsiteVerificationCode) o;
    return Objects.equals(verificationCode, userWebsiteVerificationCode.verificationCode) &&
        Objects.equals(dnsTxtRecord, userWebsiteVerificationCode.dnsTxtRecord) &&
        Objects.equals(metatag, userWebsiteVerificationCode.metatag) &&
        Objects.equals(filename, userWebsiteVerificationCode.filename) &&
        Objects.equals(fileContent, userWebsiteVerificationCode.fileContent);
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

