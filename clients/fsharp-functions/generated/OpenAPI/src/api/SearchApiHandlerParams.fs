namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.SearchPartnerPins200Response
open OpenAPI.Model.SearchUserBoardsGet200Response
open System.Collections.Generic
open System

module SearchApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type SearchPartnerPinsQueryParams = {
      term : string ;


      countryCode : string ;


      bookmark : string option;


      locale : string option;


      limit : int option;

    }
    //#endregion


    type SearchPartnerPinsStatusCode200Response = {
      content:SearchPartnerPins200Response;
      
    }

    type SearchPartnerPinsStatusCode400Response = {
      content:Error;
      
    }

    type SearchPartnerPinsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SearchPartnerPinsResult = SearchPartnerPinsStatusCode200 of SearchPartnerPinsStatusCode200Response|SearchPartnerPinsStatusCode400 of SearchPartnerPinsStatusCode400Response|SearchPartnerPinsDefaultStatusCode of SearchPartnerPinsDefaultStatusCodeResponse

    type SearchPartnerPinsArgs = {
      queryParams:Result<SearchPartnerPinsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchUserBoardsGetQueryParams = {
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;


      query : string option;

    }
    //#endregion


    type SearchUserBoardsGetStatusCode200Response = {
      content:SearchUserBoardsGet200Response;
      
    }

    type SearchUserBoardsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SearchUserBoardsGetResult = SearchUserBoardsGetStatusCode200 of SearchUserBoardsGetStatusCode200Response|SearchUserBoardsGetDefaultStatusCode of SearchUserBoardsGetDefaultStatusCodeResponse

    type SearchUserBoardsGetArgs = {
      queryParams:Result<SearchUserBoardsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchUserPinsListQueryParams = {
      adAccountId : string option;


      query : string ;


      bookmark : string option;

    }
    //#endregion


    type SearchUserPinsListStatusCode200Response = {
      content:PinsList200Response;
      
    }

    type SearchUserPinsListStatusCode404Response = {
      content:Error;
      
    }

    type SearchUserPinsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SearchUserPinsListResult = SearchUserPinsListStatusCode200 of SearchUserPinsListStatusCode200Response|SearchUserPinsListStatusCode404 of SearchUserPinsListStatusCode404Response|SearchUserPinsListDefaultStatusCode of SearchUserPinsListDefaultStatusCodeResponse

    type SearchUserPinsListArgs = {
      queryParams:Result<SearchUserPinsListQueryParams,string>;
    }
