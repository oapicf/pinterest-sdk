namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.string option

module Catalog =

  //#region Catalog


  type Catalog = {
    CreatedAt : Nullable<DateTime>;
    Id : string;
    UpdatedAt : Nullable<DateTime>;
    Name : string option;
    CatalogType : CatalogsType;
  }
  //#endregion
