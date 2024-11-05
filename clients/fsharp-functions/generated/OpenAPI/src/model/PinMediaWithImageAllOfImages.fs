namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaWithImageAllOfImages =

  //#region PinMediaWithImageAllOfImages

  [<CLIMutable>]
  type PinMediaWithImageAllOfImages = {
    [<JsonProperty(PropertyName = "150x150")>]
    _150x150 : obj;
    [<JsonProperty(PropertyName = "400x300")>]
    _400x300 : obj;
    [<JsonProperty(PropertyName = "600x")>]
    _600x : obj;
    [<JsonProperty(PropertyName = "1200x")>]
    _1200x : obj;
  }

  //#endregion
