namespace OpenAPI
open OpenAPI.Model.IntegrationLogsInvalidLogResponse
open OpenAPI.Model.IntegrationLogsRequestCreate
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationMetadataCreate
open OpenAPI.Model.IntegrationMetadataUpdate
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationsGetList200Response
open OpenAPI.Model.PinterestLibError
open IntegrationsApiHandlerParams
open IntegrationsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module IntegrationsApiServiceImplementation =

    //#region Service implementation
    type IntegrationsApiServiceImpl() =
      interface IIntegrationsApiService with

        member this.IntegrationsCommerceDel ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode200 { content = content }
          else if true then
            let content = "Resource deleted successfully." 
            IntegrationsCommerceDelStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceDelDefaultStatusCode { content = content }

        member this.IntegrationsCommerceGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommerceGetDefaultStatusCode { content = content }

        member this.IntegrationsCommercePatch ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePatchDefaultStatusCode { content = content }

        member this.IntegrationsCommercePost ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> IntegrationMetadata // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsCommercePostDefaultStatusCode { content = content }

        member this.IntegrationsGetById ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationRecord // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetByIdDefaultStatusCode { content = content }

        member this.IntegrationsGetList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationsGetList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsGetListDefaultStatusCode { content = content }

        member this.IntegrationsLogsPost ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> IntegrationLogsSuccessResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode200 { content = content }
          else if true then
            let content = "The server could not understand the request due to invalid syntax." :> obj :?> IntegrationLogsInvalidLogResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IntegrationsLogsPostDefaultStatusCode { content = content }

      //#endregion

    let IntegrationsApiService = IntegrationsApiServiceImpl() :> IIntegrationsApiService