namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.string option

module CatalogsRetailProductGroup =

  //#region CatalogsRetailProductGroup

  [<CLIMutable>]
  type CatalogsRetailProductGroup = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "type")>]
    Type : CatalogsProductGroupType;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsProductGroupStatus;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : int;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string option;
  }

  //#endregion
