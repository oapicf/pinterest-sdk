/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
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
    ///  Class for testing IntegrationsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class IntegrationsApiTests : IDisposable
    {
        private IntegrationsApi instance;

        public IntegrationsApiTests()
        {
            instance = new IntegrationsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of IntegrationsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' IntegrationsApi
            //Assert.IsType<IntegrationsApi>(instance);
        }

        /// <summary>
        /// Test IntegrationsCommerceDel
        /// </summary>
        [Fact]
        public void IntegrationsCommerceDelTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string externalBusinessId = null;
            //instance.IntegrationsCommerceDel(externalBusinessId);
        }

        /// <summary>
        /// Test IntegrationsCommerceGet
        /// </summary>
        [Fact]
        public void IntegrationsCommerceGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string externalBusinessId = null;
            //var response = instance.IntegrationsCommerceGet(externalBusinessId);
            //Assert.IsType<IntegrationMetadata>(response);
        }

        /// <summary>
        /// Test IntegrationsCommercePatch
        /// </summary>
        [Fact]
        public void IntegrationsCommercePatchTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string externalBusinessId = null;
            //IntegrationRequestPatch? integrationRequestPatch = null;
            //var response = instance.IntegrationsCommercePatch(externalBusinessId, integrationRequestPatch);
            //Assert.IsType<IntegrationMetadata>(response);
        }

        /// <summary>
        /// Test IntegrationsCommercePost
        /// </summary>
        [Fact]
        public void IntegrationsCommercePostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //IntegrationRequest? integrationRequest = null;
            //var response = instance.IntegrationsCommercePost(integrationRequest);
            //Assert.IsType<IntegrationMetadata>(response);
        }

        /// <summary>
        /// Test IntegrationsGetById
        /// </summary>
        [Fact]
        public void IntegrationsGetByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //var response = instance.IntegrationsGetById(id);
            //Assert.IsType<IntegrationRecord>(response);
        }

        /// <summary>
        /// Test IntegrationsGetList
        /// </summary>
        [Fact]
        public void IntegrationsGetListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? bookmark = null;
            //int? pageSize = null;
            //var response = instance.IntegrationsGetList(bookmark, pageSize);
            //Assert.IsType<IntegrationsGetList200Response>(response);
        }

        /// <summary>
        /// Test IntegrationsLogsPost
        /// </summary>
        [Fact]
        public void IntegrationsLogsPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //IntegrationLogsRequest integrationLogsRequest = null;
            //var response = instance.IntegrationsLogsPost(integrationLogsRequest);
            //Assert.IsType<IntegrationLogsSuccessResponse>(response);
        }
    }
}
