namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsRetailProductMetadata
open OpenAPI.Model.Pin

module CatalogsRetailProduct =

  //#region CatalogsRetailProduct

  [<CLIMutable>]
  type CatalogsRetailProduct = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "metadata")>]
    Metadata : CatalogsRetailProductMetadata;
    [<JsonProperty(PropertyName = "pin")>]
    Pin : Pin;
  }

  //#endregion
