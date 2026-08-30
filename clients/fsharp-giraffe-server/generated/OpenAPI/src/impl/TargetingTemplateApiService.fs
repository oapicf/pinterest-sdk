namespace OpenAPI
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.TargetingTemplate
open OpenAPI.Model.TargetingTemplateCreate
open OpenAPI.Model.TargetingTemplateList200Response
open OpenAPI.Model.TargetingTemplateUpdateRequestReadOrUpdate
open TargetingTemplateApiHandlerParams
open TargetingTemplateApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module TargetingTemplateApiServiceImplementation =

    //#region Service implementation
    type TargetingTemplateApiServiceImpl() =
      interface ITargetingTemplateApiService with

        member this.TargetingTemplateCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> TargetingTemplate // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> TargetingTemplate // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateCreateDefaultStatusCode { content = content }

        member this.TargetingTemplateList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> TargetingTemplateList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateListDefaultStatusCode { content = content }

        member this.TargetingTemplateUpdate ctx args =
          if true then
            let content = "The request has succeeded." 
            TargetingTemplateUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingTemplateUpdateDefaultStatusCode { content = content }

      //#endregion

    let TargetingTemplateApiService = TargetingTemplateApiServiceImpl() :> ITargetingTemplateApiService