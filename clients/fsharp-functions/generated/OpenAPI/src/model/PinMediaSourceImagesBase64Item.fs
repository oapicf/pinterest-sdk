namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContentType

module PinMediaSourceImagesBase64Item =

  //#region PinMediaSourceImagesBase64Item

  [<CLIMutable>]
  type PinMediaSourceImagesBase64Item = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : ContentType;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
