namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendsAgeDistribution
open OpenAPI.Model.TrendsGenderDistribution

module TrendingKeywordDemographics =

  //#region TrendingKeywordDemographics

  [<CLIMutable>]
  type TrendingKeywordDemographics = {
    [<JsonProperty(PropertyName = "age_distribution")>]
    AgeDistribution : TrendsAgeDistribution;
    [<JsonProperty(PropertyName = "gender_distribution")>]
    GenderDistribution : TrendsGenderDistribution;
  }

  //#endregion
