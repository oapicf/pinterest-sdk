namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendsAgeBucket
open System.Collections.Generic

module TrendsAgeDistribution =

  //#region TrendsAgeDistribution

  [<CLIMutable>]
  type TrendsAgeDistribution = {
    [<JsonProperty(PropertyName = "age_distribution")>]
    AgeDistribution : TrendsAgeBucket;
  }

  //#endregion
