package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UserWebsiteVerification   {

    private String dnsTxtRecord;
    private String fileContent;
    private String filename;
    private String metatag;
    private String verificationCode;

    /**
     * Default constructor.
     */
    public UserWebsiteVerification() {
    // JSON-B / Jackson
    }

    /**
     * Create UserWebsiteVerification.
     *
     * @param dnsTxtRecord DNS TXT record to check against for the website to be claimed
     * @param fileContent A full html file to upload to the website in order for it to be claimed
     * @param filename File expected to find on the website being claimed
     * @param metatag Metatag the verification process searchs for the website to be claimed
     * @param verificationCode Code to check against the user claiming the website
     */
    public UserWebsiteVerification(
        String dnsTxtRecord, 
        String fileContent, 
        String filename, 
        String metatag, 
        String verificationCode
    ) {
        this.dnsTxtRecord = dnsTxtRecord;
        this.fileContent = fileContent;
        this.filename = filename;
        this.metatag = metatag;
        this.verificationCode = verificationCode;
    }



    /**
     * DNS TXT record to check against for the website to be claimed
     * @return dnsTxtRecord
     */
    public String getDnsTxtRecord() {
        return dnsTxtRecord;
    }

    public void setDnsTxtRecord(String dnsTxtRecord) {
        this.dnsTxtRecord = dnsTxtRecord;
    }

    /**
     * A full html file to upload to the website in order for it to be claimed
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * File expected to find on the website being claimed
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Metatag the verification process searchs for the website to be claimed
     * @return metatag
     */
    public String getMetatag() {
        return metatag;
    }

    public void setMetatag(String metatag) {
        this.metatag = metatag;
    }

    /**
     * Code to check against the user claiming the website
     * @return verificationCode
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

