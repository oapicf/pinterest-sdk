package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Board
import org.openapitools.model.BoardCreate
import org.openapitools.model.BoardPrivacyFilter
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardSectionsList200Response
import org.openapitools.model.BoardWithUpdatePrivacy
import org.openapitools.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.model.BoardsList200Response
import org.openapitools.model.BoardsListPins200Response
import org.openapitools.model.CreativeType
import org.openapitools.model.Error
import org.openapitools.model.PinterestLibError

class BoardsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def boardSectionsCreate ( String boardId, BoardSection boardSection, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/sections"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }
        // verify required params are set
        if (boardSection == null) {
            throw new RuntimeException("missing required params boardSection")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = boardSection


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    BoardSection.class )

    }

    def boardSectionsDelete ( String boardId, String sectionId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/sections/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def boardSectionsList ( String boardId, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/sections"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BoardSectionsList200Response.class )

    }

    def boardSectionsListPins ( String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/sections/${section_id}/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BoardsListPins200Response.class )

    }

    def boardSectionsUpdate ( String boardId, String sectionId, BoardSection boardSection, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/sections/${section_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }
        // verify required params are set
        if (sectionId == null) {
            throw new RuntimeException("missing required params sectionId")
        }
        // verify required params are set
        if (boardSection == null) {
            throw new RuntimeException("missing required params boardSection")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = boardSection


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BoardSection.class )

    }

    def boardsCreate ( BoardCreate boardCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardCreate == null) {
            throw new RuntimeException("missing required params boardCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = boardCreate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Board.class )

    }

    def boardsDelete ( String boardId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def boardsGet ( String boardId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Board.class )

    }

    def boardsList ( String adAccountId, BoardPrivacyFilter privacy, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (privacy != null) {
            queryParams.put("privacy", privacy)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BoardsList200Response.class )

    }

    def boardsListPins ( String boardId, String bookmark, Integer pageSize, List<CreativeType> creativeTypes, String adAccountId, Boolean pinMetrics, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (creativeTypes != null) {
            queryParams.put("creative_types", creativeTypes)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BoardsListPins200Response.class )

    }

    def boardsUpdate ( String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards/${board_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (boardId == null) {
            throw new RuntimeException("missing required params boardId")
        }
        // verify required params are set
        if (boardWithUpdatePrivacyUpdate == null) {
            throw new RuntimeException("missing required params boardWithUpdatePrivacyUpdate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = boardWithUpdatePrivacyUpdate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BoardWithUpdatePrivacy.class )

    }

}
