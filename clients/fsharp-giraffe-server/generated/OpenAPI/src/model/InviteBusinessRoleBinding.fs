namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary

module InviteBusinessRoleBinding =

  //#region InviteBusinessRoleBinding


  type InviteBusinessRoleBinding = {
    CreatedByBusinessId : string;
    CreatedByUserId : string;
    User : BusinessAccessUserSummary;
    Id : string;
    InviteData : BaseInviteDataResponseInviteData;
    IsReceivedInvite : bool;
  }
  //#endregion
