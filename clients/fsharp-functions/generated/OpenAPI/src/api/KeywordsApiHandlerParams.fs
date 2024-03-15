namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.KeywordUpdateBody
open OpenAPI.Model.KeywordsGet200Response
open OpenAPI.Model.KeywordsMetricsArrayResponse
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.KeywordsResponse
open OpenAPI.Model.MatchType
open OpenAPI.Model.TrendType
open OpenAPI.Model.TrendingKeywordsResponse
open OpenAPI.Model.TrendsSupportedRegion
open System.Collections.Generic
open System

module KeywordsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CountryKeywordsMetricsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CountryKeywordsMetricsGetQueryParams = {
      countryCode : string ;


      keywords : string[] ;

    }
    //#endregion


    type CountryKeywordsMetricsGetStatusCode200Response = {
      content:KeywordsMetricsArrayResponse;
      
    }

    type CountryKeywordsMetricsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CountryKeywordsMetricsGetResult = CountryKeywordsMetricsGetStatusCode200 of CountryKeywordsMetricsGetStatusCode200Response|CountryKeywordsMetricsGetDefaultStatusCode of CountryKeywordsMetricsGetDefaultStatusCodeResponse

    type CountryKeywordsMetricsGetArgs = {
      pathParams:CountryKeywordsMetricsGetPathParams;
      queryParams:Result<CountryKeywordsMetricsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type KeywordsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type KeywordsCreateBodyParams = KeywordsRequest
    //#endregion


    type KeywordsCreateStatusCode200Response = {
      content:KeywordsResponse;
      
    }

    type KeywordsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type KeywordsCreateResult = KeywordsCreateStatusCode200 of KeywordsCreateStatusCode200Response|KeywordsCreateDefaultStatusCode of KeywordsCreateDefaultStatusCodeResponse

    type KeywordsCreateArgs = {
      pathParams:KeywordsCreatePathParams;
      bodyParams:KeywordsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type KeywordsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type KeywordsGetQueryParams = {
      campaignId : string option;


      adGroupId : string option;


      matchTypes : MatchType[] option;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type KeywordsGetStatusCode200Response = {
      content:KeywordsGet200Response;
      
    }

    type KeywordsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type KeywordsGetResult = KeywordsGetStatusCode200 of KeywordsGetStatusCode200Response|KeywordsGetDefaultStatusCode of KeywordsGetDefaultStatusCodeResponse

    type KeywordsGetArgs = {
      pathParams:KeywordsGetPathParams;
      queryParams:Result<KeywordsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type KeywordsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type KeywordsUpdateBodyParams = KeywordUpdateBody
    //#endregion


    type KeywordsUpdateStatusCode200Response = {
      content:KeywordsResponse;
      
    }

    type KeywordsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type KeywordsUpdateResult = KeywordsUpdateStatusCode200 of KeywordsUpdateStatusCode200Response|KeywordsUpdateDefaultStatusCode of KeywordsUpdateDefaultStatusCodeResponse

    type KeywordsUpdateArgs = {
      pathParams:KeywordsUpdatePathParams;
      bodyParams:KeywordsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type TrendingKeywordsListPathParams = {
      region : TrendsSupportedRegion ;
    //#endregion
      trendType : TrendType ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TrendingKeywordsListQueryParams = {
      interests : string[] option;


      genders : string[] option;


      ages : string[] option;


      normalizeAgainstGroup : bool option;


      limit : int option;

    }
    //#endregion


    type TrendingKeywordsListStatusCode200Response = {
      content:TrendingKeywordsResponse;
      
    }

    type TrendingKeywordsListStatusCode400Response = {
      content:Error;
      
    }

    type TrendingKeywordsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TrendingKeywordsListResult = TrendingKeywordsListStatusCode200 of TrendingKeywordsListStatusCode200Response|TrendingKeywordsListStatusCode400 of TrendingKeywordsListStatusCode400Response|TrendingKeywordsListDefaultStatusCode of TrendingKeywordsListDefaultStatusCodeResponse

    type TrendingKeywordsListArgs = {
      pathParams:TrendingKeywordsListPathParams;
      queryParams:Result<TrendingKeywordsListQueryParams,string>;
    }
