package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.RelatedTerms

class TermsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def termsRelatedList ( List<String> terms, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/terms/related"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (terms == null) {
            throw new RuntimeException("missing required params terms")
        }

        if (terms != null) {
            queryParams.put("terms", terms)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    RelatedTerms.class )

    }

    def termsSuggestedList ( String term, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/terms/suggested"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (term == null) {
            throw new RuntimeException("missing required params term")
        }

        if (term != null) {
            queryParams.put("term", term)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    String.class )

    }

}
