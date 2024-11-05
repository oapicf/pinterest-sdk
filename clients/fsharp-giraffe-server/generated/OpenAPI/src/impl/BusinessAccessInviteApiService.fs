namespace OpenAPI
open OpenAPI.Model.AuthRespondInvitesBody
open OpenAPI.Model.CancelInvitesBody
open OpenAPI.Model.CreateAssetAccessRequestBody
open OpenAPI.Model.CreateAssetAccessRequestResponse
open OpenAPI.Model.CreateAssetInvitesRequest
open OpenAPI.Model.CreateInvitesResultsResponseArray
open OpenAPI.Model.CreateMembershipOrPartnershipInvitesBody
open OpenAPI.Model.DeleteInvitesResultsResponseArray
open OpenAPI.Model.Error
open OpenAPI.Model.GetInvites200Response
open OpenAPI.Model.InviteType
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
            let content = "Success" :> obj :?> CreateAssetAccessRequestResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AssetAccessRequestsCreateDefaultStatusCode { content = content }

        member this.CancelInvitesOrRequests ctx args =
          if true then
            let content = "Success" :> obj :?> DeleteInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelInvitesOrRequestsStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CancelInvitesOrRequestsDefaultStatusCode { content = content }

        member this.CreateAssetInvites ctx args =
          if true then
            let content = "Success" :> obj :?> UpdateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateAssetInvitesDefaultStatusCode { content = content }

        member this.CreateMembershipOrPartnershipInvites ctx args =
          if true then
            let content = "Success" :> obj :?> CreateInvitesResultsResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CreateMembershipOrPartnershipInvitesDefaultStatusCode { content = content }

        member this.GetInvites ctx args =
          if true then
            let content = "Success" :> obj :?> GetInvites200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetInvitesDefaultStatusCode { content = content }

        member this.RespondBusinessAccessInvites ctx args =
          if true then
            let content = "Success" :> obj :?> RespondToInvitesResponseArray // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            RespondBusinessAccessInvitesDefaultStatusCode { content = content }

      //#endregion

    let BusinessAccessInviteApiService = BusinessAccessInviteApiServiceImpl() :> IBusinessAccessInviteApiService