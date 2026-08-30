namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NonNullableCatalogsCurrency
open OpenAPI.Model.ProductAvailability
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsRetailProductMetadata =

  //#region CatalogsRetailProductMetadata


  type CatalogsRetailProductMetadata = {
    Availability : ProductAvailability;
    Currency : NonNullableCatalogsCurrency;
    ItemGroupId : string option;
    ItemId : string;
    Price : decimal;
    SalePrice : decimal option;
  }
  //#endregion
