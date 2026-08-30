namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AiDisclosuresUpdate
open OpenAPI.Model.CarouselSlot
open OpenAPI.Model.string option

module PinUpdate =

  //#region PinUpdate


  type PinUpdate = {
    AiDisclosures : AiDisclosuresUpdate;
    AltText : string option;
    BoardId : string;
    BoardSectionId : string option;
    CarouselSlots : CarouselSlot[];
    Description : string option;
    Link : string option;
    Title : string option;
  }
  //#endregion
