namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardMedia
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.BoardPrivacy
open OpenAPI.Model.string option

module Board =

  //#region Board


  type Board = {
    BoardPinsModifiedAt : Nullable<DateTime>;
    CollaboratorCount : int;
    CreatedAt : Nullable<DateTime>;
    Description : string option;
    FollowerCount : int;
    Id : string;
    IsAdsOnly : bool;
    Media : BoardMedia;
    Name : string;
    Owner : BoardOwner;
    PinCount : int;
    Privacy : BoardPrivacy;
  }
  //#endregion
