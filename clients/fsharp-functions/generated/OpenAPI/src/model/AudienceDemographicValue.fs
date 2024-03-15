namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AudienceDemographicValue =

  //#region AudienceDemographicValue

  [<CLIMutable>]
  type AudienceDemographicValue = {
    [<JsonProperty(PropertyName = "key")>]
    Key : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "ratio")>]
    Ratio : decimal;
  }

  //#endregion
