namespace OpenAPI

open OpenAPI.Model.Board
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardSectionsList200Response
open OpenAPI.Model.BoardUpdate
open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.BoardsListPins200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module BoardsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type BoardSectionsCreatePathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardSectionsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BoardSectionsCreateBodyParams = BoardSection
    //#endregion


    type BoardSectionsCreateStatusCode201Response = {
      content:BoardSection;
      
    }

    type BoardSectionsCreateStatusCode400Response = {
      content:Error;
      
    }

    type BoardSectionsCreateStatusCode403Response = {
      content:Error;
      
    }

    type BoardSectionsCreateStatusCode409Response = {
      content:Error;
      
    }

    type BoardSectionsCreateStatusCode500Response = {
      content:Error;
      
    }

    type BoardSectionsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardSectionsCreateResult = BoardSectionsCreateStatusCode201 of BoardSectionsCreateStatusCode201Response|BoardSectionsCreateStatusCode400 of BoardSectionsCreateStatusCode400Response|BoardSectionsCreateStatusCode403 of BoardSectionsCreateStatusCode403Response|BoardSectionsCreateStatusCode409 of BoardSectionsCreateStatusCode409Response|BoardSectionsCreateStatusCode500 of BoardSectionsCreateStatusCode500Response|BoardSectionsCreateDefaultStatusCode of BoardSectionsCreateDefaultStatusCodeResponse

    type BoardSectionsCreateArgs = {
      pathParams:BoardSectionsCreatePathParams;
      queryParams:Result<BoardSectionsCreateQueryParams,string>;
      bodyParams:BoardSectionsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardSectionsDeletePathParams = {
      boardId : string ;
    //#endregion
      sectionId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardSectionsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type BoardSectionsDeleteStatusCode204Response = {
      content:string;
      
    }

    type BoardSectionsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type BoardSectionsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type BoardSectionsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type BoardSectionsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardSectionsDeleteResult = BoardSectionsDeleteStatusCode204 of BoardSectionsDeleteStatusCode204Response|BoardSectionsDeleteStatusCode403 of BoardSectionsDeleteStatusCode403Response|BoardSectionsDeleteStatusCode404 of BoardSectionsDeleteStatusCode404Response|BoardSectionsDeleteStatusCode409 of BoardSectionsDeleteStatusCode409Response|BoardSectionsDeleteDefaultStatusCode of BoardSectionsDeleteDefaultStatusCodeResponse

    type BoardSectionsDeleteArgs = {
      pathParams:BoardSectionsDeletePathParams;
      queryParams:Result<BoardSectionsDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardSectionsListPathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardSectionsListQueryParams = {
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BoardSectionsListStatusCode200Response = {
      content:BoardSectionsList200Response;
      
    }

    type BoardSectionsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardSectionsListResult = BoardSectionsListStatusCode200 of BoardSectionsListStatusCode200Response|BoardSectionsListDefaultStatusCode of BoardSectionsListDefaultStatusCodeResponse

    type BoardSectionsListArgs = {
      pathParams:BoardSectionsListPathParams;
      queryParams:Result<BoardSectionsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardSectionsListPinsPathParams = {
      boardId : string ;
    //#endregion
      sectionId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardSectionsListPinsQueryParams = {
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BoardSectionsListPinsStatusCode200Response = {
      content:BoardsListPins200Response;
      
    }

    type BoardSectionsListPinsStatusCode403Response = {
      content:Error;
      
    }

    type BoardSectionsListPinsStatusCode404Response = {
      content:Error;
      
    }

    type BoardSectionsListPinsStatusCode409Response = {
      content:Error;
      
    }

    type BoardSectionsListPinsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardSectionsListPinsResult = BoardSectionsListPinsStatusCode200 of BoardSectionsListPinsStatusCode200Response|BoardSectionsListPinsStatusCode403 of BoardSectionsListPinsStatusCode403Response|BoardSectionsListPinsStatusCode404 of BoardSectionsListPinsStatusCode404Response|BoardSectionsListPinsStatusCode409 of BoardSectionsListPinsStatusCode409Response|BoardSectionsListPinsDefaultStatusCode of BoardSectionsListPinsDefaultStatusCodeResponse

    type BoardSectionsListPinsArgs = {
      pathParams:BoardSectionsListPinsPathParams;
      queryParams:Result<BoardSectionsListPinsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardSectionsUpdatePathParams = {
      boardId : string ;
    //#endregion
      sectionId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardSectionsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BoardSectionsUpdateBodyParams = BoardSection
    //#endregion


    type BoardSectionsUpdateStatusCode200Response = {
      content:BoardSection;
      
    }

    type BoardSectionsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type BoardSectionsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type BoardSectionsUpdateStatusCode409Response = {
      content:Error;
      
    }

    type BoardSectionsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardSectionsUpdateResult = BoardSectionsUpdateStatusCode200 of BoardSectionsUpdateStatusCode200Response|BoardSectionsUpdateStatusCode400 of BoardSectionsUpdateStatusCode400Response|BoardSectionsUpdateStatusCode403 of BoardSectionsUpdateStatusCode403Response|BoardSectionsUpdateStatusCode409 of BoardSectionsUpdateStatusCode409Response|BoardSectionsUpdateDefaultStatusCode of BoardSectionsUpdateDefaultStatusCodeResponse

    type BoardSectionsUpdateArgs = {
      pathParams:BoardSectionsUpdatePathParams;
      queryParams:Result<BoardSectionsUpdateQueryParams,string>;
      bodyParams:BoardSectionsUpdateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type BoardsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BoardsCreateBodyParams = Board
    //#endregion


    type BoardsCreateStatusCode201Response = {
      content:Board;
      
    }

    type BoardsCreateStatusCode400Response = {
      content:Error;
      
    }

    type BoardsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsCreateResult = BoardsCreateStatusCode201 of BoardsCreateStatusCode201Response|BoardsCreateStatusCode400 of BoardsCreateStatusCode400Response|BoardsCreateDefaultStatusCode of BoardsCreateDefaultStatusCodeResponse

    type BoardsCreateArgs = {
      queryParams:Result<BoardsCreateQueryParams,string>;
      bodyParams:BoardsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardsDeletePathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type BoardsDeleteStatusCode204Response = {
      content:string;
      
    }

    type BoardsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type BoardsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type BoardsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type BoardsDeleteStatusCode429Response = {
      content:Error;
      
    }

    type BoardsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsDeleteResult = BoardsDeleteStatusCode204 of BoardsDeleteStatusCode204Response|BoardsDeleteStatusCode403 of BoardsDeleteStatusCode403Response|BoardsDeleteStatusCode404 of BoardsDeleteStatusCode404Response|BoardsDeleteStatusCode409 of BoardsDeleteStatusCode409Response|BoardsDeleteStatusCode429 of BoardsDeleteStatusCode429Response|BoardsDeleteDefaultStatusCode of BoardsDeleteDefaultStatusCodeResponse

    type BoardsDeleteArgs = {
      pathParams:BoardsDeletePathParams;
      queryParams:Result<BoardsDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardsGetPathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type BoardsGetStatusCode200Response = {
      content:Board;
      
    }

    type BoardsGetStatusCode404Response = {
      content:Error;
      
    }

    type BoardsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsGetResult = BoardsGetStatusCode200 of BoardsGetStatusCode200Response|BoardsGetStatusCode404 of BoardsGetStatusCode404Response|BoardsGetDefaultStatusCode of BoardsGetDefaultStatusCodeResponse

    type BoardsGetArgs = {
      pathParams:BoardsGetPathParams;
      queryParams:Result<BoardsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type BoardsListQueryParams = {
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;


      privacy : string option;

    }
    //#endregion


    type BoardsListStatusCode200Response = {
      content:BoardsList200Response;
      
    }

    type BoardsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsListResult = BoardsListStatusCode200 of BoardsListStatusCode200Response|BoardsListDefaultStatusCode of BoardsListDefaultStatusCodeResponse

    type BoardsListArgs = {
      queryParams:Result<BoardsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardsListPinsPathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardsListPinsQueryParams = {
      bookmark : string option;


      pageSize : int option;


      creativeTypes : string[] option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion


    type BoardsListPinsStatusCode200Response = {
      content:BoardsListPins200Response;
      
    }

    type BoardsListPinsStatusCode404Response = {
      content:Error;
      
    }

    type BoardsListPinsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsListPinsResult = BoardsListPinsStatusCode200 of BoardsListPinsStatusCode200Response|BoardsListPinsStatusCode404 of BoardsListPinsStatusCode404Response|BoardsListPinsDefaultStatusCode of BoardsListPinsDefaultStatusCodeResponse

    type BoardsListPinsArgs = {
      pathParams:BoardsListPinsPathParams;
      queryParams:Result<BoardsListPinsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BoardsUpdatePathParams = {
      boardId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BoardsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BoardsUpdateBodyParams = BoardUpdate
    //#endregion


    type BoardsUpdateStatusCode200Response = {
      content:Board;
      
    }

    type BoardsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type BoardsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type BoardsUpdateStatusCode429Response = {
      content:Error;
      
    }

    type BoardsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BoardsUpdateResult = BoardsUpdateStatusCode200 of BoardsUpdateStatusCode200Response|BoardsUpdateStatusCode400 of BoardsUpdateStatusCode400Response|BoardsUpdateStatusCode403 of BoardsUpdateStatusCode403Response|BoardsUpdateStatusCode429 of BoardsUpdateStatusCode429Response|BoardsUpdateDefaultStatusCode of BoardsUpdateDefaultStatusCodeResponse

    type BoardsUpdateArgs = {
      pathParams:BoardsUpdatePathParams;
      queryParams:Result<BoardsUpdateQueryParams,string>;
      bodyParams:BoardsUpdateBodyParams
    }
