namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageSize
open OpenAPI.Model.string option

module ImageMetadata =

  //#region ImageMetadata

  [<CLIMutable>]
  type ImageMetadata = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageSize;
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
  }

  //#endregion
