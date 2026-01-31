namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroup
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroup
open OpenAPI.Model.CatalogsHotelProductGroupType
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsRetailProductGroup
open OpenAPI.Model.string option

module CatalogsVerticalProductGroup =

  //#region CatalogsVerticalProductGroup

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalProductGroup = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Country : string option;
    CreatedAt : int;
    Description : string option;
    FeedId : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    Id : string;
    IsFeatured : bool;
    Locale : string option;
    Name : string;
    Status : CatalogsProductGroupStatus;
    Type : CatalogsHotelProductGroupType;
    UpdatedAt : int;
  }
  //#endregion
