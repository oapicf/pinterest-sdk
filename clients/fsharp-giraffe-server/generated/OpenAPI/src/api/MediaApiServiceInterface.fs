namespace OpenAPI
open MediaApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MediaApiServiceInterface =

    //#region Service interface
    type IMediaApiService =
      abstract member MediaCreate:HttpContext -> MediaCreateArgs->MediaCreateResult
      abstract member MediaGet:HttpContext -> MediaGetArgs->MediaGetResult
      abstract member MediaList:HttpContext -> MediaListArgs->MediaListResult
    //#endregion