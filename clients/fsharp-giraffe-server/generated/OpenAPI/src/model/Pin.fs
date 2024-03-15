namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.SummaryPinMedia
open OpenAPI.Model.string option

module Pin =

  //#region Pin


  type Pin = {
    Id : string;
    CreatedAt : Nullable<DateTime>;
    Link : string option;
    Title : string option;
    Description : string option;
    DominantColor : string option;
    AltText : string option;
    CreativeType : CreativeType;
    BoardId : string;
    BoardSectionId : string option;
    BoardOwner : BoardOwner;
    IsOwner : bool;
    Media : SummaryPinMedia;
    MediaSource : PinMediaSource;
    ParentPinId : string option;
    IsStandard : bool;
    HasBeenPromoted : bool;
    Note : string option;
    PinMetrics : obj;
  }
  //#endregion
