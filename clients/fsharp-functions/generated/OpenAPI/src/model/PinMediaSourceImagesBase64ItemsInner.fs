namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceImagesBase64ItemsInner =

  //#region PinMediaSourceImagesBase64ItemsInner

  [<CLIMutable>]
  type PinMediaSourceImagesBase64ItemsInner = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion
