namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.NonNullableCatalogsCurrency
open OpenAPI.Model.NonNullableProductAvailabilityType
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsProductMetadata =

  //#region CatalogsProductMetadata

  [<CLIMutable>]
  type CatalogsProductMetadata = {
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "item_group_id")>]
    ItemGroupId : string option;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : NonNullableProductAvailabilityType;
    [<JsonProperty(PropertyName = "price")>]
    Price : decimal;
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : decimal option;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : NonNullableCatalogsCurrency;
  }

  //#endregion
