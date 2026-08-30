namespace OpenAPI.Model

open System
open System.Collections.Generic
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

  //#region enums
  type FieldEnum = MINIMUMAGEEnum of string  
  //#endregion
  //#region enums
  type OperationEnum = SETEnum of string  
  //#endregion

  type TargetingSpecOperations = {
    Field : FieldEnum;
    Operation : OperationEnum;
    Values : TargetingSpecShoppingRetargeting[];
    Value : string option;
  }
  //#endregion
