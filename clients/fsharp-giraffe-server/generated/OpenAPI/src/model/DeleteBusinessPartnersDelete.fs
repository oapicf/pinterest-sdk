namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NullablePartnerType

module DeleteBusinessPartnersDelete =

  //#region DeleteBusinessPartnersDelete


  type DeleteBusinessPartnersDelete = {
    PartnerIds : string[];
    PartnerType : NullablePartnerType;
  }
  //#endregion
