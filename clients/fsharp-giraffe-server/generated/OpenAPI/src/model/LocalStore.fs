namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module LocalStore =

  //#region LocalStore


  type LocalStore = {
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
  }
  //#endregion
