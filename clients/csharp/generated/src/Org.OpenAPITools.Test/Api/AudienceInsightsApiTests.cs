/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing AudienceInsightsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class AudienceInsightsApiTests : IDisposable
    {
        private AudienceInsightsApi instance;

        public AudienceInsightsApiTests()
        {
            instance = new AudienceInsightsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of AudienceInsightsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' AudienceInsightsApi
            //Assert.IsType<AudienceInsightsApi>(instance);
        }

        /// <summary>
        /// Test AudienceInsightsGet
        /// </summary>
        [Fact]
        public void AudienceInsightsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string adAccountId = null;
            //AudienceInsightType audienceInsightType = null;
            //var response = instance.AudienceInsightsGet(adAccountId, audienceInsightType);
            //Assert.IsType<AudienceInsightsResponse>(response);
        }

        /// <summary>
        /// Test AudienceInsightsScopeAndTypeGet
        /// </summary>
        [Fact]
        public void AudienceInsightsScopeAndTypeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string adAccountId = null;
            //var response = instance.AudienceInsightsScopeAndTypeGet(adAccountId);
            //Assert.IsType<AudienceDefinitionResponse>(response);
        }
    }
}