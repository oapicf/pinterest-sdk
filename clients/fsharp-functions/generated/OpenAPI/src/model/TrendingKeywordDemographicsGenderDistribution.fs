namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module TrendingKeywordDemographicsGenderDistribution =

  //#region TrendingKeywordDemographicsGenderDistribution

  [<CLIMutable>]
  type TrendingKeywordDemographicsGenderDistribution = {
    [<JsonProperty(PropertyName = "gender_distribution")>]
    GenderDistribution : string;
  }

  //#endregion
