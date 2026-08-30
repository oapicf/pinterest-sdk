namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecOperationAgeBucket
open OpenAPI.Model.TargetingSpecOperationAppType
open OpenAPI.Model.TargetingSpecOperationAudienceExclude
open OpenAPI.Model.TargetingSpecOperationAudienceInclude
open OpenAPI.Model.TargetingSpecOperationGender
open OpenAPI.Model.TargetingSpecOperationGeo
open OpenAPI.Model.TargetingSpecOperationGeoExclude
open OpenAPI.Model.TargetingSpecOperationInterest
open OpenAPI.Model.TargetingSpecOperationLocale
open OpenAPI.Model.TargetingSpecOperationLocation
open OpenAPI.Model.TargetingSpecOperationLocationExclude
open OpenAPI.Model.TargetingSpecOperationMaximumAge
open OpenAPI.Model.TargetingSpecOperationMinimumAge
open OpenAPI.Model.TargetingSpecOperationShoppingRetargeting
open OpenAPI.Model.TargetingSpecShoppingRetargeting
open OpenAPI.Model.string option

module TargetingSpecOperations =

  //#region TargetingSpecOperations

  [<CLIMutable>]
  type TargetingSpecOperations = {
    [<JsonProperty(PropertyName = "field")>]
    Field : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : TargetingSpecShoppingRetargeting[];
    [<JsonProperty(PropertyName = "value")>]
    Value : string option;
  }

  //#endregion
