namespace OpenAPI.Model

open System
open System.Collections.Generic
open System.Collections.Generic

module TrendingKeywordDemographicsAgeDistribution =

  //#region TrendingKeywordDemographicsAgeDistribution

  //#region enums
  type AgeDistributionEnum = _1824Enum of string  |  _2534Enum of string  |  _3544Enum of string  |  _4549Enum of string  |  _5054Enum of string  |  _5564Enum of string  |  _65Enum of string  
  //#endregion

  type TrendingKeyword_demographics_age_distribution = {
    AgeDistribution : AgeDistributionEnum;
  }
  //#endregion
