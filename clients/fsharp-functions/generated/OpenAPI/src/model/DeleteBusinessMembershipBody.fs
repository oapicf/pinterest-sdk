namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeleteBusinessMembershipMember

module DeleteBusinessMembershipBody =

  //#region DeleteBusinessMembershipBody

  [<CLIMutable>]
  type DeleteBusinessMembershipBody = {
    [<JsonProperty(PropertyName = "members")>]
    Members : DeleteBusinessMembershipMember[];
  }

  //#endregion
