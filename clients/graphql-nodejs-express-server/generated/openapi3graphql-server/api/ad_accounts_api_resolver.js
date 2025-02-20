/**
 * 
 * Pinterest REST API
 * 
 * 
 * Pinterest's REST API
 * 
 * Version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// ad_accounts_api

export default {
    Query: {

        // @return AdAccountAnalyticsResponseInner
        AdAccountAnalytics: ($adAccountId, $startDate, $endDate, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime) => {
            return {
                "adAccountId": "adAccountId_example",
                "startDate": "2013-10-20",
                "endDate": "2013-10-20",
                "columns": "",
                "granularity": "DAY",
                "clickWindowDays": "1",
                "engagementWindowDays": "56",
                "viewWindowDays": "56",
                "conversionReportTime": "TIME_OF_AD_ACTION"
            };
        },

        // @return MetricsResponse
        AdAccountTargetingAnalyticsGet: ($adAccountId, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes) => {
            return {
                "adAccountId": "adAccountId_example",
                "startDate": "2013-10-20",
                "endDate": "2013-10-20",
                "targetingTypes": "",
                "columns": "",
                "granularity": "DAY",
                "clickWindowDays": "1",
                "engagementWindowDays": "56",
                "viewWindowDays": "56",
                "conversionReportTime": "TIME_OF_AD_ACTION",
                "attributionTypes": ""
            };
        },

        // @return AdAccount
        AdAccountsGet: ($adAccountId) => {
            return {
                "adAccountId": "adAccountId_example"
            };
        },

        // @return AdAccountsList200Response
        AdAccountsList: ($bookmark, $pageSize, $includeSharedAccounts) => {
            return {
                "bookmark": "bookmark_example",
                "pageSize": "56",
                "includeSharedAccounts": "true"
            };
        },

        // @return GetMmmReportResponse
        AnalyticsGetMmmReport: ($adAccountId, $token) => {
            return {
                "adAccountId": "adAccountId_example",
                "token": "token_example"
            };
        },

        // @return AdsAnalyticsGetAsyncResponse
        AnalyticsGetReport: ($adAccountId, $token) => {
            return {
                "adAccountId": "adAccountId_example",
                "token": "token_example"
            };
        },

        // @return TemplatesList200Response
        TemplatesList: ($adAccountId, $pageSize, $order, $bookmark) => {
            return {
                "adAccountId": "adAccountId_example",
                "pageSize": "56",
                "order": "ASCENDING",
                "bookmark": "bookmark_example"
            };
        },

    },

    Mutation: {

        // @return AdAccount
        AdAccountsCreate: ($adAccountCreateRequest) => {
            return {
                "adAccountCreateRequest": ""
            };
        },

        // @return CreateMmmReportResponse
        AnalyticsCreateMmmReport: ($adAccountId, $createMmmReportRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "createMmmReportRequest": ""
            };
        },

        // @return AdsAnalyticsCreateAsyncResponse
        AnalyticsCreateReport: ($adAccountId, $adsAnalyticsCreateAsyncRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "adsAnalyticsCreateAsyncRequest": ""
            };
        },

        // @return AdsAnalyticsCreateAsyncResponse
        AnalyticsCreateTemplateReport: ($adAccountId, $templateId, $startDate, $endDate, $granularity) => {
            return {
                "adAccountId": "adAccountId_example",
                "templateId": "templateId_example",
                "startDate": "2013-10-20",
                "endDate": "2013-10-20",
                "granularity": "DAY"
            };
        },

        // @return String!
        SandboxDelete: ($adAccountId) => {
            return {
                "adAccountId": "adAccountId_example"
            };
        },

    }
}