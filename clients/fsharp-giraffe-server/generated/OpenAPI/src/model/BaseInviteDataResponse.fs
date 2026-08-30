namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessAccessUserSummary
open OpenAPI.Model.InviteDataResponse

module BaseInviteDataResponse =

  //#region BaseInviteDataResponse


  type BaseInviteDataResponse = {
    Id : string;
    InviteData : InviteDataResponse;
    IsReceivedInvite : bool;
    User : BusinessAccessUserSummary;
  }
  //#endregion
