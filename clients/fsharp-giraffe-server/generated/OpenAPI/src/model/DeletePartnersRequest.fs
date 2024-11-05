namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module DeletePartnersRequest =

  //#region DeletePartnersRequest


  type DeletePartnersRequest = {
    PartnerIds : string[];
    PartnerType : string option;
  }
  //#endregion
