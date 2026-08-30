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
    public partial class IntegrationsApi
    { 
        [FunctionName("IntegrationsApi_IntegrationsCommerceDel")]
        public async Task<ActionResult<IntegrationMetadata>> _IntegrationsCommerceDel([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5integrations/commerce/{external_business_id}")]HttpRequest req, ExecutionContext context, string externalBusinessId)
        {
            var method = this.GetType().GetMethod("IntegrationsCommerceDel");
            return method != null
                ? (await ((Task<IntegrationMetadata>)method.Invoke(this, new object[] { req, context, externalBusinessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsCommerceGet")]
        public async Task<ActionResult<IntegrationMetadata>> _IntegrationsCommerceGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5integrations/commerce/{external_business_id}")]HttpRequest req, ExecutionContext context, string externalBusinessId)
        {
            var method = this.GetType().GetMethod("IntegrationsCommerceGet");
            return method != null
                ? (await ((Task<IntegrationMetadata>)method.Invoke(this, new object[] { req, context, externalBusinessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsCommercePatch")]
        public async Task<ActionResult<IntegrationMetadata>> _IntegrationsCommercePatch([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5integrations/commerce/{external_business_id}")]HttpRequest req, ExecutionContext context, string externalBusinessId)
        {
            var method = this.GetType().GetMethod("IntegrationsCommercePatch");
            return method != null
                ? (await ((Task<IntegrationMetadata>)method.Invoke(this, new object[] { req, context, externalBusinessId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsCommercePost")]
        public async Task<ActionResult<IntegrationMetadata>> _IntegrationsCommercePost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5integrations/commerce")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IntegrationsCommercePost");
            return method != null
                ? (await ((Task<IntegrationMetadata>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsGetById")]
        public async Task<ActionResult<IntegrationRecord>> _IntegrationsGetById([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5integrations/{id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string id)
        {
            var method = this.GetType().GetMethod("IntegrationsGetById");
            return method != null
                ? (await ((Task<IntegrationRecord>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsGetList")]
        public async Task<ActionResult<IntegrationsGetList200Response>> _IntegrationsGetList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5integrations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IntegrationsGetList");
            return method != null
                ? (await ((Task<IntegrationsGetList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("IntegrationsApi_IntegrationsLogsPost")]
        public async Task<ActionResult<IntegrationLogsSuccessResponse>> _IntegrationsLogsPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5integrations/logs")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IntegrationsLogsPost");
            return method != null
                ? (await ((Task<IntegrationLogsSuccessResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
