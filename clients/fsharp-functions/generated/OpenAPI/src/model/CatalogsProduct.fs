namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProduct
open OpenAPI.Model.CatalogsCreativeAssetsProductMetadata
open OpenAPI.Model.CatalogsHotelProduct
open OpenAPI.Model.CatalogsRetailProduct
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsProduct =

  //#region CatalogsProduct

  [<CLIMutable>]
  type CatalogsProduct = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : CatalogsCreativeAssetsProductMetadata;
    [<JsonProperty(PropertyName = "pin")>]
    Pin : Pin;
  }

  //#endregion
