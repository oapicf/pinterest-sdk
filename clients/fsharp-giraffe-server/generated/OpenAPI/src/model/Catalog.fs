namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType

module Catalog =

  //#region Catalog


  type Catalog = {
    CatalogType : CatalogsType;
    CreatedAt : DateTime;
    Id : string;
    Name : string;
    UpdatedAt : DateTime;
  }
  //#endregion
