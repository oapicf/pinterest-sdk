package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LinkedBusiness   {

    private String imageLargeUrl;
    private String imageMediumUrl;
    private String imageSmallUrl;
    private String imageXlargeUrl;
    private String username;

    /**
     * Default constructor.
     */
    public LinkedBusiness() {
    // JSON-B / Jackson
    }

    /**
     * Create LinkedBusiness.
     *
     * @param imageLargeUrl image_large_url
     * @param imageMediumUrl image_medium_url
     * @param imageSmallUrl image_small_url
     * @param imageXlargeUrl image_xlarge_url
     * @param username Username
     */
    public LinkedBusiness(
        String imageLargeUrl, 
        String imageMediumUrl, 
        String imageSmallUrl, 
        String imageXlargeUrl, 
        String username
    ) {
        this.imageLargeUrl = imageLargeUrl;
        this.imageMediumUrl = imageMediumUrl;
        this.imageSmallUrl = imageSmallUrl;
        this.imageXlargeUrl = imageXlargeUrl;
        this.username = username;
    }



    /**
     * image_large_url
     * @return imageLargeUrl
     */
    public String getImageLargeUrl() {
        return imageLargeUrl;
    }

    public void setImageLargeUrl(String imageLargeUrl) {
        this.imageLargeUrl = imageLargeUrl;
    }

    /**
     * image_medium_url
     * @return imageMediumUrl
     */
    public String getImageMediumUrl() {
        return imageMediumUrl;
    }

    public void setImageMediumUrl(String imageMediumUrl) {
        this.imageMediumUrl = imageMediumUrl;
    }

    /**
     * image_small_url
     * @return imageSmallUrl
     */
    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    /**
     * image_xlarge_url
     * @return imageXlargeUrl
     */
    public String getImageXlargeUrl() {
        return imageXlargeUrl;
    }

    public void setImageXlargeUrl(String imageXlargeUrl) {
        this.imageXlargeUrl = imageXlargeUrl;
    }

    /**
     * Username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedBusiness {\n");
        
        sb.append("    imageLargeUrl: ").append(toIndentedString(imageLargeUrl)).append("\n");
        sb.append("    imageMediumUrl: ").append(toIndentedString(imageMediumUrl)).append("\n");
        sb.append("    imageSmallUrl: ").append(toIndentedString(imageSmallUrl)).append("\n");
        sb.append("    imageXlargeUrl: ").append(toIndentedString(imageXlargeUrl)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

