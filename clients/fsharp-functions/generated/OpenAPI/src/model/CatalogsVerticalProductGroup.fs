namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroup
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroup
open OpenAPI.Model.CatalogsHotelProductGroupType
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsRetailProductGroup
open OpenAPI.Model.string option

module CatalogsVerticalProductGroup =

  //#region CatalogsVerticalProductGroup

  [<CLIMutable>]
  type CatalogsVerticalProductGroup = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : string option;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : string option;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsProductGroupStatus;
    [<JsonProperty(PropertyName = "type")>]
    Type : CatalogsHotelProductGroupType;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : int;
  }

  //#endregion
