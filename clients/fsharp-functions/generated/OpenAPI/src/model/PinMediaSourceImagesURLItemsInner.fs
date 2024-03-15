namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceImagesURLItemsInner =

  //#region PinMediaSourceImagesURLItemsInner

  [<CLIMutable>]
  type PinMediaSourceImagesURLItemsInner = {
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
