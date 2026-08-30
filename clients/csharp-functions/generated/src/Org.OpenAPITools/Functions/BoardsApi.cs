using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class BoardsApi
    { 
        [FunctionName("BoardsApi_BoardSectionsCreate")]
        public async Task<ActionResult<BoardSection>> _BoardSectionsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5boards/{board_id}/sections")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardSectionsCreate");
            return method != null
                ? (await ((Task<BoardSection>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardSectionsDelete")]
        public async Task<ActionResult<BoardSection>> _BoardSectionsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5boards/{board_id}/sections/{section_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId, [RegularExpression("^\\d+$")]string sectionId)
        {
            var method = this.GetType().GetMethod("BoardSectionsDelete");
            return method != null
                ? (await ((Task<BoardSection>)method.Invoke(this, new object[] { req, context, boardId, sectionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardSectionsList")]
        public async Task<ActionResult<BoardSectionsList200Response>> _BoardSectionsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5boards/{board_id}/sections")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardSectionsList");
            return method != null
                ? (await ((Task<BoardSectionsList200Response>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardSectionsListPins")]
        public async Task<ActionResult<BoardsListPins200Response>> _BoardSectionsListPins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5boards/{board_id}/sections/{section_id}/pins")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId, [RegularExpression("^\\d+$")]string sectionId)
        {
            var method = this.GetType().GetMethod("BoardSectionsListPins");
            return method != null
                ? (await ((Task<BoardsListPins200Response>)method.Invoke(this, new object[] { req, context, boardId, sectionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardSectionsUpdate")]
        public async Task<ActionResult<BoardSection>> _BoardSectionsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5boards/{board_id}/sections/{section_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId, [RegularExpression("^\\d+$")]string sectionId)
        {
            var method = this.GetType().GetMethod("BoardSectionsUpdate");
            return method != null
                ? (await ((Task<BoardSection>)method.Invoke(this, new object[] { req, context, boardId, sectionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsCreate")]
        public async Task<ActionResult<Board>> _BoardsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5boards")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BoardsCreate");
            return method != null
                ? (await ((Task<Board>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsDelete")]
        public async Task<ActionResult<Board>> _BoardsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5boards/{board_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardsDelete");
            return method != null
                ? (await ((Task<Board>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsGet")]
        public async Task<ActionResult<Board>> _BoardsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5boards/{board_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardsGet");
            return method != null
                ? (await ((Task<Board>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsList")]
        public async Task<ActionResult<BoardsList200Response>> _BoardsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5boards")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BoardsList");
            return method != null
                ? (await ((Task<BoardsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsListPins")]
        public async Task<ActionResult<BoardsListPins200Response>> _BoardsListPins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5boards/{board_id}/pins")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardsListPins");
            return method != null
                ? (await ((Task<BoardsListPins200Response>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BoardsApi_BoardsUpdate")]
        public async Task<ActionResult<BoardWithUpdatePrivacy>> _BoardsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5boards/{board_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string boardId)
        {
            var method = this.GetType().GetMethod("BoardsUpdate");
            return method != null
                ? (await ((Task<BoardWithUpdatePrivacy>)method.Invoke(this, new object[] { req, context, boardId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
