/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASException
 */
public class OASException {
    /**
     * Exception error code.
     * @return code
     */
    public Integer code { get; set; }

    /**
     * Exception message.
     * @return message
     */
    public String message { get; set; }

    public static OASException getExample() {
        OASException r_exception = new OASException();
          r_exception.code = 2;
          r_exception.message = 'Advertiser not found.';
        return r_exception;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASException) {           
            OASException r_exception = (OASException) obj;
            return this.code == r_exception.code
                && this.message == r_exception.message;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        return hashCode;
    }
}
