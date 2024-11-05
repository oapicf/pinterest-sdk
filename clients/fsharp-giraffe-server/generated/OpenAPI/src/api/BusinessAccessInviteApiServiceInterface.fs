namespace OpenAPI
open BusinessAccessInviteApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module BusinessAccessInviteApiServiceInterface =

    //#region Service interface
    type IBusinessAccessInviteApiService =
      abstract member AssetAccessRequestsCreate:HttpContext -> AssetAccessRequestsCreateArgs->AssetAccessRequestsCreateResult
      abstract member CancelInvitesOrRequests:HttpContext -> CancelInvitesOrRequestsArgs->CancelInvitesOrRequestsResult
      abstract member CreateAssetInvites:HttpContext -> CreateAssetInvitesArgs->CreateAssetInvitesResult
      abstract member CreateMembershipOrPartnershipInvites:HttpContext -> CreateMembershipOrPartnershipInvitesArgs->CreateMembershipOrPartnershipInvitesResult
      abstract member GetInvites:HttpContext -> GetInvitesArgs->GetInvitesResult
      abstract member RespondBusinessAccessInvites:HttpContext -> RespondBusinessAccessInvitesArgs->RespondBusinessAccessInvitesResult
    //#endregion