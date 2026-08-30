namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdgroupTrackingFeatureType

module AdgroupTrackingFeatures =

  //#region AdgroupTrackingFeatures

  [<CLIMutable>]
  type AdgroupTrackingFeatures = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : AdgroupTrackingFeatureType[];
  }

  //#endregion
