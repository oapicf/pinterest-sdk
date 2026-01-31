namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module CatalogsRetailItemErrorResponse =

  //#region CatalogsRetailItemErrorResponse


  type CatalogsRetailItemErrorResponse = {
    CatalogType : CatalogsType;
    Errors : ItemValidationEvent[];
    ItemId : string;
  }
  //#endregion
