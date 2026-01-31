namespace OpenAPI
open NotificationApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module NotificationApiServiceInterface =

    //#region Service interface
    type INotificationApiService =
      abstract member NotificationPost:HttpContext -> NotificationPostArgs->NotificationPostResult
    //#endregion