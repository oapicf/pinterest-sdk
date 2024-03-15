namespace OpenAPI
open OpenAPI.Model.BulkDownloadRequest
open OpenAPI.Model.BulkDownloadResponse
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.BulkUpsertStatusResponse
open OpenAPI.Model.Error
open BulkApiHandlerParams
open BulkApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BulkApiServiceImplementation =

    //#region Service implementation
    type BulkApiServiceImpl() =
      interface IBulkApiService with

        member this.BulkDownloadCreate ctx args =
          if true then
            let content = "Success" :> obj :?> BulkDownloadResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateDefaultStatusCode { content = content }

        member this.BulkRequestGet ctx args =
          if true then
            let content = "Success" :> obj :?> BulkUpsertStatusResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetDefaultStatusCode { content = content }

        member this.BulkUpsertCreate ctx args =
          if true then
            let content = "Success" :> obj :?> BulkUpsertResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkUpsertCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkUpsertCreateDefaultStatusCode { content = content }

      //#endregion

    let BulkApiService = BulkApiServiceImpl() :> IBulkApiService