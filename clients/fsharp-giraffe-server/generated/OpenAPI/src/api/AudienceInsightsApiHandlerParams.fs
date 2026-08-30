namespace OpenAPI

open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.AudienceInsights
open OpenAPI.Model.AudienceInsightsScopeAndTypeGet200Response
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module AudienceInsightsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AudienceInsightsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AudienceInsightsGetQueryParams = {
      audienceInsightType : AudienceInsightType ;

    }
    //#endregion


    type AudienceInsightsGetStatusCode200Response = {
      content:AudienceInsights;
      
    }

    type AudienceInsightsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudienceInsightsGetResult = AudienceInsightsGetStatusCode200 of AudienceInsightsGetStatusCode200Response|AudienceInsightsGetStatusCode400 of AudienceInsightsGetStatusCode400Response|AudienceInsightsGetStatusCode401 of AudienceInsightsGetStatusCode401Response|AudienceInsightsGetStatusCode403 of AudienceInsightsGetStatusCode403Response|AudienceInsightsGetStatusCode404 of AudienceInsightsGetStatusCode404Response|AudienceInsightsGetStatusCode429 of AudienceInsightsGetStatusCode429Response|AudienceInsightsGetDefaultStatusCode of AudienceInsightsGetDefaultStatusCodeResponse

    type AudienceInsightsGetArgs = {
      pathParams:AudienceInsightsGetPathParams;
      queryParams:Result<AudienceInsightsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudienceInsightsScopeAndTypeGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type AudienceInsightsScopeAndTypeGetStatusCode200Response = {
      content:AudienceInsightsScopeAndTypeGet200Response;
      
    }

    type AudienceInsightsScopeAndTypeGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsScopeAndTypeGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsScopeAndTypeGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsScopeAndTypeGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsScopeAndTypeGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudienceInsightsScopeAndTypeGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudienceInsightsScopeAndTypeGetResult = AudienceInsightsScopeAndTypeGetStatusCode200 of AudienceInsightsScopeAndTypeGetStatusCode200Response|AudienceInsightsScopeAndTypeGetStatusCode400 of AudienceInsightsScopeAndTypeGetStatusCode400Response|AudienceInsightsScopeAndTypeGetStatusCode401 of AudienceInsightsScopeAndTypeGetStatusCode401Response|AudienceInsightsScopeAndTypeGetStatusCode403 of AudienceInsightsScopeAndTypeGetStatusCode403Response|AudienceInsightsScopeAndTypeGetStatusCode404 of AudienceInsightsScopeAndTypeGetStatusCode404Response|AudienceInsightsScopeAndTypeGetStatusCode429 of AudienceInsightsScopeAndTypeGetStatusCode429Response|AudienceInsightsScopeAndTypeGetDefaultStatusCode of AudienceInsightsScopeAndTypeGetDefaultStatusCodeResponse

    type AudienceInsightsScopeAndTypeGetArgs = {
      pathParams:AudienceInsightsScopeAndTypeGetPathParams;
    }
