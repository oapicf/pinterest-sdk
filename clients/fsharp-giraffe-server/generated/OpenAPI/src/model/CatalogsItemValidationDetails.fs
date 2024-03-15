namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NullableCatalogsItemFieldType
open OpenAPI.Model.string option

module CatalogsItemValidationDetails =

  //#region CatalogsItemValidationDetails


  type CatalogsItemValidationDetails = {
    AttributeName : NullableCatalogsItemFieldType;
    ProvidedValue : string option;
  }
  //#endregion
