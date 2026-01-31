namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SSIOAccountAddress

module SSIOAccountItem =

  //#region SSIOAccountItem


  type SSIOAccountItem = {
    Addresses : SSIOAccountAddress[];
    Id : string;
    IoTerms : string;
    IoTermsId : string;
    IoType : string;
    RowTerms : string;
    RowTermsId : string;
    UsTerms : string;
    UsTermsId : string;
  }
  //#endregion
