namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessRoleForMembers

module UpdateMemberBusinessRoleBody =

  //#region UpdateMemberBusinessRoleBody


  type UpdateMemberBusinessRoleBody = {
    BusinessRole : BusinessRoleForMembers;
    MemberId : string;
  }
  //#endregion
