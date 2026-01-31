namespace OpenAPI

open OpenAPI.Model.Board
open OpenAPI.Model.BoardCreate
open OpenAPI.Model.BoardPrivacyFilter
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardSectionsList200Response
open OpenAPI.Model.BoardWithUpdatePrivacy
open OpenAPI.Model.BoardWithUpdatePrivacyUpdate
open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.BoardsListPins200Response
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Error
open OpenAPI.Model.PinterestLibError
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
    type BoardsCreateBodyParams = BoardCreate
    //#endregion


    type BoardsCreateStatusCode200Response = {
      content:Board;
      
    }

    type BoardsCreateStatusCode201Response = {
      content:Board;
      
    }

    type BoardsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsCreateResult = BoardsCreateStatusCode200 of BoardsCreateStatusCode200Response|BoardsCreateStatusCode201 of BoardsCreateStatusCode201Response|BoardsCreateStatusCode400 of BoardsCreateStatusCode400Response|BoardsCreateStatusCode401 of BoardsCreateStatusCode401Response|BoardsCreateStatusCode403 of BoardsCreateStatusCode403Response|BoardsCreateStatusCode404 of BoardsCreateStatusCode404Response|BoardsCreateStatusCode429 of BoardsCreateStatusCode429Response|BoardsCreateDefaultStatusCode of BoardsCreateDefaultStatusCodeResponse

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

    type BoardsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsDeleteResult = BoardsDeleteStatusCode204 of BoardsDeleteStatusCode204Response|BoardsDeleteStatusCode400 of BoardsDeleteStatusCode400Response|BoardsDeleteStatusCode401 of BoardsDeleteStatusCode401Response|BoardsDeleteStatusCode403 of BoardsDeleteStatusCode403Response|BoardsDeleteStatusCode404 of BoardsDeleteStatusCode404Response|BoardsDeleteStatusCode429 of BoardsDeleteStatusCode429Response|BoardsDeleteDefaultStatusCode of BoardsDeleteDefaultStatusCodeResponse

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

    type BoardsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsGetResult = BoardsGetStatusCode200 of BoardsGetStatusCode200Response|BoardsGetStatusCode400 of BoardsGetStatusCode400Response|BoardsGetStatusCode401 of BoardsGetStatusCode401Response|BoardsGetStatusCode403 of BoardsGetStatusCode403Response|BoardsGetStatusCode404 of BoardsGetStatusCode404Response|BoardsGetStatusCode429 of BoardsGetStatusCode429Response|BoardsGetDefaultStatusCode of BoardsGetDefaultStatusCodeResponse

    type BoardsGetArgs = {
      pathParams:BoardsGetPathParams;
      queryParams:Result<BoardsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type BoardsListQueryParams = {
      adAccountId : string option;


      privacy : BoardPrivacyFilter option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type BoardsListStatusCode200Response = {
      content:BoardsList200Response;
      
    }

    type BoardsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsListResult = BoardsListStatusCode200 of BoardsListStatusCode200Response|BoardsListStatusCode400 of BoardsListStatusCode400Response|BoardsListStatusCode401 of BoardsListStatusCode401Response|BoardsListStatusCode403 of BoardsListStatusCode403Response|BoardsListStatusCode404 of BoardsListStatusCode404Response|BoardsListStatusCode429 of BoardsListStatusCode429Response|BoardsListDefaultStatusCode of BoardsListDefaultStatusCodeResponse

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


      creativeTypes : CreativeType[] option;


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
    type BoardsUpdateBodyParams = BoardWithUpdatePrivacyUpdate
    //#endregion


    type BoardsUpdateStatusCode200Response = {
      content:BoardWithUpdatePrivacy;
      
    }

    type BoardsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BoardsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BoardsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BoardsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BoardsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BoardsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BoardsUpdateResult = BoardsUpdateStatusCode200 of BoardsUpdateStatusCode200Response|BoardsUpdateStatusCode400 of BoardsUpdateStatusCode400Response|BoardsUpdateStatusCode401 of BoardsUpdateStatusCode401Response|BoardsUpdateStatusCode403 of BoardsUpdateStatusCode403Response|BoardsUpdateStatusCode404 of BoardsUpdateStatusCode404Response|BoardsUpdateStatusCode429 of BoardsUpdateStatusCode429Response|BoardsUpdateDefaultStatusCode of BoardsUpdateDefaultStatusCodeResponse

    type BoardsUpdateArgs = {
      pathParams:BoardsUpdatePathParams;
      queryParams:Result<BoardsUpdateQueryParams,string>;
      bodyParams:BoardsUpdateBodyParams
    }
