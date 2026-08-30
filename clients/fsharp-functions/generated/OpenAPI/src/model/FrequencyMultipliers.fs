namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module FrequencyMultipliers =

  //#region FrequencyMultipliers

  [<CLIMutable>]
  type FrequencyMultipliers = {
    [<JsonProperty(PropertyName = "IMPRESSION_COUNT")>]
    IMPRESSION_COUNT : string;
  }

  //#endregion
