namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreateInvitesResultsResponseArrayItemsInner

module CreateInvitesResultsResponseArray =

  //#region CreateInvitesResultsResponseArray

  [<CLIMutable>]
  type CreateInvitesResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CreateInvitesResultsResponseArrayItemsInner[];
  }

  //#endregion
