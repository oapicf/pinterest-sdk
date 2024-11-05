namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeleteInvitesResultsResponseArrayItemsInner

module DeleteInvitesResultsResponseArray =

  //#region DeleteInvitesResultsResponseArray

  [<CLIMutable>]
  type DeleteInvitesResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : DeleteInvitesResultsResponseArrayItemsInner[];
  }

  //#endregion
