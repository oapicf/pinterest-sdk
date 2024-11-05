namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.LeadsExportCreateRequest
open OpenAPI.Model.LeadsExportCreateResponse
open OpenAPI.Model.LeadsExportResponseData
open LeadsExportApiHandlerParams
open LeadsExportApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module LeadsExportApiServiceImplementation =

    //#region Service implementation
    type LeadsExportApiServiceImpl() =
      interface ILeadsExportApiService with

        member this.LeadsExportCreate ctx args =
          if true then
            let content = "Success" :> obj :?> LeadsExportCreateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateDefaultStatusCode { content = content }

        member this.LeadsExportGet ctx args =
          if true then
            let content = "Success" :> obj :?> LeadsExportResponseData // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode400 { content = content }
          else if true then
            let content = "Invalid leads export id parameter." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetDefaultStatusCode { content = content }

      //#endregion

    let LeadsExportApiService = LeadsExportApiServiceImpl() :> ILeadsExportApiService