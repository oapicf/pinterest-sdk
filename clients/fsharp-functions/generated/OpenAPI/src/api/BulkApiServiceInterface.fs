namespace OpenAPI
open BulkApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BulkApiServiceInterface =

    //#region Service interface
    type IBulkApiService =
      abstract member BulkDownloadCreate : BulkDownloadCreateBodyParams -> BulkDownloadCreateResult
      abstract member BulkRequestGet : unit -> BulkRequestGetResult
      abstract member BulkUpsertCreate : BulkUpsertCreateBodyParams -> BulkUpsertCreateResult
    //#endregion