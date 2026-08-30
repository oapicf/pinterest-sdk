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
    public partial class MediaApi
    { 
        [FunctionName("MediaApi_MediaCreate")]
        public async Task<ActionResult<MediaUpload>> _MediaCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5media")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MediaCreate");
            return method != null
                ? (await ((Task<MediaUpload>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_MediaGet")]
        public async Task<ActionResult<Media>> _MediaGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5media/{media_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string mediaId)
        {
            var method = this.GetType().GetMethod("MediaGet");
            return method != null
                ? (await ((Task<Media>)method.Invoke(this, new object[] { req, context, mediaId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MediaApi_MediaList")]
        public async Task<ActionResult<MediaList200Response>> _MediaList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5media")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MediaList");
            return method != null
                ? (await ((Task<MediaList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
