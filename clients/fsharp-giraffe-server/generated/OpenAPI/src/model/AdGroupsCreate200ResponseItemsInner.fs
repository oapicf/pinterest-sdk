namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroup
open OpenAPI.Model.PinterestLibBatchItemException

module AdGroupsCreate200ResponseItemsInner =

  //#region AdGroupsCreate200ResponseItemsInner


  type ad_groups_create_200_response_items_inner = {
    Data : AdGroup;
    Exceptions : PinterestLibBatchItemException[];
  }
  //#endregion
