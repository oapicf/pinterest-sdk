namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AiDisclosures
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module PinBase =

  //#region PinBase


  type PinBase = {
    AiDisclosures : AiDisclosures;
    BoardId : string;
    BoardOwner : BoardOwner;
    BoardSectionId : string option;
    CreatedAt : Nullable<DateTime>;
    CreativeType : CreativeType;
    DominantColor : string option;
    HasBeenPromoted : bool;
    Id : string;
    IsOwner : bool;
    IsProduct : bool;
    IsStandard : bool;
    Media : PinMedia;
    ParentPinId : string option;
    PinMetrics : obj;
  }
  //#endregion
