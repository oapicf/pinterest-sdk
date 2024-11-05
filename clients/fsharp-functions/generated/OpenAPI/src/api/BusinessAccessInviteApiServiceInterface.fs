namespace OpenAPI
open BusinessAccessInviteApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module BusinessAccessInviteApiServiceInterface =

    //#region Service interface
    type IBusinessAccessInviteApiService =
      abstract member AssetAccessRequestsCreate : AssetAccessRequestsCreateBodyParams -> AssetAccessRequestsCreateResult
      abstract member CancelInvitesOrRequests : CancelInvitesOrRequestsBodyParams -> CancelInvitesOrRequestsResult
      abstract member CreateAssetInvites : CreateAssetInvitesBodyParams -> CreateAssetInvitesResult
      abstract member CreateMembershipOrPartnershipInvites : CreateMembershipOrPartnershipInvitesBodyParams -> CreateMembershipOrPartnershipInvitesResult
      abstract member GetInvites : unit -> GetInvitesResult
      abstract member RespondBusinessAccessInvites : RespondBusinessAccessInvitesBodyParams -> RespondBusinessAccessInvitesResult
    //#endregion