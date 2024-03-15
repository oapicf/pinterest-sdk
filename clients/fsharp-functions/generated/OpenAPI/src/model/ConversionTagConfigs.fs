namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.bool option
open OpenAPI.Model.decimal option

module ConversionTagConfigs =

  //#region ConversionTagConfigs

  [<CLIMutable>]
  type ConversionTagConfigs = {
    [<JsonProperty(PropertyName = "aem_enabled")>]
    AemEnabled : bool option;
    [<JsonProperty(PropertyName = "md_frequency")>]
    MdFrequency : decimal option;
    [<JsonProperty(PropertyName = "aem_fnln_enabled")>]
    AemFnlnEnabled : bool option;
    [<JsonProperty(PropertyName = "aem_ph_enabled")>]
    AemPhEnabled : bool option;
    [<JsonProperty(PropertyName = "aem_ge_enabled")>]
    AemGeEnabled : bool option;
    [<JsonProperty(PropertyName = "aem_db_enabled")>]
    AemDbEnabled : bool option;
    [<JsonProperty(PropertyName = "aem_loc_enabled")>]
    AemLocEnabled : bool option;
  }

  //#endregion
