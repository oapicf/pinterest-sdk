package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserWebsiteVerificationCode   {
  
  private String verificationCode;
  private String dnsTxtRecord;
  private String metatag;
  private String filename;
  private String fileContent;

  public UserWebsiteVerificationCode () {

  }

  public UserWebsiteVerificationCode (String verificationCode, String dnsTxtRecord, String metatag, String filename, String fileContent) {
    this.verificationCode = verificationCode;
    this.dnsTxtRecord = dnsTxtRecord;
    this.metatag = metatag;
    this.filename = filename;
    this.fileContent = fileContent;
  }

    
  @JsonProperty("verification_code")
  public String getVerificationCode() {
    return verificationCode;
  }
  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }

    
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }
  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

    
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }
  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

    
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

    
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
