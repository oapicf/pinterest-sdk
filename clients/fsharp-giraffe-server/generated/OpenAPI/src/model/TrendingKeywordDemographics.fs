namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TrendingKeywordDemographicsAgeDistribution
open OpenAPI.Model.TrendingKeywordDemographicsGenderDistribution

module TrendingKeywordDemographics =

  //#region TrendingKeywordDemographics


  type TrendingKeyword_demographics = {
    AgeDistribution : TrendingKeywordDemographicsAgeDistribution;
    GenderDistribution : TrendingKeywordDemographicsGenderDistribution;
  }
  //#endregion
