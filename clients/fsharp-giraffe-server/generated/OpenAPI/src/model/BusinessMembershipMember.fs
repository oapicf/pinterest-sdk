namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessRoleForMembers

module BusinessMembershipMember =

  //#region BusinessMembershipMember


  type BusinessMembershipMember = {
    BusinessRole : BusinessRoleForMembers;
    MemberId : string;
  }
  //#endregion
