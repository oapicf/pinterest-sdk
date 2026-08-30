namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CartingRetailer

module CartingProduct =

  //#region CartingProduct

  [<CLIMutable>]
  type CartingProduct = {
    [<JsonProperty(PropertyName = "carting_product_id")>]
    CartingProductId : string;
    [<JsonProperty(PropertyName = "display_preferred_retailers_only")>]
    DisplayPreferredRetailersOnly : bool;
    [<JsonProperty(PropertyName = "display_product_price")>]
    DisplayProductPrice : bool;
    [<JsonProperty(PropertyName = "preferred_retailers")>]
    PreferredRetailers : CartingRetailer[];
    [<JsonProperty(PropertyName = "randomize_preferred_retailers")>]
    RandomizePreferredRetailers : bool;
  }

  //#endregion
