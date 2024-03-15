namespace OpenAPI
open ConversionEventsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionEventsApiServiceInterface =

    //#region Service interface
    type IConversionEventsApiService =
      abstract member EventsCreate:HttpContext -> EventsCreateArgs->EventsCreateResult
    //#endregion