namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImagesBase64Item

module PinMediaSourceImagesBase64 =

  //#region PinMediaSourceImagesBase64

  [<CLIMutable>]
  type PinMediaSourceImagesBase64 = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesBase64Item[];
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
  }

  //#endregion
