namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogProductGroup
open OpenAPI.Model.string option

module AdAccountsCatalogsProductGroupsList200Response =

  //#region AdAccountsCatalogsProductGroupsList200Response


  type ad_accounts_catalogs_product_groups_list_200_response = {
    Items : CatalogProductGroup[];
    Bookmark : string option;
  }
  //#endregion
