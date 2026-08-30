namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.CatalogSupplementalApiHandler
open OpenAPI.CatalogSupplementalApiHandlerParams

module CatalogSupplementalApiHandlerTestsHelper =


  let mutable CatalogsLocalInventoryItemsBatchOperateExamples = Map.empty
  let mutable CatalogsLocalInventoryItemsBatchOperateBody = ""

  CatalogsLocalInventoryItemsBatchOperateBody <- WebUtility.HtmlDecode "{
  &quot;operations&quot; : [ {
    &quot;attributes&quot; : {
      &quot;ad_link&quot; : &quot;https://examplelink.com&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;price&quot; : &quot;49.99 USD&quot;,
      &quot;sale_price&quot; : &quot;24.99 USD&quot;
    },
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;operation&quot; : &quot;CREATE&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;attributes&quot; : {
      &quot;ad_link&quot; : &quot;https://examplelink.com&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;price&quot; : &quot;49.99 USD&quot;,
      &quot;sale_price&quot; : &quot;24.99 USD&quot;
    },
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;operation&quot; : &quot;CREATE&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;attributes&quot; : {
      &quot;ad_link&quot; : &quot;https://examplelink.com&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;price&quot; : &quot;49.99 USD&quot;,
      &quot;sale_price&quot; : &quot;24.99 USD&quot;
    },
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;operation&quot; : &quot;CREATE&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;attributes&quot; : {
      &quot;ad_link&quot; : &quot;https://examplelink.com&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;price&quot; : &quot;49.99 USD&quot;,
      &quot;sale_price&quot; : &quot;24.99 USD&quot;
    },
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;operation&quot; : &quot;CREATE&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;attributes&quot; : {
      &quot;ad_link&quot; : &quot;https://examplelink.com&quot;,
      &quot;availability&quot; : &quot;in stock&quot;,
      &quot;price&quot; : &quot;49.99 USD&quot;,
      &quot;sale_price&quot; : &quot;24.99 USD&quot;
    },
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;operation&quot; : &quot;CREATE&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  } ]
}"
  CatalogsLocalInventoryItemsBatchOperateExamples <- CatalogsLocalInventoryItemsBatchOperateExamples.Add("application/json", CatalogsLocalInventoryItemsBatchOperateBody)

  let getCatalogsLocalInventoryItemsBatchOperateExample mediaType =
    CatalogsLocalInventoryItemsBatchOperateExamples.[mediaType]
      |> getConverter mediaType

  let mutable CatalogsLocalInventoryItemsPostExamples = Map.empty
  let mutable CatalogsLocalInventoryItemsPostBody = ""

  CatalogsLocalInventoryItemsPostBody <- WebUtility.HtmlDecode "{
  &quot;item_filters&quot; : [ {
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  }, {
    &quot;item_id&quot; : &quot;item_id_1&quot;,
    &quot;store_code&quot; : &quot;store_1&quot;
  } ]
}"
  CatalogsLocalInventoryItemsPostExamples <- CatalogsLocalInventoryItemsPostExamples.Add("application/json", CatalogsLocalInventoryItemsPostBody)

  let getCatalogsLocalInventoryItemsPostExample mediaType =
    CatalogsLocalInventoryItemsPostExamples.[mediaType]
      |> getConverter mediaType

  let mutable CatalogsLocalStoresCreateExamples = Map.empty
  let mutable CatalogsLocalStoresCreateBody = ""

  CatalogsLocalStoresCreateBody <- WebUtility.HtmlDecode "{
  &quot;address_primary&quot; : &quot;123 Johnson St&quot;,
  &quot;address_secondary&quot; : &quot;Suite 100&quot;,
  &quot;city&quot; : &quot;Sunnyvale&quot;,
  &quot;country&quot; : &quot;&quot;,
  &quot;latitude&quot; : -30.21,
  &quot;longitude&quot; : 50.45,
  &quot;name&quot; : &quot;Sunnyvale Store&quot;,
  &quot;postal_code&quot; : &quot;94043&quot;,
  &quot;region&quot; : &quot;CA&quot;,
  &quot;store_code&quot; : &quot;store_1&quot;
}"
  CatalogsLocalStoresCreateExamples <- CatalogsLocalStoresCreateExamples.Add("application/json", CatalogsLocalStoresCreateBody)

  let getCatalogsLocalStoresCreateExample mediaType =
    CatalogsLocalStoresCreateExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable CatalogsLocalStoresUpdateExamples = Map.empty
  let mutable CatalogsLocalStoresUpdateBody = ""

  CatalogsLocalStoresUpdateBody <- WebUtility.HtmlDecode "{
  &quot;address_primary&quot; : &quot;123 Johnson St&quot;,
  &quot;address_secondary&quot; : &quot;Suite 100&quot;,
  &quot;city&quot; : &quot;Sunnyvale&quot;,
  &quot;country&quot; : &quot;&quot;,
  &quot;id&quot; : &quot;1234567890&quot;,
  &quot;latitude&quot; : -30.21,
  &quot;longitude&quot; : 50.45,
  &quot;name&quot; : &quot;Sunnyvale Store&quot;,
  &quot;postal_code&quot; : &quot;94043&quot;,
  &quot;region&quot; : &quot;CA&quot;,
  &quot;store_code&quot; : &quot;store_1&quot;
}"
  CatalogsLocalStoresUpdateExamples <- CatalogsLocalStoresUpdateExamples.Add("application/json", CatalogsLocalStoresUpdateBody)

  let getCatalogsLocalStoresUpdateExample mediaType =
    CatalogsLocalStoresUpdateExamples.[mediaType]
      |> getConverter mediaType
  ()

