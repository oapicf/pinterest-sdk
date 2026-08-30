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
    public partial class CustomerListUploadsApi
    { 
        [FunctionName("CustomerListUploadsApi_CustomerListUploadsCreate")]
        public async Task<ActionResult<CustomerListUploadCreateResponse>> _CustomerListUploadsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string customerListId)
        {
            var method = this.GetType().GetMethod("CustomerListUploadsCreate");
            return method != null
                ? (await ((Task<CustomerListUploadCreateResponse>)method.Invoke(this, new object[] { req, context, adAccountId, customerListId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomerListUploadsApi_CustomerListUploadsGet")]
        public async Task<ActionResult<CustomerListUpload>> _CustomerListUploadsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string customerListId, [RegularExpression("^\\d+$")]string customerListUploadId)
        {
            var method = this.GetType().GetMethod("CustomerListUploadsGet");
            return method != null
                ? (await ((Task<CustomerListUpload>)method.Invoke(this, new object[] { req, context, adAccountId, customerListId, customerListUploadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CustomerListUploadsApi_CustomerListUploadsRun")]
        public async Task<ActionResult<CustomerListUpload>> _CustomerListUploadsRun([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string customerListId, [RegularExpression("^\\d+$")]string customerListUploadId)
        {
            var method = this.GetType().GetMethod("CustomerListUploadsRun");
            return method != null
                ? (await ((Task<CustomerListUpload>)method.Invoke(this, new object[] { req, context, adAccountId, customerListId, customerListUploadId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
