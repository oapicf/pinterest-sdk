namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessRoleForMembers

module UpdateMemberBusinessRoleBody =

  //#region UpdateMemberBusinessRoleBody

  [<CLIMutable>]
  type UpdateMemberBusinessRoleBody = {
    [<JsonProperty(PropertyName = "business_role")>]
    BusinessRole : BusinessRoleForMembers;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
  }

  //#endregion
