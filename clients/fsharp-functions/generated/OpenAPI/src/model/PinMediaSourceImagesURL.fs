namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImagesURLItem

module PinMediaSourceImagesURL =

  //#region PinMediaSourceImagesURL

  [<CLIMutable>]
  type PinMediaSourceImagesURL = {
    [<JsonProperty(PropertyName = "index")>]
    Index : int;
    [<JsonProperty(PropertyName = "items")>]
    Items : PinMediaSourceImagesURLItem[];
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
  }

  //#endregion
