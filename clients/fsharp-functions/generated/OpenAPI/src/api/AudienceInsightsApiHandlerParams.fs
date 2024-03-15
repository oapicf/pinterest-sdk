namespace OpenAPI

open OpenAPI.Model.AudienceDefinitionResponse
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.AudienceInsightsResponse
open OpenAPI.Model.Error
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
      content:AudienceInsightsResponse;
      
    }

    type AudienceInsightsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudienceInsightsGetResult = AudienceInsightsGetStatusCode200 of AudienceInsightsGetStatusCode200Response|AudienceInsightsGetDefaultStatusCode of AudienceInsightsGetDefaultStatusCodeResponse

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
      content:AudienceDefinitionResponse;
      
    }

    type AudienceInsightsScopeAndTypeGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudienceInsightsScopeAndTypeGetResult = AudienceInsightsScopeAndTypeGetStatusCode200 of AudienceInsightsScopeAndTypeGetStatusCode200Response|AudienceInsightsScopeAndTypeGetDefaultStatusCode of AudienceInsightsScopeAndTypeGetDefaultStatusCodeResponse

    type AudienceInsightsScopeAndTypeGetArgs = {
      pathParams:AudienceInsightsScopeAndTypeGetPathParams;
    }
