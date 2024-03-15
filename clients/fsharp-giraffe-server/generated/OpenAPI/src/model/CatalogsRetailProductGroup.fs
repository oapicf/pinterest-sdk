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
  //#region enums
  type FeedIdEnum = NullEnum of string option  
  //#endregion

  type CatalogsRetailProductGroup = {
    CatalogType : CatalogTypeEnum;
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFilters;
    IsFeatured : bool;
    Type : CatalogsProductGroupType;
    Status : CatalogsProductGroupStatus;
    CreatedAt : int;
    UpdatedAt : int;
    FeedId : FeedIdEnum;
  }
  //#endregion
