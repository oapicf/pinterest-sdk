namespace OpenAPI
open OpenAPI.Model.NotificationPostRequest
open OpenAPI.Model.NotificationResponse
open OpenAPI.Model.PinterestLibError
open NotificationApiHandlerParams
open NotificationApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module NotificationApiServiceImplementation =

    //#region Service implementation
    type NotificationApiServiceImpl() =
      interface INotificationApiService with

        member this.NotificationPost ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> NotificationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostStatusCode400 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostDefaultStatusCode { content = content }

      //#endregion

    let NotificationApiService = NotificationApiServiceImpl() :> INotificationApiService