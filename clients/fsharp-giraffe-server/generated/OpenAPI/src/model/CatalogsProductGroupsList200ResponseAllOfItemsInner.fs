namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroup
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.string option

module CatalogsProductGroupsList200ResponseAllOfItemsInner =

  //#region CatalogsProductGroupsList200ResponseAllOfItemsInner

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type catalogs_product_groups_list_200_response_allOf_items_inner = {
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFilters;
    IsFeatured : bool;
    Type : CatalogsProductGroupType;
    Status : CatalogsProductGroupStatus;
    CreatedAt : int;
    UpdatedAt : int;
    FeedId : string;
    CatalogType : CatalogTypeEnum;
  }
  //#endregion
