namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupUpdateRequest =

  //#region CatalogsProductGroupUpdateRequest


  type CatalogsProductGroupUpdateRequest = {
    Description : string option;
    Filters : CatalogsProductGroupFiltersRequest;
    IsFeatured : bool;
    Name : string;
  }
  //#endregion
