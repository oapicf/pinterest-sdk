namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImagesBase64ItemsInner

module PinMediaSourceImagesBase64 =

  //#region PinMediaSourceImagesBase64

  [<CLIMutable>]
  type PinMediaSourceImagesBase64 = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesBase64ItemsInner[];
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
  }

  //#endregion
