namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BaseInviteDataResponse
open OpenAPI.Model.InviteExceptionResponse

module RespondToInviteResultItem =

  //#region RespondToInviteResultItem

  [<CLIMutable>]
  type RespondToInviteResultItem = {
    [<JsonProperty(PropertyName = "exception")>]
    Exception : InviteExceptionResponse;
    [<JsonProperty(PropertyName = "invite")>]
    Invite : BaseInviteDataResponse;
  }

  //#endregion
