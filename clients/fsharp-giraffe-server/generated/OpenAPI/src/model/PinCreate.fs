namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AiDisclosures
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.string option

module PinCreate =

  //#region PinCreate


  type PinCreate = {
    AiDisclosures : AiDisclosures;
    AltText : string option;
    BoardId : string;
    BoardSectionId : string option;
    Description : string option;
    DominantColor : string option;
    Link : string option;
    MediaSource : PinMediaSource;
    ParentPinId : string option;
    SponsorId : string option;
    Title : string option;
  }
  //#endregion
