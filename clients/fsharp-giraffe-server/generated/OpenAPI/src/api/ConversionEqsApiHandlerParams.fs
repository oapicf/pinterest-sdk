namespace OpenAPI

open OpenAPI.Model.EventQualityScore
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SourcePlatformOptions
open System.Collections.Generic
open System

module ConversionEqsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ConversionEqsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ConversionEqsListQueryParams = {
      lookbackPeriod : LookbackPeriodOptions ;


      sourcePlatform : SourcePlatformOptions option;


      ingestionSource : IngestionSourceOptions option;

    }
    //#endregion


    type ConversionEqsListStatusCode200Response = {
      content:EventQualityScore[];
      
    }

    type ConversionEqsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ConversionEqsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ConversionEqsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ConversionEqsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ConversionEqsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ConversionEqsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ConversionEqsListResult = ConversionEqsListStatusCode200 of ConversionEqsListStatusCode200Response|ConversionEqsListStatusCode400 of ConversionEqsListStatusCode400Response|ConversionEqsListStatusCode401 of ConversionEqsListStatusCode401Response|ConversionEqsListStatusCode403 of ConversionEqsListStatusCode403Response|ConversionEqsListStatusCode404 of ConversionEqsListStatusCode404Response|ConversionEqsListStatusCode429 of ConversionEqsListStatusCode429Response|ConversionEqsListDefaultStatusCode of ConversionEqsListDefaultStatusCodeResponse

    type ConversionEqsListArgs = {
      pathParams:ConversionEqsListPathParams;
      queryParams:Result<ConversionEqsListQueryParams,string>;
    }
