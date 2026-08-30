namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAgeBucket
open System.Collections.Generic

module AgeBucketMultipliers =

  //#region AgeBucketMultipliers

  [<CLIMutable>]
  type AgeBucketMultipliers = {
    [<JsonProperty(PropertyName = "AGE_BUCKET")>]
    AGE_BUCKET : TargetingSpecAgeBucket;
  }

  //#endregion
