namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.string option

module CatalogsRetailProductGroup =

  //#region CatalogsRetailProductGroup

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailProductGroup = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Country : string option;
    CreatedAt : int;
    Description : string option;
    FeedId : string option;
    Filters : CatalogsProductGroupFilters;
    Id : string;
    IsFeatured : bool;
    Locale : string option;
    Name : string;
    Status : CatalogsProductGroupStatus;
    Type : CatalogsProductGroupType;
    UpdatedAt : int;
  }
  //#endregion
