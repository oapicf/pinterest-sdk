namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Country

module LocalStoreCreate =

  //#region LocalStoreCreate


  type LocalStoreCreate = {
    AddressPrimary : string;
    AddressSecondary : string;
    City : string;
    Country : Country;
    Latitude : float;
    Longitude : float;
    Name : string;
    PostalCode : string;
    Region : string;
    StoreCode : string;
  }
  //#endregion
