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
    public partial class CustomerListsApi
    { 
        [FunctionName("CustomerListsApi_CustomerListsCreate")]
        public async Task<ActionResult<CustomerList>> _CustomerListsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/customer_lists")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CustomerListsCreate");
            return method != null
                ? (await ((Task<CustomerList>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomerListsApi_CustomerListsGet")]
        public async Task<ActionResult<CustomerList>> _CustomerListsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string customerListId)
        {
            var method = this.GetType().GetMethod("CustomerListsGet");
            return method != null
                ? (await ((Task<CustomerList>)method.Invoke(this, new object[] { req, context, adAccountId, customerListId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomerListsApi_CustomerListsList")]
        public async Task<ActionResult<CustomerListsList200Response>> _CustomerListsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/customer_lists")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CustomerListsList");
            return method != null
                ? (await ((Task<CustomerListsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomerListsApi_CustomerListsUpdate")]
        public async Task<ActionResult<CustomerList>> _CustomerListsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string customerListId)
        {
            var method = this.GetType().GetMethod("CustomerListsUpdate");
            return method != null
                ? (await ((Task<CustomerList>)method.Invoke(this, new object[] { req, context, adAccountId, customerListId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
