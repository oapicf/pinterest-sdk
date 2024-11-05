namespace OpenAPI
open TargetingTemplateApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TargetingTemplateApiServiceInterface =

    //#region Service interface
    type ITargetingTemplateApiService =
      abstract member TargetingTemplateCreate : TargetingTemplateCreateBodyParams -> TargetingTemplateCreateResult
      abstract member TargetingTemplateList : unit -> TargetingTemplateListResult
      abstract member TargetingTemplateUpdate : TargetingTemplateUpdateBodyParams -> TargetingTemplateUpdateResult
    //#endregion