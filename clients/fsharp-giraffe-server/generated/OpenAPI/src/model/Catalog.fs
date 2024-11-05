namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.string option

module Catalog =

  //#region Catalog


  type Catalog = {
    CreatedAt : DateTime;
    Id : string;
    UpdatedAt : DateTime;
    Name : string option;
    CatalogType : CatalogsType;
  }
  //#endregion
