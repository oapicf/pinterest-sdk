namespace OpenAPI

open OpenAPI.Model.Keywords
open OpenAPI.Model.KeywordsCreate
open OpenAPI.Model.KeywordsGet200Response
open OpenAPI.Model.KeywordsMetricsArrayResponse
open OpenAPI.Model.KeywordsUpdate
open OpenAPI.Model.MatchType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.TrendType
open OpenAPI.Model.TrendingKeywordsResponse
open OpenAPI.Model.TrendsAgeBucket
open OpenAPI.Model.TrendsGenderFilter
open OpenAPI.Model.TrendsL1Interest
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

    type CountryKeywordsMetricsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CountryKeywordsMetricsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CountryKeywordsMetricsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CountryKeywordsMetricsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CountryKeywordsMetricsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CountryKeywordsMetricsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CountryKeywordsMetricsGetResult = CountryKeywordsMetricsGetStatusCode200 of CountryKeywordsMetricsGetStatusCode200Response|CountryKeywordsMetricsGetStatusCode400 of CountryKeywordsMetricsGetStatusCode400Response|CountryKeywordsMetricsGetStatusCode401 of CountryKeywordsMetricsGetStatusCode401Response|CountryKeywordsMetricsGetStatusCode403 of CountryKeywordsMetricsGetStatusCode403Response|CountryKeywordsMetricsGetStatusCode404 of CountryKeywordsMetricsGetStatusCode404Response|CountryKeywordsMetricsGetStatusCode429 of CountryKeywordsMetricsGetStatusCode429Response|CountryKeywordsMetricsGetDefaultStatusCode of CountryKeywordsMetricsGetDefaultStatusCodeResponse

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
    type KeywordsCreateBodyParams = KeywordsCreate
    //#endregion


    type KeywordsCreateStatusCode200Response = {
      content:Keywords;
      
    }

    type KeywordsCreateStatusCode201Response = {
      content:Keywords;
      
    }

    type KeywordsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type KeywordsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type KeywordsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type KeywordsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type KeywordsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type KeywordsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type KeywordsCreateResult = KeywordsCreateStatusCode200 of KeywordsCreateStatusCode200Response|KeywordsCreateStatusCode201 of KeywordsCreateStatusCode201Response|KeywordsCreateStatusCode400 of KeywordsCreateStatusCode400Response|KeywordsCreateStatusCode401 of KeywordsCreateStatusCode401Response|KeywordsCreateStatusCode403 of KeywordsCreateStatusCode403Response|KeywordsCreateStatusCode404 of KeywordsCreateStatusCode404Response|KeywordsCreateStatusCode429 of KeywordsCreateStatusCode429Response|KeywordsCreateDefaultStatusCode of KeywordsCreateDefaultStatusCodeResponse

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


      adGroupIds : string[] option;


      matchTypes : MatchType[] option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type KeywordsGetStatusCode200Response = {
      content:KeywordsGet200Response;
      
    }

    type KeywordsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type KeywordsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type KeywordsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type KeywordsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type KeywordsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type KeywordsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type KeywordsGetResult = KeywordsGetStatusCode200 of KeywordsGetStatusCode200Response|KeywordsGetStatusCode400 of KeywordsGetStatusCode400Response|KeywordsGetStatusCode401 of KeywordsGetStatusCode401Response|KeywordsGetStatusCode403 of KeywordsGetStatusCode403Response|KeywordsGetStatusCode404 of KeywordsGetStatusCode404Response|KeywordsGetStatusCode429 of KeywordsGetStatusCode429Response|KeywordsGetDefaultStatusCode of KeywordsGetDefaultStatusCodeResponse

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
    type KeywordsUpdateBodyParams = KeywordsUpdate
    //#endregion


    type KeywordsUpdateStatusCode200Response = {
      content:Keywords;
      
    }

    type KeywordsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type KeywordsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type KeywordsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type KeywordsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type KeywordsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type KeywordsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type KeywordsUpdateResult = KeywordsUpdateStatusCode200 of KeywordsUpdateStatusCode200Response|KeywordsUpdateStatusCode400 of KeywordsUpdateStatusCode400Response|KeywordsUpdateStatusCode401 of KeywordsUpdateStatusCode401Response|KeywordsUpdateStatusCode403 of KeywordsUpdateStatusCode403Response|KeywordsUpdateStatusCode404 of KeywordsUpdateStatusCode404Response|KeywordsUpdateStatusCode429 of KeywordsUpdateStatusCode429Response|KeywordsUpdateDefaultStatusCode of KeywordsUpdateDefaultStatusCodeResponse

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
      interests : TrendsL1Interest[] option;


      genders : TrendsGenderFilter[] option;


      ages : TrendsAgeBucket[] option;


      includeKeywords : string[] option;


      normalizeAgainstGroup : bool option;


      limit : int option;


      includeDemographics : bool option;

    }
    //#endregion


    type TrendingKeywordsListStatusCode200Response = {
      content:TrendingKeywordsResponse;
      
    }

    type TrendingKeywordsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TrendingKeywordsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TrendingKeywordsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TrendingKeywordsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TrendingKeywordsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TrendingKeywordsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TrendingKeywordsListResult = TrendingKeywordsListStatusCode200 of TrendingKeywordsListStatusCode200Response|TrendingKeywordsListStatusCode400 of TrendingKeywordsListStatusCode400Response|TrendingKeywordsListStatusCode401 of TrendingKeywordsListStatusCode401Response|TrendingKeywordsListStatusCode403 of TrendingKeywordsListStatusCode403Response|TrendingKeywordsListStatusCode404 of TrendingKeywordsListStatusCode404Response|TrendingKeywordsListStatusCode429 of TrendingKeywordsListStatusCode429Response|TrendingKeywordsListDefaultStatusCode of TrendingKeywordsListDefaultStatusCodeResponse

    type TrendingKeywordsListArgs = {
      pathParams:TrendingKeywordsListPathParams;
      queryParams:Result<TrendingKeywordsListQueryParams,string>;
    }
