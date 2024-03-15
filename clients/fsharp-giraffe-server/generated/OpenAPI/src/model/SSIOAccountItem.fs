namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOAccountAddress

module SSIOAccountItem =

  //#region SSIOAccountItem


  type SSIOAccountItem = {
    Id : string;
    IoTermsId : string;
    IoTerms : string;
    UsTermsId : string;
    UsTerms : string;
    RowTermsId : string;
    RowTerms : string;
    IoType : string;
    Addresses : SSIOAccountAddress[];
  }
  //#endregion
