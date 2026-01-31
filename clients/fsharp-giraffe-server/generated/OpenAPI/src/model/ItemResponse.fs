namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemResponseAnyOf
open OpenAPI.Model.ItemResponseAnyOf1
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse


  type ItemResponse = {
    CatalogType : CatalogsType;
    ItemId : string;
    Pins : Pin[];
    Attributes : CatalogsCreativeAssetsAttributes;
    HotelId : string;
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
  }
  //#endregion
