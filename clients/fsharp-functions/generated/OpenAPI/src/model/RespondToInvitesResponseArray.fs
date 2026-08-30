namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RespondToInviteResultItem

module RespondToInvitesResponseArray =

  //#region RespondToInvitesResponseArray

  [<CLIMutable>]
  type RespondToInvitesResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : RespondToInviteResultItem[];
  }

  //#endregion
