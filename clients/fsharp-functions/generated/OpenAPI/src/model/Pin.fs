namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardOwner
open OpenAPI.Model.PinMedia
open OpenAPI.Model.PinMediaSource
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
    [<JsonProperty(PropertyName = "alt_text")>]
    AltText : string option;
    [<JsonProperty(PropertyName = "board_id")>]
    BoardId : string;
    [<JsonProperty(PropertyName = "board_section_id")>]
    BoardSectionId : string option;
    [<JsonProperty(PropertyName = "board_owner")>]
    BoardOwner : BoardOwner;
    [<JsonProperty(PropertyName = "media")>]
    Media : PinMedia;
    [<JsonProperty(PropertyName = "media_source")>]
    MediaSource : PinMediaSource;
  }

  //#endregion
