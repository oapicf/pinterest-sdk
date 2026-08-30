namespace OpenAPI
open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesRequest
open OpenAPI.Model.CancelInvitesResponse
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteFilterStatus
open OpenAPI.Model.InviteType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.RespondToInvitesResponseArray
open OpenAPI.Model.UpdateInvitesResultsResponseArray
open BusinessAccessInviteApiHandlerParams
open BusinessAccessInviteApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module BusinessAccessInviteApiServiceImplementation =

    //#region Service implementation
    type BusinessAccessInviteApiServiceImpl() =
      interface IBusinessAccessInviteApiService with

        member this.AssetAccessRequestsCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CreateAssetAccessRequestResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> CreateAssetAccessRequestResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateDefaultStatusCode { content = content }

        member this.CancelInvitesOrRequests ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CancelInvitesResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelInvitesOrRequestsStatusCode200 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelInvitesOrRequestsDefaultStatusCode { content = content }

        member this.CreateAssetInvites ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> UpdateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> UpdateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesDefaultStatusCode { content = content }

        member this.CreateMembershipOrPartnershipInvites ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CreateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> CreateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesDefaultStatusCode { content = content }

        member this.GetInvites ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> GetInvites200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesDefaultStatusCode { content = content }

        member this.RespondBusinessAccessInvites ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> RespondToInvitesResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessInviteApiService = BusinessAccessInviteApiServiceImpl() :> IBusinessAccessInviteApiService