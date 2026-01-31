namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module TrendingKeywordDemographicsAgeDistribution =

  //#region TrendingKeywordDemographicsAgeDistribution

  [<CLIMutable>]
  type TrendingKeywordDemographicsAgeDistribution = {
    [<JsonProperty(PropertyName = "age_distribution")>]
    AgeDistribution : string;
  }

  //#endregion
