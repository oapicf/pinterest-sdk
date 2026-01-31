namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemResponseOneOf
open OpenAPI.Model.ItemResponseOneOf1
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse


  type ItemResponse = {
    CatalogType : CatalogsType;
    Attributes : CatalogsCreativeAssetsAttributes;
    ItemId : string;
    Pins : Pin[];
    HotelId : string;
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
  }
  //#endregion
