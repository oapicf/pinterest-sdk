namespace OpenAPI
open ConversionEventsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionEventsApiServiceInterface =

    //#region Service interface
    type IConversionEventsApiService =
      abstract member EventsCreate : EventsCreateBodyParams -> EventsCreateResult
    //#endregion