namespace OpenAPI

open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module UserAccountApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type UserAccountAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      fromClaimedContent : string option;


      pinFormat : string option;


      appTypes : string option;


      metricTypes : string[] option;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type UserAccountAnalyticsStatusCode200Response = {
      content:IDictionary<string, AnalyticsMetricsResponse>;
      
    }

    type UserAccountAnalyticsStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountAnalyticsResult = UserAccountAnalyticsStatusCode200 of UserAccountAnalyticsStatusCode200Response|UserAccountAnalyticsStatusCode403 of UserAccountAnalyticsStatusCode403Response|UserAccountAnalyticsDefaultStatusCode of UserAccountAnalyticsDefaultStatusCodeResponse

    type UserAccountAnalyticsArgs = {
      queryParams:Result<UserAccountAnalyticsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type UserAccountGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type UserAccountGetStatusCode200Response = {
      content:Account;
      
    }

    type UserAccountGetStatusCode403Response = {
      content:Error;
      
    }

    type UserAccountGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type UserAccountGetResult = UserAccountGetStatusCode200 of UserAccountGetStatusCode200Response|UserAccountGetStatusCode403 of UserAccountGetStatusCode403Response|UserAccountGetDefaultStatusCode of UserAccountGetDefaultStatusCodeResponse

    type UserAccountGetArgs = {
      queryParams:Result<UserAccountGetQueryParams,string>;
    }
