namespace OpenAPI.Model

open System
open System.Collections.Generic

module CatalogsRetailProductGroupProductCounts =

  //#region CatalogsRetailProductGroupProductCounts

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailProductGroupProductCounts = {
    CatalogType : CatalogTypeEnum;
    InStock : decimal;
    OutOfStock : decimal;
    Preorder : decimal;
    Total : decimal;
    Videos : decimal;
  }
  //#endregion
