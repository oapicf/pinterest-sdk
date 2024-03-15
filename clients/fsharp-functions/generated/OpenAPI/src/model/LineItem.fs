namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LineItem =

  //#region LineItem

  [<CLIMutable>]
  type LineItem = {
    [<JsonProperty(PropertyName = "product_brand")>]
    ProductBrand : string;
    [<JsonProperty(PropertyName = "product_category")>]
    ProductCategory : string;
    [<JsonProperty(PropertyName = "product_id")>]
    ProductId : int;
    [<JsonProperty(PropertyName = "product_name")>]
    ProductName : string;
    [<JsonProperty(PropertyName = "product_price")>]
    ProductPrice : string;
    [<JsonProperty(PropertyName = "product_quantity")>]
    ProductQuantity : int;
    [<JsonProperty(PropertyName = "product_variant")>]
    ProductVariant : string;
    [<JsonProperty(PropertyName = "product_variant_id")>]
    ProductVariantId : string;
  }

  //#endregion
