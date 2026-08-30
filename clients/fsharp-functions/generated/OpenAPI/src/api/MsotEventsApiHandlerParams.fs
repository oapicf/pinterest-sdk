namespace OpenAPI

open OpenAPI.Model.ConversionMSOTEventsCreate
open OpenAPI.Model.PinterestLibError
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
    type MsotEventsCreateBodyParams = ConversionMSOTEventsCreate
    //#endregion


    type MsotEventsCreateStatusCode200Response = {
      content:string;
      
    }

    type MsotEventsCreateStatusCode201Response = {
      content:obj;
      
    }

    type MsotEventsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MsotEventsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MsotEventsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MsotEventsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MsotEventsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MsotEventsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MsotEventsCreateResult = MsotEventsCreateStatusCode200 of MsotEventsCreateStatusCode200Response|MsotEventsCreateStatusCode201 of MsotEventsCreateStatusCode201Response|MsotEventsCreateStatusCode400 of MsotEventsCreateStatusCode400Response|MsotEventsCreateStatusCode401 of MsotEventsCreateStatusCode401Response|MsotEventsCreateStatusCode403 of MsotEventsCreateStatusCode403Response|MsotEventsCreateStatusCode404 of MsotEventsCreateStatusCode404Response|MsotEventsCreateStatusCode429 of MsotEventsCreateStatusCode429Response|MsotEventsCreateDefaultStatusCode of MsotEventsCreateDefaultStatusCodeResponse

    type MsotEventsCreateArgs = {
      pathParams:MsotEventsCreatePathParams;
      bodyParams:MsotEventsCreateBodyParams
    }
