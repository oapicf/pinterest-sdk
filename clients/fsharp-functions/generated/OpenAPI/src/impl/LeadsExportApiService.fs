namespace OpenAPI
open OpenAPI.Model.LeadsExportResponseData
open OpenAPI.Model.LeadsExports
open OpenAPI.Model.LeadsExportsCreate
open OpenAPI.Model.PinterestLibError
open LeadsExportApiHandlerParams
open LeadsExportApiServiceInterface
open System.Collections.Generic
open System

module LeadsExportApiServiceImplementation =

    //#region Service implementation
    type LeadsExportApiServiceImpl() =
      interface ILeadsExportApiService with

        member this.LeadsExportCreate (parameters:LeadsExportCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> LeadsExports // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> LeadsExports // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportCreateDefaultStatusCode { content = content }

        member this.LeadsExportGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> LeadsExportResponseData // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadsExportGetDefaultStatusCode { content = content }

      //#endregion

    let LeadsExportApiService = LeadsExportApiServiceImpl() :> ILeadsExportApiService