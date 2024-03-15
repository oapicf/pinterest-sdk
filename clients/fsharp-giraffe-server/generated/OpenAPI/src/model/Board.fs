namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardMedia
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.string option

module Board =

  //#region Board

  //#region enums
  type PrivacyEnum = PUBLICEnum of string  |  PROTECTEDEnum of string  |  SECRETEnum of string  
  //#endregion

  type Board = {
    Id : string;
    CreatedAt : Nullable<DateTime>;
    BoardPinsModifiedAt : Nullable<DateTime>;
    Name : string;
    Description : string option;
    CollaboratorCount : int;
    PinCount : int;
    FollowerCount : int;
    Media : BoardMedia;
    Owner : BoardOwner;
    Privacy : PrivacyEnum;
  }
  //#endregion
