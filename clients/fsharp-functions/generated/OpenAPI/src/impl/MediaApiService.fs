namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.MediaUpload
open OpenAPI.Model.MediaUploadDetails
open OpenAPI.Model.MediaUploadRequest
open OpenAPI.Model.Paginated
open MediaApiHandlerParams
open MediaApiServiceInterface
open System.Collections.Generic
open System

module MediaApiServiceImplementation =

    //#region Service implementation
    type MediaApiServiceImpl() =
      interface IMediaApiService with

        member this.MediaCreate (parameters:MediaCreateBodyParams) =
          if true then
            let content = "response" :> obj :?> MediaUpload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaCreateStatusCode201 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaCreateDefaultStatusCode { content = content }

        member this.MediaGet () =
          if true then
            let content = "response" :> obj :?> MediaUploadDetails // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaGetStatusCode200 { content = content }
          else if true then
            let content = "Media upload not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaGetDefaultStatusCode { content = content }

        member this.MediaList () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MediaListDefaultStatusCode { content = content }

      //#endregion

    let MediaApiService = MediaApiServiceImpl() :> IMediaApiService