namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CancelInviteException
open OpenAPI.Model.CancelInviteResult

module CancelInviteResultItem =

  //#region CancelInviteResultItem

  [<CLIMutable>]
  type CancelInviteResultItem = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : CancelInviteException;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : CancelInviteResult;
  }

  //#endregion
