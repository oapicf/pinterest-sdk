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
open Newtonsoft
open TestHelper
open CatalogSupplementalApiHandlerTestsHelper
open OpenAPI.CatalogSupplementalApiHandler
open OpenAPI.CatalogSupplementalApiHandlerParams
open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresDelete200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresList200Response
open OpenAPI.Model.LocalInventoryItemsBatch
open OpenAPI.Model.LocalInventoryItemsBatchCreate
open OpenAPI.Model.LocalInventoryItemsGet
open OpenAPI.Model.LocalInventoryItemsGetCreate
open OpenAPI.Model.LocalStore
open OpenAPI.Model.LocalStoreBatchUpdate
open OpenAPI.Model.LocalStoreCreate
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SupplementalItemsBatchResponse

module CatalogSupplementalApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsBatchOperate - Operate on local inventory item batch returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/batch".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsBatchOperateExample "application/json")
      // or pass a body of type LocalInventoryItemsBatchCreate
      let body = obj() :?> LocalInventoryItemsBatchCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalInventoryItemsPost - Get local inventory items (POST) returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_inventory_items/query".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalInventoryItemsPostExample "application/json")
      // or pass a body of type LocalInventoryItemsGetCreate
      let body = obj() :?> LocalInventoryItemsGetCreate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 201 where Resource create operation completed successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresCreate - Create local stores returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresCreateExample "application/json")
      // or pass a body of type LocalStoreCreate[]
      let body = obj() :?> LocalStoreCreate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 204 where Resource deleted successfully.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresDelete - Delete local stores returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME"

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresList - List local stores returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?ids=ADDME&adAccountId=ADDME&bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsLocalStoresUpdate - Update local stores returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/local_stores".Replace("catalogId", "ADDME") + "?adAccountId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCatalogsLocalStoresUpdateExample "application/json")
      // or pass a body of type LocalStoreBatchUpdate[]
      let body = obj() :?> LocalStoreBatchUpdate[] |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 200 where The request has succeeded.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 400 where The request could not be understood by the server due to unexpected data.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 401 where Authentication is required and has either failed or not been provided.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 403 where The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 404 where The requested resource could not be found on this server.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 429 where The user has sent too many requests in a given amount of time and is being rate limited.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``CatalogsSupplementalItemsBatchGet - Get supplemental items batch status returns 0 where An unexpected error response.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".Replace("catalogId", "ADDME").Replace("batchId", "ADDME") + "?adAccountId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

