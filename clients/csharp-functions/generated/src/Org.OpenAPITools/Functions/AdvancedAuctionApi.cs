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
    public partial class AdvancedAuctionApi
    { 
        [FunctionName("AdvancedAuctionApi_AdvancedAuctionItemsGetPost")]
        public async Task<ActionResult<AdvancedAuctionItems>> _AdvancedAuctionItemsGetPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5advanced_auction/items/get")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdvancedAuctionItemsGetPost");
            return method != null
                ? (await ((Task<AdvancedAuctionItems>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdvancedAuctionApi_AdvancedAuctionItemsSubmitPost")]
        public async Task<ActionResult<AdvancedAuctionProcessedItems>> _AdvancedAuctionItemsSubmitPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5advanced_auction/items/submit")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdvancedAuctionItemsSubmitPost");
            return method != null
                ? (await ((Task<AdvancedAuctionProcessedItems>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
