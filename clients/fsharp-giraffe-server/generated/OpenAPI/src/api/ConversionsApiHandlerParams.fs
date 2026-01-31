namespace OpenAPI

open OpenAPI.Model.AdvertiserDefinedEventsResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module ConversionsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type AdvertiserDefinedEventsGetStatusCode200Response = {
      content:AdvertiserDefinedEventsResponse;
      
    }

    type AdvertiserDefinedEventsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdvertiserDefinedEventsGetResult = AdvertiserDefinedEventsGetStatusCode200 of AdvertiserDefinedEventsGetStatusCode200Response|AdvertiserDefinedEventsGetDefaultStatusCode of AdvertiserDefinedEventsGetDefaultStatusCodeResponse

    type AdvertiserDefinedEventsGetArgs = {
      pathParams:AdvertiserDefinedEventsGetPathParams;
    }
