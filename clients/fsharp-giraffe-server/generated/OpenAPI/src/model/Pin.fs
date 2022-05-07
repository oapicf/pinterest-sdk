namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.string option

module Pin =

  //#region Pin


  type Pin = {
    Id : string;
    CreatedAt : Nullable<DateTime>;
    Link : string option;
    Title : string option;
    Description : string option;
    AltText : string option;
    BoardId : string;
    BoardSectionId : string option;
    BoardOwner : BoardOwner;
    Media : PinMedia;
    MediaSource : PinMediaSource;
  }
  //#endregion
