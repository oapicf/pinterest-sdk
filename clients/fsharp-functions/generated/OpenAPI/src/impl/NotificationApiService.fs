namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.NotificationPostRequest
open OpenAPI.Model.NotificationResponse
open NotificationApiHandlerParams
open NotificationApiServiceInterface
open System.Collections.Generic
open System

module NotificationApiServiceImplementation =

    //#region Service implementation
    type NotificationApiServiceImpl() =
      interface INotificationApiService with

        member this.NotificationPost (parameters:NotificationPostBodyParams) =
          if true then
            let content = "Successfully received notification" :> obj :?> NotificationResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            NotificationPostDefaultStatusCode { content = content }

      //#endregion

    let NotificationApiService = NotificationApiServiceImpl() :> INotificationApiService