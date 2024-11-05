namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessRoleForMembers

module MembersToDeleteBodyMembersInner =

  //#region MembersToDeleteBodyMembersInner


  type MembersToDeleteBody_members_inner = {
    MemberId : string;
    BusinessRole : BusinessRoleForMembers;
  }
  //#endregion
