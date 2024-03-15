namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NullableCatalogsItemFieldType
open OpenAPI.Model.string option

module CatalogsItemValidationDetails =

  //#region CatalogsItemValidationDetails

  [<CLIMutable>]
  type CatalogsItemValidationDetails = {
    [<JsonProperty(PropertyName = "attribute_name")>]
    AttributeName : NullableCatalogsItemFieldType;
    [<JsonProperty(PropertyName = "provided_value")>]
    ProvidedValue : string option;
  }

  //#endregion
