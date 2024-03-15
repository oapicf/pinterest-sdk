namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImagesURLItemsInner

module PinMediaSourceImagesURL =

  //#region PinMediaSourceImagesURL

  [<CLIMutable>]
  type PinMediaSourceImagesURL = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesURLItemsInner[];
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
  }

  //#endregion
