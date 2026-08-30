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
    public partial class CatalogsApi
    { 
        [FunctionName("CatalogsApi_CatalogsAvailableFilterValues")]
        public async Task<ActionResult<CatalogsAvailableFilterValues>> _CatalogsAvailableFilterValues([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/available_filter_values")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsAvailableFilterValues");
            return method != null
                ? (await ((Task<CatalogsAvailableFilterValues>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogsApi_CatalogsCreate")]
        public async Task<ActionResult<Catalog>> _CatalogsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsCreate");
            return method != null
                ? (await ((Task<Catalog>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogsApi_CatalogsList")]
        public async Task<ActionResult<CatalogsList200Response>> _CatalogsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CatalogsList");
            return method != null
                ? (await ((Task<CatalogsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
