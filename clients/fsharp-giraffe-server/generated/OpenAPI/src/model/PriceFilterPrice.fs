namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NonNullableCatalogsCurrency
open OpenAPI.Model.NumericFilterOperatorType

module PriceFilterPrice =

  //#region PriceFilterPrice


  type PriceFilterPrice = {
    Currency : NonNullableCatalogsCurrency;
    Negated : bool;
    Operator : NumericFilterOperatorType;
    Value : decimal;
  }
  //#endregion
