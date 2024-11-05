namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.BusinessMemberAssetsSummary
open OpenAPI.Model.int option

module UserBusinessRoleBinding =

  //#region UserBusinessRoleBinding


  type UserBusinessRoleBinding = {
    AssetsSummary : BusinessMemberAssetsSummary;
    BusinessRoles : string[];
    CreatedByBusiness : BusinessAccessUserSummary;
    CreatedByUser : BusinessAccessUserSummary;
    CreatedTime : int option;
    Id : string;
    IsSharedPartner : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
