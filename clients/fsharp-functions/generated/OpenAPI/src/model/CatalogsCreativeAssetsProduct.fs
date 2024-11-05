namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductMetadata
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsProduct =

  //#region CatalogsCreativeAssetsProduct

  [<CLIMutable>]
  type CatalogsCreativeAssetsProduct = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : CatalogsCreativeAssetsProductMetadata;
    [<JsonProperty(PropertyName = "pin")>]
    Pin : Pin;
  }

  //#endregion
