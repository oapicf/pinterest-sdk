namespace OpenAPI
open TargetingTemplateApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TargetingTemplateApiServiceInterface =

    //#region Service interface
    type ITargetingTemplateApiService =
      abstract member TargetingTemplateCreate:HttpContext -> TargetingTemplateCreateArgs->TargetingTemplateCreateResult
      abstract member TargetingTemplateList:HttpContext -> TargetingTemplateListArgs->TargetingTemplateListResult
      abstract member TargetingTemplateUpdate:HttpContext -> TargetingTemplateUpdateArgs->TargetingTemplateUpdateResult
    //#endregion