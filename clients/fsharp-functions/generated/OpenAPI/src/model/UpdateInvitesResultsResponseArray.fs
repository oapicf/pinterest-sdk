namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateInvitesResultsResponseArrayItemsInner

module UpdateInvitesResultsResponseArray =

  //#region UpdateInvitesResultsResponseArray

  [<CLIMutable>]
  type UpdateInvitesResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UpdateInvitesResultsResponseArrayItemsInner[];
  }

  //#endregion
