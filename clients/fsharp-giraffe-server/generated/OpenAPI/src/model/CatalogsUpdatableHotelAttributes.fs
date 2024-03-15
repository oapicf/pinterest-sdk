namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAddress
open OpenAPI.Model.CatalogsHotelGuestRatings
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsUpdatableHotelAttributes =

  //#region CatalogsUpdatableHotelAttributes


  type CatalogsUpdatableHotelAttributes = {
    Name : string option;
    Link : string option;
    Description : string option;
    Brand : string option;
    Latitude : decimal;
    Longitude : decimal option;
    Neighborhood : string[];
    Address : CatalogsHotelAddress;
    CustomLabel0 : string option;
    CustomLabel1 : string option;
    CustomLabel2 : string option;
    CustomLabel3 : string option;
    CustomLabel4 : string option;
    Category : string option;
    BasePrice : string option;
    SalePrice : string option;
    GuestRatings : CatalogsHotelGuestRatings;
  }
  //#endregion
