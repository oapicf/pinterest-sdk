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
open BoardsApiHandlerTestsHelper
open OpenAPI.BoardsApiHandler
open OpenAPI.BoardsApiHandlerParams
open OpenAPI.Model.Board
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardUpdate
open OpenAPI.Model.Error
open OpenAPI.Model.Paginated

module BoardsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 201 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 400 where Invalid board section parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 403 where Not authorized to create board sections.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 409 where Could not get exclusive access to the board to create a new section.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 500 where Could not create a new board section.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsCreate - Create board section returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsCreateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsDelete - Delete board section returns 204 where Board section deleted successfully`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsDelete - Delete board section returns 403 where Not authorized to delete board section.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsDelete - Delete board section returns 404 where Board section not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsDelete - Delete board section returns 409 where Board section conflict.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsDelete - Delete board section returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsList - List board sections returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsList - List board sections returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections".Replace("boardId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsListPins - List Pins on board section returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}/pins".Replace("boardId", "ADDME").Replace("sectionId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsListPins - List Pins on board section returns 403 where Not authorized to access Pins on board section.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}/pins".Replace("boardId", "ADDME").Replace("sectionId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsListPins - List Pins on board section returns 404 where Board or section not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}/pins".Replace("boardId", "ADDME").Replace("sectionId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsListPins - List Pins on board section returns 409 where Board section conflict.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}/pins".Replace("boardId", "ADDME").Replace("sectionId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsListPins - List Pins on board section returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}/pins".Replace("boardId", "ADDME").Replace("sectionId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardSectionsUpdate - Update board section returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsUpdateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsUpdate - Update board section returns 400 where Invalid board section parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsUpdateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsUpdate - Update board section returns 403 where Not authorized to update board section.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsUpdateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsUpdate - Update board section returns 409 where Board section conflict.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsUpdateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardSectionsUpdate - Update board section returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/sections/{section_id}".Replace("boardId", "ADDME").Replace("sectionId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardSectionsUpdateExample "application/json")
      // or pass a body of type BoardSection
      let body = obj() :?> BoardSection |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsCreate - Create board returns 201 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsCreateExample "application/json")
      // or pass a body of type Board
      let body = obj() :?> Board |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(201))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsCreate - Create board returns 400 where The board name is invalid or duplicated.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsCreateExample "application/json")
      // or pass a body of type Board
      let body = obj() :?> Board |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsCreate - Create board returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsCreateExample "application/json")
      // or pass a body of type Board
      let body = obj() :?> Board |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 204 where Board deleted successfully`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(204))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 403 where Not authorized to delete the board.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 404 where Board not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 409 where Could not get exclusive access to delete the board.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(409))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 429 where This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsDelete - Delete board returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpDelete client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsGet - Get board returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsGet - Get board returns 404 where Board not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsGet - Get board returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsList - List boards returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards" + "?bookmark=ADDME&pageSize=ADDME&privacy=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsList - List boards returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards" + "?bookmark=ADDME&pageSize=ADDME&privacy=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsListPins - List Pins on board returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/pins".Replace("boardId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsListPins - List Pins on board returns 404 where Board not found.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/pins".Replace("boardId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsListPins - List Pins on board returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}/pins".Replace("boardId", "ADDME") + "?bookmark=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``BoardsUpdate - Update board returns 200 where response`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsUpdateExample "application/json")
      // or pass a body of type BoardUpdate
      let body = obj() :?> BoardUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsUpdate - Update board returns 400 where Invalid board parameters.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsUpdateExample "application/json")
      // or pass a body of type BoardUpdate
      let body = obj() :?> BoardUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsUpdate - Update board returns 403 where Not authorized to update the board.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsUpdateExample "application/json")
      // or pass a body of type BoardUpdate
      let body = obj() :?> BoardUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsUpdate - Update board returns 429 where This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsUpdateExample "application/json")
      // or pass a body of type BoardUpdate
      let body = obj() :?> BoardUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(429))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``BoardsUpdate - Update board returns 0 where Unexpected error`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v5/boards/{board_id}".Replace("boardId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getBoardsUpdateExample "application/json")
      // or pass a body of type BoardUpdate
      let body = obj() :?> BoardUpdate |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPatch client path
        |> isStatus (enum<HttpStatusCode>(0))
        |> readText
        |> shouldEqual "TESTME"
      }

