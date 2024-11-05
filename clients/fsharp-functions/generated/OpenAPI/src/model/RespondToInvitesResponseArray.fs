namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.RespondToInvitesResponseArrayItemsInner

module RespondToInvitesResponseArray =

  //#region RespondToInvitesResponseArray

  [<CLIMutable>]
  type RespondToInvitesResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : RespondToInvitesResponseArrayItemsInner[];
  }

  //#endregion
