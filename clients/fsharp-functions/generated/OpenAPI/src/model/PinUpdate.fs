namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CarouselSlot
open OpenAPI.Model.string option

module PinUpdate =

  //#region PinUpdate

  [<CLIMutable>]
  type PinUpdate = {
    [<JsonProperty(PropertyName = "alt_text")>]
    AltText : string option;
    [<JsonProperty(PropertyName = "board_id")>]
    BoardId : string;
    [<JsonProperty(PropertyName = "board_section_id")>]
    BoardSectionId : string option;
    [<JsonProperty(PropertyName = "carousel_slots")>]
    CarouselSlots : CarouselSlot[];
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
  }

  //#endregion
