namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseInviteDataResponseInviteData
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteAssetsSummary

module InviteResponse =

  //#region InviteResponse


  type InviteResponse = {
    AssetsSummary : InviteAssetsSummary;
    BusinessRoles : string[];
    CreatedByBusiness : BusinessAccessUserSummary;
    CreatedByUser : BusinessAccessUserSummary;
    CreatedTime : int;
    Id : string;
    InviteData : BaseInviteDataResponseInviteData;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
