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
    public partial class CatalogReportsApi
    { 
        [FunctionName("CatalogReportsApi_ReportsCreate")]
        public async Task<ActionResult<CatalogsCreateReportResponse>> _ReportsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/reports")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ReportsCreate");
            return method != null
                ? (await ((Task<CatalogsCreateReportResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogReportsApi_ReportsGet")]
        public async Task<ActionResult<CatalogsReport>> _ReportsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/reports")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ReportsGet");
            return method != null
                ? (await ((Task<CatalogsReport>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogReportsApi_ReportsStats")]
        public async Task<ActionResult<ReportsStats200Response>> _ReportsStats([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/reports/stats")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ReportsStats");
            return method != null
                ? (await ((Task<ReportsStats200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
