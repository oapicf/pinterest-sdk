namespace OpenAPI.Model

open System
open System.Collections.Generic

module LineItem =

  //#region LineItem


  type LineItem = {
    ProductBrand : string;
    ProductCategory : string;
    ProductId : int;
    ProductName : string;
    ProductPrice : string;
    ProductQuantity : int;
    ProductVariant : string;
    ProductVariantId : string;
  }
  //#endregion
