namespace OpenAPI
open NotificationApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module NotificationApiServiceInterface =

    //#region Service interface
    type INotificationApiService =
      abstract member NotificationPost : NotificationPostBodyParams -> NotificationPostResult
    //#endregion