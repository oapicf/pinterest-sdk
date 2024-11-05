namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessRoleForMembers

module MembersToDeleteBodyMembersInner =

  //#region MembersToDeleteBodyMembersInner

  [<CLIMutable>]
  type MembersToDeleteBodyMembersInner = {
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
    [<JsonProperty(PropertyName = "business_role")>]
    BusinessRole : BusinessRoleForMembers;
  }

  //#endregion
