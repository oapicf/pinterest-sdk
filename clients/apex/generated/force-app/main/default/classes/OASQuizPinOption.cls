/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 *  This field contains multiple options to a quiz question.
 */
public class OASQuizPinOption {
    /**
     * Get id
     * @return id
     */
    public Double id { get; set; }

    /**
     * Get text
     * @return text
     */
    public String text { get; set; }

    public static OASQuizPinOption getExample() {
        OASQuizPinOption quizPinOption = new OASQuizPinOption();
          quizPinOption.id = 1.3579;
          quizPinOption.text = '';
        return quizPinOption;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASQuizPinOption) {           
            OASQuizPinOption quizPinOption = (OASQuizPinOption) obj;
            return this.id == quizPinOption.id
                && this.text == quizPinOption.text;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (text == null ? 0 : System.hashCode(text));
        return hashCode;
    }
}

