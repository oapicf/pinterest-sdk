namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroup
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.string option

module CatalogsProductGroupsCreate201Response =

  //#region CatalogsProductGroupsCreate201Response

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type catalogs_product_groups_create_201_response = {
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
