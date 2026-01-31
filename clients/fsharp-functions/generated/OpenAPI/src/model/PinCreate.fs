namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.string option

module PinCreate =

  //#region PinCreate

  [<CLIMutable>]
  type PinCreate = {
    [<JsonProperty(PropertyName = "alt_text")>]
    AltText : string option;
    [<JsonProperty(PropertyName = "board_id")>]
    BoardId : string;
    [<JsonProperty(PropertyName = "board_section_id")>]
    BoardSectionId : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "dominant_color")>]
    DominantColor : string option;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "media_source")>]
    MediaSource : PinMediaSource;
    [<JsonProperty(PropertyName = "parent_pin_id")>]
    ParentPinId : string option;
    [<JsonProperty(PropertyName = "sponsor_id")>]
    SponsorId : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
  }

  //#endregion
