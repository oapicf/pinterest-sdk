namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponseInviteData

module InviteBusinessRoleBinding =

  //#region InviteBusinessRoleBinding


  type InviteBusinessRoleBinding = {
    Id : string;
    InviteData : BaseInviteDataResponseInviteData;
    IsReceivedInvite : bool;
    User : obj;
    CreatedByBusinessId : string;
    CreatedByUserId : string;
  }
  //#endregion
