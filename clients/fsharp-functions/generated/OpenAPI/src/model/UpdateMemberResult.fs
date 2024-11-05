namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateMemberResult =

  //#region UpdateMemberResult

  [<CLIMutable>]
  type UpdateMemberResult = {
    [<JsonProperty(PropertyName = "business_role")>]
    BusinessRole : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
  }

  //#endregion
