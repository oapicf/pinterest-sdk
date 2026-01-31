namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GenderDemographics =

  //#region GenderDemographics

  [<CLIMutable>]
  type GenderDemographics = {
    [<JsonProperty(PropertyName = "female")>]
    Female : decimal;
    [<JsonProperty(PropertyName = "male")>]
    Male : decimal;
    [<JsonProperty(PropertyName = "unspecified")>]
    Unspecified : decimal;
  }

  //#endregion
