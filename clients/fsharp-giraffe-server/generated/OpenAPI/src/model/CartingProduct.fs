namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CartingRetailer

module CartingProduct =

  //#region CartingProduct


  type CartingProduct = {
    CartingProductId : string;
    DisplayPreferredRetailersOnly : bool;
    DisplayProductPrice : bool;
    PreferredRetailers : CartingRetailer[];
    RandomizePreferredRetailers : bool;
  }
  //#endregion
