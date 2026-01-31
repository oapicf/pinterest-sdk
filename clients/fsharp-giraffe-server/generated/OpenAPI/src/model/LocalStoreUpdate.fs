namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module LocalStoreUpdate =

  //#region LocalStoreUpdate


  type LocalStoreUpdate = {
    AddressPrimary : string;
    AddressSecondary : string;
    City : string;
    Country : Country;
    Id : string;
    Latitude : float;
    Longitude : float;
    Name : string;
    PostalCode : string;
    Region : string;
    StoreCode : string;
  }
  //#endregion
