namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.InviteExceptionResponse

module RespondToInvitesResponseArrayItemsInner =

  //#region RespondToInvitesResponseArrayItemsInner

  [<CLIMutable>]
  type RespondToInvitesResponseArrayItemsInner = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : InviteExceptionResponse;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : BaseInviteDataResponse;
  }

  //#endregion
