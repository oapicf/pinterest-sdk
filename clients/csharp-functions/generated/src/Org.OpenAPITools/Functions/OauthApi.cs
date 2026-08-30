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
    public partial class OauthApi
    { 
        [FunctionName("OauthApi_OauthConversionToken")]
        public async Task<ActionResult<ConversionAccessToken>> _OauthConversionToken([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5oauth/conversion_token")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OauthConversionToken");
            return method != null
                ? (await ((Task<ConversionAccessToken>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OauthApi_OauthToken")]
        public async Task<ActionResult<OauthAccessToken>> _OauthToken([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5oauth/token")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OauthToken");
            return method != null
                ? (await ((Task<OauthAccessToken>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OauthApi_TokenRevoke")]
        public async Task<ActionResult<>> _TokenRevoke([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5oauth/token/revoke")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TokenRevoke");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
