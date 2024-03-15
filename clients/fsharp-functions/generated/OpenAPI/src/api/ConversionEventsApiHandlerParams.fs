namespace OpenAPI

open OpenAPI.Model.ConversionApiResponse
open OpenAPI.Model.ConversionEvents
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module ConversionEventsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type EventsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type EventsCreateQueryParams = {
      test : bool option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type EventsCreateBodyParams = ConversionEvents
    //#endregion


    type EventsCreateStatusCode200Response = {
      content:ConversionApiResponse;
      
    }

    type EventsCreateStatusCode400Response = {
      content:Error;
      
    }

    type EventsCreateStatusCode401Response = {
      content:Error;
      
    }

    type EventsCreateStatusCode403Response = {
      content:Error;
      
    }

    type EventsCreateStatusCode422Response = {
      content:DetailedError;
      
    }

    type EventsCreateStatusCode429Response = {
      content:Error;
      
    }

    type EventsCreateStatusCode503Response = {
      content:Error;
      
    }

    type EventsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type EventsCreateResult = EventsCreateStatusCode200 of EventsCreateStatusCode200Response|EventsCreateStatusCode400 of EventsCreateStatusCode400Response|EventsCreateStatusCode401 of EventsCreateStatusCode401Response|EventsCreateStatusCode403 of EventsCreateStatusCode403Response|EventsCreateStatusCode422 of EventsCreateStatusCode422Response|EventsCreateStatusCode429 of EventsCreateStatusCode429Response|EventsCreateStatusCode503 of EventsCreateStatusCode503Response|EventsCreateDefaultStatusCode of EventsCreateDefaultStatusCodeResponse

    type EventsCreateArgs = {
      pathParams:EventsCreatePathParams;
      queryParams:Result<EventsCreateQueryParams,string>;
      bodyParams:EventsCreateBodyParams
    }
