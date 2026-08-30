namespace OpenAPI
open OpenAPI.Model.AdAccountToAdAccountSharedAudience
open OpenAPI.Model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountToBusinessSharedAudience
open OpenAPI.Model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.AdAccountsAudiencesSharedAccountsList200Response
open OpenAPI.Model.AudienceAccountType
open OpenAPI.Model.BusinessToAdAccountSharedAudience
open OpenAPI.Model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.BusinessToBusinessSharedAudience
open OpenAPI.Model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
open OpenAPI.Model.Order
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SharedAudiencesForBusinessList200Response
open AudienceSharingApiHandlerParams
open AudienceSharingApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AudienceSharingApiServiceImplementation =

    //#region Service implementation
    type AudienceSharingApiServiceImpl() =
      interface IAudienceSharingApiService with

        member this.AdAccountsAudiencesSharedAccountsList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountsAudiencesSharedAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsAudiencesSharedAccountsListDefaultStatusCode { content = content }

        member this.BusinessAccountAudiencesSharedAccountsList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountsAudiencesSharedAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BusinessAccountAudiencesSharedAccountsListDefaultStatusCode { content = content }

        member this.SharedAudiencesForBusinessList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> SharedAudiencesForBusinessList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SharedAudiencesForBusinessListDefaultStatusCode { content = content }

        member this.UpdateAdAccountToAdAccountSharedAudience ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountToAdAccountSharedAudience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToAdAccountSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateAdAccountToBusinessSharedAudience ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountToBusinessSharedAudience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateAdAccountToBusinessSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateBusinessToAdAccountSharedAudience ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessToAdAccountSharedAudience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToAdAccountSharedAudienceDefaultStatusCode { content = content }

        member this.UpdateBusinessToBusinessSharedAudience ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> BusinessToBusinessSharedAudience // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UpdateBusinessToBusinessSharedAudienceDefaultStatusCode { content = content }

      //#endregion

    let AudienceSharingApiService = AudienceSharingApiServiceImpl() :> IAudienceSharingApiService