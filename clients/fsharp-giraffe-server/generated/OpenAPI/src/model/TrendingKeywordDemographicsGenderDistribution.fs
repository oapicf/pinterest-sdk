namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module TrendingKeywordDemographicsGenderDistribution =

  //#region TrendingKeywordDemographicsGenderDistribution

  //#region enums
  type GenderDistributionEnum = MaleEnum of string  |  FemaleEnum of string  |  UnspecifiedEnum of string  
  //#endregion

  type TrendingKeyword_demographics_gender_distribution = {
    GenderDistribution : GenderDistributionEnum;
  }
  //#endregion
