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
    public partial class ResourcesApi
    { 
        [FunctionName("ResourcesApi_AdAccountCountriesGet")]
        public async Task<ActionResult<AdAccountCountriesGet200Response>> _AdAccountCountriesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/ad_account_countries")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdAccountCountriesGet");
            return method != null
                ? (await ((Task<AdAccountCountriesGet200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ResourcesApi_DeliveryMetricsGet")]
        public async Task<ActionResult<DeliveryMetricsGet200Response>> _DeliveryMetricsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/delivery_metrics")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("DeliveryMetricsGet");
            return method != null
                ? (await ((Task<DeliveryMetricsGet200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ResourcesApi_InterestTargetingOptionsGet")]
        public async Task<ActionResult<SingleInterestTargetingOption>> _InterestTargetingOptionsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/targeting/interests/{interest_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string interestId)
        {
            var method = this.GetType().GetMethod("InterestTargetingOptionsGet");
            return method != null
                ? (await ((Task<SingleInterestTargetingOption>)method.Invoke(this, new object[] { req, context, interestId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ResourcesApi_LeadFormQuestionsGet")]
        public async Task<ActionResult<>> _LeadFormQuestionsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/lead_form_questions")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LeadFormQuestionsGet");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ResourcesApi_MetricsReadyStateGet")]
        public async Task<ActionResult<BookClosed>> _MetricsReadyStateGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/metrics_ready_state")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MetricsReadyStateGet");
            return method != null
                ? (await ((Task<BookClosed>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ResourcesApi_TargetingOptionsGet")]
        public async Task<ActionResult<List<Object>>> _TargetingOptionsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5resources/targeting/{targeting_type}")]HttpRequest req, ExecutionContext context, PublicTargetingType targetingType)
        {
            var method = this.GetType().GetMethod("TargetingOptionsGet");
            return method != null
                ? (await ((Task<List<Object>>)method.Invoke(this, new object[] { req, context, targetingType })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
