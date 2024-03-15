package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UserWebsiteVerificationCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public UserWebsiteVerificationCode verificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * Code to check against the user claiming the website
   * @return verificationCode
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

