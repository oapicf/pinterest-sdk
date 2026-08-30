namespace OpenAPI

open OpenAPI.Model.NotificationPostRequest
open OpenAPI.Model.NotificationResponse
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module NotificationApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type NotificationPostBodyParams = NotificationPostRequest
    //#endregion


    type NotificationPostStatusCode200Response = {
      content:NotificationResponse;
      
    }

    type NotificationPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type NotificationPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type NotificationPostResult = NotificationPostStatusCode200 of NotificationPostStatusCode200Response|NotificationPostStatusCode400 of NotificationPostStatusCode400Response|NotificationPostDefaultStatusCode of NotificationPostDefaultStatusCodeResponse

    type NotificationPostArgs = {
      bodyParams:NotificationPostBodyParams
    }
