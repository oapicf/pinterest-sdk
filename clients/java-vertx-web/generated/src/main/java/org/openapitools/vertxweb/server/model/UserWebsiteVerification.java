package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserWebsiteVerification   {
  
  private String dnsTxtRecord;
  private String fileContent;
  private String filename;
  private String metatag;
  private String verificationCode;

  public UserWebsiteVerification () {

  }

  public UserWebsiteVerification (String dnsTxtRecord, String fileContent, String filename, String metatag, String verificationCode) {
    this.dnsTxtRecord = dnsTxtRecord;
    this.fileContent = fileContent;
    this.filename = filename;
    this.metatag = metatag;
    this.verificationCode = verificationCode;
  }

    
  @JsonProperty("dns_txt_record")
  public String getDnsTxtRecord() {
    return dnsTxtRecord;
  }
  public void setDnsTxtRecord(String dnsTxtRecord) {
    this.dnsTxtRecord = dnsTxtRecord;
  }

    
  @JsonProperty("file_content")
  public String getFileContent() {
    return fileContent;
  }
  public void setFileContent(String fileContent) {
    this.fileContent = fileContent;
  }

    
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
  }

    
  @JsonProperty("metatag")
  public String getMetatag() {
    return metatag;
  }
  public void setMetatag(String metatag) {
    this.metatag = metatag;
  }

    
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
    return Objects.equals(dnsTxtRecord, userWebsiteVerification.dnsTxtRecord) &&
        Objects.equals(fileContent, userWebsiteVerification.fileContent) &&
        Objects.equals(filename, userWebsiteVerification.filename) &&
        Objects.equals(metatag, userWebsiteVerification.metatag) &&
        Objects.equals(verificationCode, userWebsiteVerification.verificationCode);
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
