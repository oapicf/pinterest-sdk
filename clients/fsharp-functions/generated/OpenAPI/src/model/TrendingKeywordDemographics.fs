namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendingKeywordDemographicsAgeDistribution
open OpenAPI.Model.TrendingKeywordDemographicsGenderDistribution

module TrendingKeywordDemographics =

  //#region TrendingKeywordDemographics

  [<CLIMutable>]
  type TrendingKeywordDemographics = {
    [<JsonProperty(PropertyName = "age_distribution")>]
    AgeDistribution : TrendingKeywordDemographicsAgeDistribution;
    [<JsonProperty(PropertyName = "gender_distribution")>]
    GenderDistribution : TrendingKeywordDemographicsGenderDistribution;
  }

  //#endregion
