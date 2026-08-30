namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessRoleForMembers

module DeleteBusinessMembershipMember =

  //#region DeleteBusinessMembershipMember


  type DeleteBusinessMembershipMember = {
    BusinessRole : BusinessRoleForMembers;
    MemberId : string;
  }
  //#endregion
