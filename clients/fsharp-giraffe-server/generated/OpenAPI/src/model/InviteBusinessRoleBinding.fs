namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteDataResponse

module InviteBusinessRoleBinding =

  //#region InviteBusinessRoleBinding


  type InviteBusinessRoleBinding = {
    CreatedByBusinessId : string;
    CreatedByUserId : string;
    Id : string;
    InviteData : InviteDataResponse;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
