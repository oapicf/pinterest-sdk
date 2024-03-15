namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NonNullableCatalogsCurrency

module CatalogsProductGroupPricingCurrencyCriteria =

  //#region CatalogsProductGroupPricingCurrencyCriteria

  //#region enums
  type OperatorEnum = GREATERTHANEnum of string  |  GREATERTHANOREQUALSEnum of string  |  LESSTHANEnum of string  |  LESSTHANOREQUALSEnum of string  
  //#endregion

  type catalogs_product_group_pricing_currency_criteria = {
    Operator : OperatorEnum;
    Value : decimal;
    Currency : NonNullableCatalogsCurrency;
    Negated : bool;
  }
  //#endregion
