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
    ///  Class for testing SearchApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class SearchApiTests : IDisposable
    {
        private SearchApi instance;

        public SearchApiTests()
        {
            instance = new SearchApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of SearchApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' SearchApi
            //Assert.IsType<SearchApi>(instance);
        }

        /// <summary>
        /// Test SearchPartnerPins
        /// </summary>
        [Fact]
        public void SearchPartnerPinsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string term = null;
            //string countryCode = null;
            //string? bookmark = null;
            //string? locale = null;
            //int? limit = null;
            //var response = instance.SearchPartnerPins(term, countryCode, bookmark, locale, limit);
            //Assert.IsType<SearchPartnerPins200Response>(response);
        }

        /// <summary>
        /// Test SearchUserBoardsGet
        /// </summary>
        [Fact]
        public void SearchUserBoardsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? adAccountId = null;
            //string? bookmark = null;
            //int? pageSize = null;
            //string? query = null;
            //var response = instance.SearchUserBoardsGet(adAccountId, bookmark, pageSize, query);
            //Assert.IsType<SearchUserBoardsGet200Response>(response);
        }

        /// <summary>
        /// Test SearchUserPinsList
        /// </summary>
        [Fact]
        public void SearchUserPinsListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string query = null;
            //string? adAccountId = null;
            //string? bookmark = null;
            //var response = instance.SearchUserPinsList(query, adAccountId, bookmark);
            //Assert.IsType<PinsList200Response>(response);
        }
    }
}
