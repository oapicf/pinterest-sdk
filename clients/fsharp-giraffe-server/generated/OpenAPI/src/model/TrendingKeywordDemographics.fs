namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TrendsAgeDistribution
open OpenAPI.Model.TrendsGenderDistribution

module TrendingKeywordDemographics =

  //#region TrendingKeywordDemographics


  type TrendingKeywordDemographics = {
    AgeDistribution : TrendsAgeDistribution;
    GenderDistribution : TrendsGenderDistribution;
  }
  //#endregion
