namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceDemographicValue

module AudienceDemographics =

  //#region AudienceDemographics

  [<CLIMutable>]
  type AudienceDemographics = {
    [<JsonProperty(PropertyName = "ages")>]
    Ages : AudienceDemographicValue[];
    [<JsonProperty(PropertyName = "genders")>]
    Genders : AudienceDemographicValue[];
    [<JsonProperty(PropertyName = "devices")>]
    Devices : AudienceDemographicValue[];
    [<JsonProperty(PropertyName = "metros")>]
    Metros : AudienceDemographicValue[];
    [<JsonProperty(PropertyName = "countries")>]
    Countries : AudienceDemographicValue[];
  }

  //#endregion
