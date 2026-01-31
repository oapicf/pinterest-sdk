namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.SSIOAccountAddress

module SSIOAccountItem =

  //#region SSIOAccountItem

  [<CLIMutable>]
  type SSIOAccountItem = {
    [<JsonProperty(PropertyName = "addresses")>]
    Addresses : SSIOAccountAddress[];
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "io_terms")>]
    IoTerms : string;
    [<JsonProperty(PropertyName = "io_terms_id")>]
    IoTermsId : string;
    [<JsonProperty(PropertyName = "io_type")>]
    IoType : string;
    [<JsonProperty(PropertyName = "row_terms")>]
    RowTerms : string;
    [<JsonProperty(PropertyName = "row_terms_id")>]
    RowTermsId : string;
    [<JsonProperty(PropertyName = "us_terms")>]
    UsTerms : string;
    [<JsonProperty(PropertyName = "us_terms_id")>]
    UsTermsId : string;
  }

  //#endregion
