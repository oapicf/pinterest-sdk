namespace OpenAPI

open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.CatalogsReportStatsParameters
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ReportsStats200Response
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

    type ReportsCreateStatusCode201Response = {
      content:CatalogsCreateReportResponse;
      
    }

    type ReportsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ReportsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ReportsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ReportsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ReportsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ReportsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ReportsCreateResult = ReportsCreateStatusCode200 of ReportsCreateStatusCode200Response|ReportsCreateStatusCode201 of ReportsCreateStatusCode201Response|ReportsCreateStatusCode400 of ReportsCreateStatusCode400Response|ReportsCreateStatusCode401 of ReportsCreateStatusCode401Response|ReportsCreateStatusCode403 of ReportsCreateStatusCode403Response|ReportsCreateStatusCode404 of ReportsCreateStatusCode404Response|ReportsCreateStatusCode429 of ReportsCreateStatusCode429Response|ReportsCreateDefaultStatusCode of ReportsCreateDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type ReportsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ReportsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ReportsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ReportsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ReportsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ReportsGetResult = ReportsGetStatusCode200 of ReportsGetStatusCode200Response|ReportsGetStatusCode400 of ReportsGetStatusCode400Response|ReportsGetStatusCode401 of ReportsGetStatusCode401Response|ReportsGetStatusCode403 of ReportsGetStatusCode403Response|ReportsGetStatusCode404 of ReportsGetStatusCode404Response|ReportsGetStatusCode429 of ReportsGetStatusCode429Response|ReportsGetDefaultStatusCode of ReportsGetDefaultStatusCodeResponse

    type ReportsGetArgs = {
      queryParams:Result<ReportsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ReportsStatsQueryParams = {
      adAccountId : string option;


      parameters : CatalogsReportStatsParameters ;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type ReportsStatsStatusCode200Response = {
      content:ReportsStats200Response;
      
    }

    type ReportsStatsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ReportsStatsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ReportsStatsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ReportsStatsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ReportsStatsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ReportsStatsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ReportsStatsResult = ReportsStatsStatusCode200 of ReportsStatsStatusCode200Response|ReportsStatsStatusCode400 of ReportsStatsStatusCode400Response|ReportsStatsStatusCode401 of ReportsStatsStatusCode401Response|ReportsStatsStatusCode403 of ReportsStatsStatusCode403Response|ReportsStatsStatusCode404 of ReportsStatsStatusCode404Response|ReportsStatsStatusCode429 of ReportsStatsStatusCode429Response|ReportsStatsDefaultStatusCode of ReportsStatsDefaultStatusCodeResponse

    type ReportsStatsArgs = {
      queryParams:Result<ReportsStatsQueryParams,string>;
    }
