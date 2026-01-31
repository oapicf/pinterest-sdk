namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Currency

module PromotionTemplateValue =

  //#region PromotionTemplateValue

  [<CLIMutable>]
  type PromotionTemplateValue = {
    [<JsonProperty(PropertyName = "amount")>]
    Amount : decimal;
    [<JsonProperty(PropertyName = "currency_code")>]
    CurrencyCode : Currency;
    [<JsonProperty(PropertyName = "custom_text")>]
    CustomText : string;
    [<JsonProperty(PropertyName = "percent")>]
    Percent : decimal;
  }

  //#endregion
