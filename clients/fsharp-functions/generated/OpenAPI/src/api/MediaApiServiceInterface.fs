namespace OpenAPI
open MediaApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MediaApiServiceInterface =

    //#region Service interface
    type IMediaApiService =
      abstract member MediaCreate : MediaCreateBodyParams -> MediaCreateResult
      abstract member MediaGet : unit -> MediaGetResult
      abstract member MediaList : unit -> MediaListResult
    //#endregion