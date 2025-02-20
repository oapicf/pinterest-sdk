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

// billing_api

export default {
    Query: {

        // @return AdsCreditsDiscountsGet200Response
        AdsCreditsDiscountsGet: ($adAccountId, $bookmark, $pageSize) => {
            return {
                "adAccountId": "adAccountId_example",
                "bookmark": "bookmark_example",
                "pageSize": "56"
            };
        },

        // @return BillingProfilesGet200Response
        BillingProfilesGet: ($adAccountId, $isActive, $bookmark, $pageSize) => {
            return {
                "adAccountId": "adAccountId_example",
                "isActive": "true",
                "bookmark": "bookmark_example",
                "pageSize": "56"
            };
        },

        // @return SsioAccountResponse
        SsioAccountsGet: ($adAccountId) => {
            return {
                "adAccountId": "adAccountId_example"
            };
        },

        // @return SsioInsertionOrdersStatusGetByAdAccount200Response
        SsioInsertionOrdersStatusGetByAdAccount: ($adAccountId, $bookmark, $pageSize) => {
            return {
                "adAccountId": "adAccountId_example",
                "bookmark": "bookmark_example",
                "pageSize": "56"
            };
        },

        // @return SsioInsertionOrderStatusResponse
        SsioInsertionOrdersStatusGetByPinOrderId: ($adAccountId, $pinOrderId) => {
            return {
                "adAccountId": "adAccountId_example",
                "pinOrderId": "0Q01N0000015hekSVDFDC"
            };
        },

        // @return SsioOrderLinesGetByAdAccount200Response
        SsioOrderLinesGetByAdAccount: ($adAccountId, $bookmark, $pageSize, $pinOrderId) => {
            return {
                "adAccountId": "adAccountId_example",
                "bookmark": "bookmark_example",
                "pageSize": "56",
                "pinOrderId": "0Q01N0000015hekSVDFDC"
            };
        },

    },

    Mutation: {

        // @return AdsCreditRedeemResponse
        AdsCreditRedeem: ($adAccountId, $adsCreditRedeemRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "adsCreditRedeemRequest": ""
            };
        },

        // @return SsioCreateInsertionOrderResponse
        SsioInsertionOrderCreate: ($adAccountId, $ssioCreateInsertionOrderRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "ssioCreateInsertionOrderRequest": ""
            };
        },

        // @return SsioEditInsertionOrderResponse
        SsioInsertionOrderEdit: ($adAccountId, $ssioEditInsertionOrderRequest) => {
            return {
                "adAccountId": "adAccountId_example",
                "ssioEditInsertionOrderRequest": ""
            };
        },

    }
}