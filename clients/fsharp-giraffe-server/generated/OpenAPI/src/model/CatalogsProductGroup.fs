namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.string option

module CatalogsProductGroup =

  //#region CatalogsProductGroup

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsProductGroup = {
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
