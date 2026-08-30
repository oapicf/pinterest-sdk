namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessMembershipMember

module UpdateBusinessMembershipsResponse =

  //#region UpdateBusinessMembershipsResponse

  [<CLIMutable>]
  type UpdateBusinessMembershipsResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : BusinessMembershipMember[];
  }

  //#endregion
