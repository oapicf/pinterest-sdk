namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CancelInviteException
open OpenAPI.Model.CancelInviteResult

module CancelInviteResultItem =

  //#region CancelInviteResultItem


  type CancelInviteResultItem = {
    Exception : CancelInviteException;
    Invite : CancelInviteResult;
  }
  //#endregion
