namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TrendingPin =

  //#region TrendingPin

  [<CLIMutable>]
  type TrendingPin = {
    [<JsonProperty(PropertyName = "height")>]
    Height : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "src")>]
    Src : string;
    [<JsonProperty(PropertyName = "width")>]
    Width : int;
  }

  //#endregion
