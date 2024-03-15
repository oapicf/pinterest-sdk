namespace OpenAPI
open IntegrationsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module IntegrationsApiServiceInterface =

    //#region Service interface
    type IIntegrationsApiService =
      abstract member IntegrationsCommerceDel : unit -> IntegrationsCommerceDelResult
      abstract member IntegrationsCommerceGet : unit -> IntegrationsCommerceGetResult
      abstract member IntegrationsCommercePatch : IntegrationsCommercePatchBodyParams -> IntegrationsCommercePatchResult
      abstract member IntegrationsCommercePost : IntegrationsCommercePostBodyParams -> IntegrationsCommercePostResult
      abstract member IntegrationsGetById : unit -> IntegrationsGetByIdResult
      abstract member IntegrationsGetList : unit -> IntegrationsGetListResult
      abstract member IntegrationsLogsPost : IntegrationsLogsPostBodyParams -> IntegrationsLogsPostResult
    //#endregion