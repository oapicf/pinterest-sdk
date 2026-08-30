namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AppsflyerPlatform

module AppsflyerAudience =

  //#region AppsflyerAudience

  [<CLIMutable>]
  type AppsflyerAudience = {
    [<JsonProperty(PropertyName = "container_id")>]
    ContainerId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "platform")>]
    Platform : AppsflyerPlatform;
  }

  //#endregion
