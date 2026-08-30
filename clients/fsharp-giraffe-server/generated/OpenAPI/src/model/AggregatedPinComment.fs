namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AiDisclosures
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module AggregatedPinComment =

  //#region AggregatedPinComment


  type AggregatedPinComment = {
    AiDisclosures : AiDisclosures;
    AltText : string option;
    BoardId : string;
    BoardOwner : BoardOwner;
    BoardSectionId : string option;
    CreatedAt : Nullable<DateTime>;
    CreativeType : CreativeType;
    Description : string option;
    DominantColor : string option;
    HasBeenPromoted : bool;
    Id : string;
    IsOwner : bool;
    IsProduct : bool;
    IsStandard : bool;
    Link : string option;
    Media : PinMedia;
    ParentPinId : string option;
    PinMetrics : obj;
    Title : string option;
  }
  //#endregion
