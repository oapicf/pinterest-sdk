namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CancelInviteResultUser
open OpenAPI.Model.InviteDataResponse

module CancelInviteResult =

  //#region CancelInviteResult

  [<CLIMutable>]
  type CancelInviteResult = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "invite_data")>]
    InviteData : InviteDataResponse;
    [<JsonProperty(PropertyName = "is_received_invite")>]
    IsReceivedInvite : bool;
    [<JsonProperty(PropertyName = "user")>]
    User : CancelInviteResultUser;
  }

  //#endregion
