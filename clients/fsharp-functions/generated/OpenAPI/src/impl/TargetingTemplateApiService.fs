namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.TargetingTemplateCreate
open OpenAPI.Model.TargetingTemplateGetResponseData
open OpenAPI.Model.TargetingTemplateList200Response
open OpenAPI.Model.TargetingTemplateUpdateRequest
open TargetingTemplateApiHandlerParams
open TargetingTemplateApiServiceInterface
open System.Collections.Generic
open System

module TargetingTemplateApiServiceImplementation =

    //#region Service implementation
    type TargetingTemplateApiServiceImpl() =
      interface ITargetingTemplateApiService with

        member this.TargetingTemplateCreate (parameters:TargetingTemplateCreateBodyParams) =
          if true then
            let content = "Success" :> obj :?> TargetingTemplateGetResponseData // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateDefaultStatusCode { content = content }

        member this.TargetingTemplateList () =
          if true then
            let content = "Success" :> obj :?> TargetingTemplateList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListDefaultStatusCode { content = content }

        member this.TargetingTemplateUpdate (parameters:TargetingTemplateUpdateBodyParams) =
          if true then
            let content = "Success" 
            TargetingTemplateUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateDefaultStatusCode { content = content }

      //#endregion

    let TargetingTemplateApiService = TargetingTemplateApiServiceImpl() :> ITargetingTemplateApiService