/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class OauthApiController : ControllerBase
    { 
        /// <summary>
        /// Generate OAuth access token
        /// </summary>
        /// <remarks>Generate an OAuth access token by using an authorization code or a refresh token.  IMPORTANT: You need to start the OAuth flow via www.pinterest.com/oauth before calling this endpoint (or have an existing refresh token).  See &lt;a href&#x3D;&#39;/docs/getting-started/authentication-and-scopes/&#39;&gt;Authentication&lt;/a&gt; for more.  &lt;strong&gt;Parameter &lt;i&gt;refresh_on&lt;/i&gt; and its corresponding response type &lt;i&gt;everlasting_refresh&lt;/i&gt; are now available to all apps! Later this year, continuous refresh will become the default behavior (ie you will no longer need to send this parameter). &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  &lt;strong&gt;Grant type &lt;i&gt;client_credentials&lt;/i&gt; and its corresponding response type are not fully available. You will likely get a default error if you attempt to use this grant_type.&lt;/strong&gt;</remarks>
        /// <param name="grantType"></param>
        /// <response code="200">response</response>
        /// <response code="0">Unexpected error</response>
        [HttpPost]
        [Route("/v5/oauth/token")]
        [Consumes("application/x-www-form-urlencoded")]
        [ValidateModelState]
        [SwaggerOperation("OauthToken")]
        [SwaggerResponse(statusCode: 200, type: typeof(OauthAccessTokenResponse), description: "response")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "Unexpected error")]
        public virtual IActionResult OauthToken([FromForm (Name = "grant_type")][Required()]string grantType)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(OauthAccessTokenResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"access_token\" : \"access_token\",\n  \"scope\" : \"scope\",\n  \"response_type\" : \"authorization_code\",\n  \"token_type\" : \"bearer\",\n  \"expires_in\" : 0\n}";
            exampleJson = "{\n  \"code\" : 0,\n  \"message\" : \"message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<OauthAccessTokenResponse>(exampleJson)
            : default(OauthAccessTokenResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
