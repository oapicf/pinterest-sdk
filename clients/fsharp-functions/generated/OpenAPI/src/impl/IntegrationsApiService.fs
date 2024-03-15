namespace OpenAPI
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error
open OpenAPI.Model.IntegrationLogsRequest
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationRequest
open OpenAPI.Model.IntegrationRequestPatch
open OpenAPI.Model.IntegrationsGetList200Response
open IntegrationsApiHandlerParams
open IntegrationsApiServiceInterface
open System.Collections.Generic
open System

module IntegrationsApiServiceImplementation =

    //#region Service implementation
    type IntegrationsApiServiceImpl() =
      interface IIntegrationsApiService with

        member this.IntegrationsCommerceDel () =
          if true then
            let content = "Commerce Integration deleted successfully" 
            IntegrationsCommerceDelStatusCode204 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelDefaultStatusCode { content = content }

        member this.IntegrationsCommerceGet () =
          if true then
            let content = "Success" :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode200 { content = content }
          else if true then
            let content = "Integration not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this integration metadata." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetDefaultStatusCode { content = content }

        member this.IntegrationsCommercePatch (parameters:IntegrationsCommercePatchBodyParams) =
          if true then
            let content = "Success" :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode200 { content = content }
          else if true then
            let content = "Integration not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this integration metadata." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchDefaultStatusCode { content = content }

        member this.IntegrationsCommercePost (parameters:IntegrationsCommercePostBodyParams) =
          if true then
            let content = "Success" :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode200 { content = content }
          else if true then
            let content = "Integration not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this integration metadata." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode409 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostDefaultStatusCode { content = content }

        member this.IntegrationsGetById () =
          if true then
            let content = "Success" :> obj :?> IntegrationRecord // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode200 { content = content }
          else if true then
            let content = "Integration not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode404 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdDefaultStatusCode { content = content }

        member this.IntegrationsGetList () =
          if true then
            let content = "Success" :> obj :?> IntegrationsGetList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode200 { content = content }
          else
            let content = "Unexpected error." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListDefaultStatusCode { content = content }

        member this.IntegrationsLogsPost (parameters:IntegrationsLogsPostBodyParams) =
          if true then
            let content = "Success." :> obj :?> IntegrationLogsSuccessResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode200 { content = content }
          else if true then
            let content = "Bad request." :> obj :?> DetailedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostDefaultStatusCode { content = content }

      //#endregion

    let IntegrationsApiService = IntegrationsApiServiceImpl() :> IIntegrationsApiService