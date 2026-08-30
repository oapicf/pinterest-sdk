namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInnerDataOneOf
open OpenAPI.Model.Country
open OpenAPI.Model.LocalStore
open OpenAPI.Model.PinterestLibError

module CatalogsLocalStoresCreate200ResponseInnerData =

  //#region CatalogsLocalStoresCreate200ResponseInnerData


  type catalogs_local_stores_create_200_response_inner_data = {
    AddressPrimary : string;
    AddressSecondary : string;
    City : string;
    Country : Country;
    CreatedAt : DateTime;
    Id : string;
    Latitude : float;
    Longitude : float;
    Name : string;
    PostalCode : string;
    Region : string;
    StoreCode : string;
    UpdatedAt : DateTime;
    Exceptions : PinterestLibError;
  }
  //#endregion
