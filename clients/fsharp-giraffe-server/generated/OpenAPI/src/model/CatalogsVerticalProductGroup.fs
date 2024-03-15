namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroup
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.CatalogsRetailProductGroup
open OpenAPI.Model.string option

module CatalogsVerticalProductGroup =

  //#region CatalogsVerticalProductGroup

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion
  //#region enums
  type FeedIdEnum = NullEnum of string option  
  //#endregion

  type CatalogsVerticalProductGroup = {
    CatalogType : CatalogTypeEnum;
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFilters;
    CreatedAt : int;
    UpdatedAt : int;
    CatalogId : string;
    IsFeatured : bool;
    Type : CatalogsProductGroupType;
    Status : CatalogsProductGroupStatus;
    FeedId : FeedIdEnum;
  }
  //#endregion
