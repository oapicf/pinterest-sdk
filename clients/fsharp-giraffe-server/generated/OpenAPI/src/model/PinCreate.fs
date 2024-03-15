namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.SummaryPinMedia
open OpenAPI.Model.string option

module PinCreate =

  //#region PinCreate


  type PinCreate = {
    Id : string;
    CreatedAt : Nullable<DateTime>;
    Link : string option;
    Title : string option;
    Description : string option;
    DominantColor : string option;
    AltText : string option;
    BoardId : string;
    BoardSectionId : string option;
    BoardOwner : BoardOwner;
    Media : SummaryPinMedia;
    MediaSource : PinMediaSource;
    ParentPinId : string option;
    Note : string option;
  }
  //#endregion
