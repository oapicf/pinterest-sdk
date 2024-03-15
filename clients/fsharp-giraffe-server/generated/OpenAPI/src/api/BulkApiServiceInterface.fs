namespace OpenAPI
open BulkApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BulkApiServiceInterface =

    //#region Service interface
    type IBulkApiService =
      abstract member BulkDownloadCreate:HttpContext -> BulkDownloadCreateArgs->BulkDownloadCreateResult
      abstract member BulkRequestGet:HttpContext -> BulkRequestGetArgs->BulkRequestGetResult
      abstract member BulkUpsertCreate:HttpContext -> BulkUpsertCreateArgs->BulkUpsertCreateResult
    //#endregion