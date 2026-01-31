namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceImagesURLItem =

  //#region PinMediaSourceImagesURLItem

  [<CLIMutable>]
  type PinMediaSourceImagesURLItem = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
