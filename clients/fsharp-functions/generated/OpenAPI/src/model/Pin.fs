namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinMediaSource
open OpenAPI.Model.SummaryPinMedia
open OpenAPI.Model.string option

module Pin =

  //#region Pin

  [<CLIMutable>]
  type Pin = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "dominant_color")>]
    DominantColor : string option;
    [<JsonProperty(PropertyName = "alt_text")>]
    AltText : string option;
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : CreativeType;
    [<JsonProperty(PropertyName = "board_id")>]
    BoardId : string;
    [<JsonProperty(PropertyName = "board_section_id")>]
    BoardSectionId : string option;
    [<JsonProperty(PropertyName = "board_owner")>]
    BoardOwner : BoardOwner;
    [<JsonProperty(PropertyName = "is_owner")>]
    IsOwner : bool;
    [<JsonProperty(PropertyName = "media")>]
    Media : SummaryPinMedia;
    [<JsonProperty(PropertyName = "media_source")>]
    MediaSource : PinMediaSource;
    [<JsonProperty(PropertyName = "parent_pin_id")>]
    ParentPinId : string option;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
    [<JsonProperty(PropertyName = "has_been_promoted")>]
    HasBeenPromoted : bool;
    [<JsonProperty(PropertyName = "note")>]
    Note : string option;
    [<JsonProperty(PropertyName = "pin_metrics")>]
    PinMetrics : obj;
  }

  //#endregion
