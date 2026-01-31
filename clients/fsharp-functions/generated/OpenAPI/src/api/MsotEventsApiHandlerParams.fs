namespace OpenAPI

open OpenAPI.Model.ConversionMSOTEvents
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module MsotEventsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type MsotEventsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type MsotEventsCreateBodyParams = ConversionMSOTEvents
    //#endregion


    type MsotEventsCreateStatusCode200Response = {
      content:string;
      
    }

    type MsotEventsCreateStatusCode400Response = {
      content:Error;
      
    }

    type MsotEventsCreateStatusCode401Response = {
      content:Error;
      
    }

    type MsotEventsCreateStatusCode403Response = {
      content:Error;
      
    }

    type MsotEventsCreateStatusCode429Response = {
      content:Error;
      
    }

    type MsotEventsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MsotEventsCreateResult = MsotEventsCreateStatusCode200 of MsotEventsCreateStatusCode200Response|MsotEventsCreateStatusCode400 of MsotEventsCreateStatusCode400Response|MsotEventsCreateStatusCode401 of MsotEventsCreateStatusCode401Response|MsotEventsCreateStatusCode403 of MsotEventsCreateStatusCode403Response|MsotEventsCreateStatusCode429 of MsotEventsCreateStatusCode429Response|MsotEventsCreateDefaultStatusCode of MsotEventsCreateDefaultStatusCodeResponse

    type MsotEventsCreateArgs = {
      pathParams:MsotEventsCreatePathParams;
      bodyParams:MsotEventsCreateBodyParams
    }
