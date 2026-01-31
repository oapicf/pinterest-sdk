namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.LabelUpdateRequest
open OpenAPI.Model.LabelsList200Response
open OpenAPI.Model.LabelsResponse
open LabelsApiHandlerParams
open LabelsApiServiceInterface
open System.Collections.Generic
open System

module LabelsApiServiceImplementation =

    //#region Service implementation
    type LabelsApiServiceImpl() =
      interface ILabelsApiService with

        member this.LabelsCreate (parameters:LabelsCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> LabelsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsCreateDefaultStatusCode { content = content }

        member this.LabelsList () =
          if true then
            let content = "Success" :> obj :?> LabelsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsListDefaultStatusCode { content = content }

        member this.LabelsUpdate (parameters:LabelsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> LabelsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LabelsUpdateDefaultStatusCode { content = content }

      //#endregion

    let LabelsApiService = LabelsApiServiceImpl() :> ILabelsApiService