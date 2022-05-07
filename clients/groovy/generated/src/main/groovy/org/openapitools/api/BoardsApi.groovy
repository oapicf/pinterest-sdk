package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Board
import org.openapitools.model.BoardSection
import org.openapitools.model.BoardUpdate
import org.openapitools.model.Error
import org.openapitools.model.Paginated

class BoardsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def boardSectionsCreate ( String boardId, BoardSection boardSection, Closure onSuccess, Closure onFailure)  {
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



        contentType = 'application/json';
        bodyParams = boardSection


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    BoardSection.class )

    }

    def boardSectionsDelete ( String boardId, String sectionId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def boardSectionsList ( String boardId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
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

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def boardSectionsListPins ( String boardId, String sectionId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
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

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def boardSectionsUpdate ( String boardId, String sectionId, BoardSection boardSection, Closure onSuccess, Closure onFailure)  {
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



        contentType = 'application/json';
        bodyParams = boardSection


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BoardSection.class )

    }

    def boardsCreate ( Board board, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (board == null) {
            throw new RuntimeException("missing required params board")
        }



        contentType = 'application/json';
        bodyParams = board


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Board.class )

    }

    def boardsDelete ( String boardId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def boardsGet ( String boardId, Closure onSuccess, Closure onFailure)  {
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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Board.class )

    }

    def boardsList ( String bookmark, Integer pageSize, String privacy, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/boards"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (privacy != null) {
            queryParams.put("privacy", privacy)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def boardsListPins ( String boardId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Paginated.class )

    }

    def boardsUpdate ( String boardId, BoardUpdate boardUpdate, Closure onSuccess, Closure onFailure)  {
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
        if (boardUpdate == null) {
            throw new RuntimeException("missing required params boardUpdate")
        }



        contentType = 'application/json';
        bodyParams = boardUpdate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    Board.class )

    }

}
