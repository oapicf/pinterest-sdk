namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsProductGroupStatus
open OpenAPI.Model.CatalogsProductGroupType
open OpenAPI.Model.string option

module CatalogsProductGroup =

  //#region CatalogsProductGroup


  type CatalogsProductGroup = {
    Id : string;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFilters;
    Type : CatalogsProductGroupType;
    Status : CatalogsProductGroupStatus;
    FeedId : string;
    CreatedAt : int;
    UpdatedAt : int;
  }
  //#endregion
