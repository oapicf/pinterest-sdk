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

// ads_api

export default {
    Query: {

        // @return MetricsResponse
        AdTargetingAnalyticsGet: ($adAccountId, $adIds, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes) => {
            return {
                "adAccountId": "adAccountId_example",
                "adIds": "",
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

        // @return AdsAnalyticsResponseInner
        AdsAnalytics: ($adAccountId, $startDate, $endDate, $columns, $granularity, $adIds, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $pinIds, $campaignIds) => {
            return {
                "adAccountId": "adAccountId_example",
                "startDate": "2013-10-20",
                "endDate": "2013-10-20",
                "columns": "",
                "granularity": "DAY",
                "adIds": "",
                "clickWindowDays": "1",
                "engagementWindowDays": "56",
                "viewWindowDays": "56",
                "conversionReportTime": "TIME_OF_AD_ACTION",
                "pinIds": "",
                "campaignIds": ""
            };
        },

        // @return AdResponse
        AdsGet: ($adAccountId, $adId) => {
            return {
                "adAccountId": "adAccountId_example",
                "adId": "adId_example"
            };
        },

        // @return AdsList200Response
        AdsList: ($adAccountId, $campaignIds, $adGroupIds, $adIds, $entityStatuses, $pageSize, $order, $bookmark) => {
            return {
                "adAccountId": "adAccountId_example",
                "campaignIds": "",
                "adGroupIds": "",
                "adIds": "",
                "entityStatuses": "",
                "pageSize": "56",
                "order": "ASCENDING",
                "bookmark": "bookmark_example"
            };
        },

    },

    Mutation: {

        // @return AdPreviewUrlResponse
        AdPreviewsCreate: ($adAccountId, $adPreviewRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "adPreviewRequest": ""
            };
        },

        // @return AdArrayResponse
        AdsCreate: ($adAccountId, $adCreateRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "adCreateRequest": ""
            };
        },

        // @return AdArrayResponse
        AdsUpdate: ($adAccountId, $adUpdateRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "adUpdateRequest": ""
            };
        },

    }
}