namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteActionResultItem

module CreateInvitesResultsResponseArray =

  //#region CreateInvitesResultsResponseArray

  [<CLIMutable>]
  type CreateInvitesResultsResponseArray = {
    [<JsonProperty(PropertyName = "items")>]
    Items : InviteActionResultItem[];
  }

  //#endregion
