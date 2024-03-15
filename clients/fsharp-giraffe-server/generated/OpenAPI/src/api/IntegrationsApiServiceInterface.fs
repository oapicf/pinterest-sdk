namespace OpenAPI
open IntegrationsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module IntegrationsApiServiceInterface =

    //#region Service interface
    type IIntegrationsApiService =
      abstract member IntegrationsCommerceDel:HttpContext -> IntegrationsCommerceDelArgs->IntegrationsCommerceDelResult
      abstract member IntegrationsCommerceGet:HttpContext -> IntegrationsCommerceGetArgs->IntegrationsCommerceGetResult
      abstract member IntegrationsCommercePatch:HttpContext -> IntegrationsCommercePatchArgs->IntegrationsCommercePatchResult
      abstract member IntegrationsCommercePost:HttpContext -> IntegrationsCommercePostArgs->IntegrationsCommercePostResult
      abstract member IntegrationsGetById:HttpContext -> IntegrationsGetByIdArgs->IntegrationsGetByIdResult
      abstract member IntegrationsGetList:HttpContext -> IntegrationsGetListArgs->IntegrationsGetListResult
      abstract member IntegrationsLogsPost:HttpContext -> IntegrationsLogsPostArgs->IntegrationsLogsPostResult
    //#endregion