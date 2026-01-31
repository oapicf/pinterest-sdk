namespace OpenAPI

open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.Error
open OpenAPI.Model.ReportsStats200Response
open OpenAPI.Model.ReportsStatsParametersParameter
open System.Collections.Generic
open System

module CatalogReportsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type ReportsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ReportsCreateBodyParams = CatalogsReportParameters
    //#endregion


    type ReportsCreateStatusCode200Response = {
      content:CatalogsCreateReportResponse;
      
    }

    type ReportsCreateStatusCode404Response = {
      content:Error;
      
    }

    type ReportsCreateStatusCode409Response = {
      content:Error;
      
    }

    type ReportsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsCreateResult = ReportsCreateStatusCode200 of ReportsCreateStatusCode200Response|ReportsCreateStatusCode404 of ReportsCreateStatusCode404Response|ReportsCreateStatusCode409 of ReportsCreateStatusCode409Response|ReportsCreateDefaultStatusCode of ReportsCreateDefaultStatusCodeResponse

    type ReportsCreateArgs = {
      queryParams:Result<ReportsCreateQueryParams,string>;
      bodyParams:ReportsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsGetQueryParams = {
      adAccountId : string option;


      token : string ;

    }
    //#endregion


    type ReportsGetStatusCode200Response = {
      content:CatalogsReport;
      
    }

    type ReportsGetStatusCode400Response = {
      content:Error;
      
    }

    type ReportsGetStatusCode409Response = {
      content:Error;
      
    }

    type ReportsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsGetResult = ReportsGetStatusCode200 of ReportsGetStatusCode200Response|ReportsGetStatusCode400 of ReportsGetStatusCode400Response|ReportsGetStatusCode409 of ReportsGetStatusCode409Response|ReportsGetDefaultStatusCode of ReportsGetDefaultStatusCodeResponse

    type ReportsGetArgs = {
      queryParams:Result<ReportsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsStatsQueryParams = {
      adAccountId : string option;


      pageSize : int option;


      bookmark : string option;


      parameters : ReportsStatsParametersParameter ;

    }
    //#endregion


    type ReportsStatsStatusCode200Response = {
      content:ReportsStats200Response;
      
    }

    type ReportsStatsStatusCode401Response = {
      content:Error;
      
    }

    type ReportsStatsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ReportsStatsResult = ReportsStatsStatusCode200 of ReportsStatsStatusCode200Response|ReportsStatsStatusCode401 of ReportsStatsStatusCode401Response|ReportsStatsDefaultStatusCode of ReportsStatsDefaultStatusCodeResponse

    type ReportsStatsArgs = {
      queryParams:Result<ReportsStatsQueryParams,string>;
    }
