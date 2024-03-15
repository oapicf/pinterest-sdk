namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NonNullableCatalogsCurrency
open OpenAPI.Model.NonNullableProductAvailabilityType
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsProductMetadata =

  //#region CatalogsProductMetadata


  type CatalogsProductMetadata = {
    ItemId : string;
    ItemGroupId : string option;
    Availability : NonNullableProductAvailabilityType;
    Price : decimal;
    SalePrice : decimal option;
    Currency : NonNullableCatalogsCurrency;
  }
  //#endregion
