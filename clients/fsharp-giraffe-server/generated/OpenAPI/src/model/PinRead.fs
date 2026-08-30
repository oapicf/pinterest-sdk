namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AiDisclosures
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module PinRead =

  //#region PinRead


  type PinRead = {
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
    AltText : string option;
    Description : string option;
    Link : string option;
    Title : string option;
  }
  //#endregion
