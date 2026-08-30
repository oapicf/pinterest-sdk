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
    public partial class PinsApi
    { 
        [FunctionName("PinsApi_MultiPinsAnalytics")]
        public async Task<ActionResult<Dictionary<string, Dictionary<string, PinAnalyticsMetricsResponse>>>> _MultiPinsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5pins/analytics")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MultiPinsAnalytics");
            return method != null
                ? (await ((Task<Dictionary<string, Dictionary<string, PinAnalyticsMetricsResponse>>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsAnalytics")]
        public async Task<ActionResult<Dictionary<string, PinAnalyticsMetricsResponse>>> _PinsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5pins/{pin_id}/analytics")]HttpRequest req, ExecutionContext context, string pinId)
        {
            var method = this.GetType().GetMethod("PinsAnalytics");
            return method != null
                ? (await ((Task<Dictionary<string, PinAnalyticsMetricsResponse>>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsCreate")]
        public async Task<ActionResult<Pin>> _PinsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PinsCreate");
            return method != null
                ? (await ((Task<Pin>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsDelete")]
        public async Task<ActionResult<Pin>> _PinsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5pins/{pin_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("PinsDelete");
            return method != null
                ? (await ((Task<Pin>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsGet")]
        public async Task<ActionResult<Pin>> _PinsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5pins/{pin_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("PinsGet");
            return method != null
                ? (await ((Task<Pin>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsList")]
        public async Task<ActionResult<PinsList200Response>> _PinsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PinsList");
            return method != null
                ? (await ((Task<PinsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsSave")]
        public async Task<ActionResult<Pin>> _PinsSave([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5pins/{pin_id}/save")]HttpRequest req, ExecutionContext context, string pinId)
        {
            var method = this.GetType().GetMethod("PinsSave");
            return method != null
                ? (await ((Task<Pin>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PinsApi_PinsUpdate")]
        public async Task<ActionResult<Pin>> _PinsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5pins/{pin_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("PinsUpdate");
            return method != null
                ? (await ((Task<Pin>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
