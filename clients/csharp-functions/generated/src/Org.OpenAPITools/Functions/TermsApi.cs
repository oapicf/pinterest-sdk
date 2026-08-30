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
    public partial class TermsApi
    { 
        [FunctionName("TermsApi_TermsRelatedList")]
        public async Task<ActionResult<RelatedTerms>> _TermsRelatedList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5terms/related")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TermsRelatedList");
            return method != null
                ? (await ((Task<RelatedTerms>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("TermsApi_TermsSuggestedList")]
        public async Task<ActionResult<List<string>>> _TermsSuggestedList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5terms/suggested")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TermsSuggestedList");
            return method != null
                ? (await ((Task<List<string>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
