namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 =

  //#region CatalogsProductGroupUpdateManyRequestItemsOneOfItems0


  type CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 = {
    Description : string option;
    Filters : CatalogsProductGroupFiltersRequest;
    IsFeatured : bool;
    Name : string;
    Id : string;
  }
  //#endregion
