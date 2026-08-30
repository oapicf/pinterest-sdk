package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssetGroupDeleteError   {

    private String assetGroupId;
    private Integer code;
    private String message;

    /**
     * Default constructor.
     */
    public AssetGroupDeleteError() {
    // JSON-B / Jackson
    }

    /**
     * Create AssetGroupDeleteError.
     *
     * @param assetGroupId Asset group id of the exception.
     * @param code Error code associated with the error deleting asset group.
     * @param message Error message associated with the error deleting asset group.
     */
    public AssetGroupDeleteError(
        String assetGroupId, 
        Integer code, 
        String message
    ) {
        this.assetGroupId = assetGroupId;
        this.code = code;
        this.message = message;
    }



    /**
     * Asset group id of the exception.
     * @return assetGroupId
     */
    public String getAssetGroupId() {
        return assetGroupId;
    }

    public void setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
    }

    /**
     * Error code associated with the error deleting asset group.
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Error message associated with the error deleting asset group.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetGroupDeleteError {\n");
        
        sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

