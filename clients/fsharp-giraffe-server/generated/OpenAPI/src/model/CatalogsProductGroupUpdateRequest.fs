namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupUpdateRequest =

  //#region CatalogsProductGroupUpdateRequest


  type CatalogsProductGroupUpdateRequest = {
    Name : string;
    Description : string option;
    IsFeatured : bool;
    Filters : CatalogsProductGroupFiltersRequest;
  }
  //#endregion
