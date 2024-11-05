namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessAccessUserSummary

module CreateInvitesResultsResponseArrayItemsInnerInvite =

  //#region CreateInvitesResultsResponseArrayItemsInnerInvite

  [<CLIMutable>]
  type CreateInvitesResultsResponseArrayItemsInnerInvite = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "user")>]
    User : BusinessAccessUserSummary;
  }

  //#endregion
