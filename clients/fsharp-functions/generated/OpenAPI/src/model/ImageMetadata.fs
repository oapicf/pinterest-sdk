namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.string option

module ImageMetadata =

  //#region ImageMetadata

  [<CLIMutable>]
  type ImageMetadata = {
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageMetadataImages;
  }

  //#endregion
