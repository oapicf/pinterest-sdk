namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroup
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroup
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.CatalogsRetailProductGroup
open OpenAPI.Model.string option

module CatalogsVerticalProductGroup =

  //#region CatalogsVerticalProductGroup

  [<CLIMutable>]
  type CatalogsVerticalProductGroup = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsCreativeAssetsProductGroupFilters;
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
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string option;
    [<JsonProperty(PropertyName = "country")>]
    Country : string option;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : string option;
  }

  //#endregion
