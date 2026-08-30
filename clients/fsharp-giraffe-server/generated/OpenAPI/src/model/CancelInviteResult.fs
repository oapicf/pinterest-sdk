namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CancelInviteResultUser
open OpenAPI.Model.InviteDataResponse

module CancelInviteResult =

  //#region CancelInviteResult


  type CancelInviteResult = {
    Id : string;
    InviteData : InviteDataResponse;
    IsReceivedInvite : bool;
    User : CancelInviteResultUser;
  }
  //#endregion
