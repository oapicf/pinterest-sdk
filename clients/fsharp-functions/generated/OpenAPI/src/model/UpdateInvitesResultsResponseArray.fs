namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteActionResultItem

module UpdateInvitesResultsResponseArray =

  //#region UpdateInvitesResultsResponseArray

  [<CLIMutable>]
  type UpdateInvitesResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : InviteActionResultItem[];
  }

  //#endregion
