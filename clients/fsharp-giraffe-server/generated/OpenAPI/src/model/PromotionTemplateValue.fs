namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Currency

module PromotionTemplateValue =

  //#region PromotionTemplateValue


  type PromotionTemplateValue = {
    Amount : decimal;
    CurrencyCode : Currency;
    CustomText : string;
    Percent : decimal;
  }
  //#endregion
