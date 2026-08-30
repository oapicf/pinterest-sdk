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
    public partial class SearchApi
    { 
        [FunctionName("SearchApi_SearchPartnerPins")]
        public async Task<ActionResult<SearchPartnerPins200Response>> _SearchPartnerPins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5search/partner/pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchPartnerPins");
            return method != null
                ? (await ((Task<SearchPartnerPins200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SearchApi_SearchUserBoardsGet")]
        public async Task<ActionResult<BoardsList200Response>> _SearchUserBoardsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5search/boards")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchUserBoardsGet");
            return method != null
                ? (await ((Task<BoardsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SearchApi_SearchUserPinsList")]
        public async Task<ActionResult<PinsList200Response>> _SearchUserPinsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5search/pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SearchUserPinsList");
            return method != null
                ? (await ((Task<PinsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
