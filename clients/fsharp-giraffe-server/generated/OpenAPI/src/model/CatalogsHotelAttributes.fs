namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsAiContentDisclosure
open OpenAPI.Model.CatalogsHotelAddress
open OpenAPI.Model.CatalogsHotelGuestRatings
open OpenAPI.Model.CatalogsHotelMainImage
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module CatalogsHotelAttributes =

  //#region CatalogsHotelAttributes


  type CatalogsHotelAttributes = {
    Address : CatalogsHotelAddress;
    BasePrice : string option;
    Brand : string option;
    Category : string option;
    CustomLabel0 : string option;
    CustomLabel1 : string option;
    CustomLabel2 : string option;
    CustomLabel3 : string option;
    CustomLabel4 : string option;
    Description : string option;
    GuestRatings : CatalogsHotelGuestRatings;
    Latitude : decimal;
    Link : string option;
    Longitude : decimal option;
    Name : string option;
    Neighborhood : string[];
    SalePrice : string option;
    AdditionalImageLink : string[];
    AiDisclosures : CatalogsAiContentDisclosure[];
    MainImage : CatalogsHotelMainImage;
  }
  //#endregion
