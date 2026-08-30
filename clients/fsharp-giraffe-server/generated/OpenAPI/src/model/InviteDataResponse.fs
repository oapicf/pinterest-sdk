namespace OpenAPI.Model

open System
open System.Collections.Generic

module InviteDataResponse =

  //#region InviteDataResponse


  type InviteDataResponse = {
    InviteExpiration : int;
    InviteStatus : string;
    InviteType : string;
    LastUpdatedTime : int;
    SentAt : int;
  }
  //#endregion
