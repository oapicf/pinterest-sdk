namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteAssetsSummary
open OpenAPI.Model.InviteDataResponse

module InviteResponse =

  //#region InviteResponse


  type InviteResponse = {
    AssetsSummary : InviteAssetsSummary;
    BusinessRoles : string[];
    CreatedByBusiness : BusinessAccessUserSummary;
    CreatedByUser : BusinessAccessUserSummary;
    CreatedTime : int;
    Id : string;
    InviteData : InviteDataResponse;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
