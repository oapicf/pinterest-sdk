namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardMedia
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.string option

module BoardBase =

  //#region BoardBase


  type BoardBase = {
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
  }
  //#endregion
