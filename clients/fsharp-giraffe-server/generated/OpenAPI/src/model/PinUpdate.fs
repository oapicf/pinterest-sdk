namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinUpdateCarouselSlotsInner
open OpenAPI.Model.string option

module PinUpdate =

  //#region PinUpdate


  type PinUpdate = {
    AltText : string option;
    BoardId : string option;
    BoardSectionId : string option;
    Description : string option;
    Link : string option;
    Title : string option;
    CarouselSlots : PinUpdateCarouselSlotsInner[];
    Note : string option;
  }
  //#endregion
