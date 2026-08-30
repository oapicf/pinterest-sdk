namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TrendingPin =

  //#region TrendingPin

  [<CLIMutable>]
  type TrendingPin = {
    [<JsonProperty(PropertyName = "color")>]
    Color : string;
    [<JsonProperty(PropertyName = "height")>]
    Height : int;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "src")>]
    Src : string;
    [<JsonProperty(PropertyName = "vertical_offset")>]
    VerticalOffset : double;
    [<JsonProperty(PropertyName = "width")>]
    Width : int;
  }

  //#endregion
