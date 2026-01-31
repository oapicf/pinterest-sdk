namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenderDemographics
open System.Collections.Generic

module ProductCategoriesDemographic =

  //#region ProductCategoriesDemographic


  type ProductCategoriesDemographic = {
    Age : IDictionary<string, decimal>;
    Gender : GenderDemographics;
  }
  //#endregion
