namespace OpenAPI

open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SearchPartnerPins200Response
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
      content:PinterestLibError;
      
    }

    type SearchPartnerPinsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SearchPartnerPinsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SearchPartnerPinsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SearchPartnerPinsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SearchPartnerPinsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SearchPartnerPinsResult = SearchPartnerPinsStatusCode200 of SearchPartnerPinsStatusCode200Response|SearchPartnerPinsStatusCode400 of SearchPartnerPinsStatusCode400Response|SearchPartnerPinsStatusCode401 of SearchPartnerPinsStatusCode401Response|SearchPartnerPinsStatusCode403 of SearchPartnerPinsStatusCode403Response|SearchPartnerPinsStatusCode404 of SearchPartnerPinsStatusCode404Response|SearchPartnerPinsStatusCode429 of SearchPartnerPinsStatusCode429Response|SearchPartnerPinsDefaultStatusCode of SearchPartnerPinsDefaultStatusCodeResponse

    type SearchPartnerPinsArgs = {
      queryParams:Result<SearchPartnerPinsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchUserBoardsGetQueryParams = {
      adAccountId : string option;


      query : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type SearchUserBoardsGetStatusCode200Response = {
      content:BoardsList200Response;
      
    }

    type SearchUserBoardsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SearchUserBoardsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SearchUserBoardsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SearchUserBoardsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SearchUserBoardsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SearchUserBoardsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SearchUserBoardsGetResult = SearchUserBoardsGetStatusCode200 of SearchUserBoardsGetStatusCode200Response|SearchUserBoardsGetStatusCode400 of SearchUserBoardsGetStatusCode400Response|SearchUserBoardsGetStatusCode401 of SearchUserBoardsGetStatusCode401Response|SearchUserBoardsGetStatusCode403 of SearchUserBoardsGetStatusCode403Response|SearchUserBoardsGetStatusCode404 of SearchUserBoardsGetStatusCode404Response|SearchUserBoardsGetStatusCode429 of SearchUserBoardsGetStatusCode429Response|SearchUserBoardsGetDefaultStatusCode of SearchUserBoardsGetDefaultStatusCodeResponse

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

    type SearchUserPinsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type SearchUserPinsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SearchUserPinsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SearchUserPinsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SearchUserPinsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SearchUserPinsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SearchUserPinsListResult = SearchUserPinsListStatusCode200 of SearchUserPinsListStatusCode200Response|SearchUserPinsListStatusCode400 of SearchUserPinsListStatusCode400Response|SearchUserPinsListStatusCode401 of SearchUserPinsListStatusCode401Response|SearchUserPinsListStatusCode403 of SearchUserPinsListStatusCode403Response|SearchUserPinsListStatusCode404 of SearchUserPinsListStatusCode404Response|SearchUserPinsListStatusCode429 of SearchUserPinsListStatusCode429Response|SearchUserPinsListDefaultStatusCode of SearchUserPinsListDefaultStatusCodeResponse

    type SearchUserPinsListArgs = {
      queryParams:Result<SearchUserPinsListQueryParams,string>;
    }
