namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AppsflyerPlatform

module AppsflyerAudienceCreate =

  //#region AppsflyerAudienceCreate

  [<CLIMutable>]
  type AppsflyerAudienceCreate = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "platform")>]
    Platform : AppsflyerPlatform;
  }

  //#endregion
