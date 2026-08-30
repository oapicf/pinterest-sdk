namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendsGender
open System.Collections.Generic

module TrendsGenderDistribution =

  //#region TrendsGenderDistribution

  [<CLIMutable>]
  type TrendsGenderDistribution = {
    [<JsonProperty(PropertyName = "gender_distribution")>]
    GenderDistribution : TrendsGender;
  }

  //#endregion
