namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceSubcategory

module AudienceCategory =

  //#region AudienceCategory


  type AudienceCategory = {
    Id : string;
    Index : decimal;
    Key : string;
    Name : string;
    Ratio : decimal;
    Subcategories : AudienceSubcategory[];
  }
  //#endregion
