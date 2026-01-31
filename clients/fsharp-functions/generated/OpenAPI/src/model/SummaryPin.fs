namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module SummaryPin =

  //#region SummaryPin

  [<CLIMutable>]
  type SummaryPin = {
    [<JsonProperty(PropertyName = "alt_text")>]
    AltText : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "media")>]
    Media : PinMedia;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
  }

  //#endregion
