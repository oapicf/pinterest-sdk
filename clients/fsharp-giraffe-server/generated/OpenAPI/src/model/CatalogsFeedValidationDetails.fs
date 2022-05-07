namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsFeedValidationErrors
open OpenAPI.Model.CatalogsFeedValidationWarnings

module CatalogsFeedValidationDetails =

  //#region CatalogsFeedValidationDetails


  type CatalogsFeedValidationDetails = {
    Errors : CatalogsFeedValidationErrors;
    Warnings : CatalogsFeedValidationWarnings;
  }
  //#endregion
