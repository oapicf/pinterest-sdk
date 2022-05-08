/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class AdAccountsApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /ad_accounts/{ad_account_id}/analytics : Get ad account analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/analytics")
                .description("Get ad account analytics")
                .id("adAccountAnalyticsApi")
                .produces("application/json")
                .outType(Map[].class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("columns")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")
                .endParam()
                .param()
                    .name("granularity")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Granularity")
                .endParam()
                .param()
                    .name("clickWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("engagementWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("viewWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
                .endParam()
                .param()
                    .name("conversionReportTime")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
                .endParam()
                .to("direct:adAccountAnalytics");
        

        /**
        GET /ad_accounts : List ad accounts
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts")
                .description("List ad accounts")
                .id("adAccountsListApi")
                .produces("application/json")
                .outType(Paginated.class)
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("includeSharedAccounts")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Include shared ad accounts")
                .endParam()
                .to("direct:adAccountsList");
        

        /**
        GET /ad_accounts/{ad_account_id}/ad_groups/analytics : Get ad group analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/ad_groups/analytics")
                .description("Get ad group analytics")
                .id("adGroupsAnalyticsApi")
                .produces("application/json")
                .outType(Map[].class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("adGroupIds")
                    .type(RestParamType.query)
                    .required(true)
                    .description("List of Ad group Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("columns")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")
                .endParam()
                .param()
                    .name("granularity")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Granularity")
                .endParam()
                .param()
                    .name("clickWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("engagementWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("viewWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
                .endParam()
                .param()
                    .name("conversionReportTime")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
                .endParam()
                .to("direct:adGroupsAnalytics");
        

        /**
        GET /ad_accounts/{ad_account_id}/ad_groups : List ad groups
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/ad_groups")
                .description("List ad groups")
                .id("adGroupsListApi")
                .produces("application/json")
                .outType(Paginated.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("campaignIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Campaign Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("adGroupIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Ad group Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("entityStatuses")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Entity status")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("order")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("translateInterestsToNames")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Return interests as text names (if value is true) rather than topic IDs.")
                .endParam()
                .to("direct:adGroupsList");
        

        /**
        GET /ad_accounts/{ad_account_id}/ads/analytics : Get ad analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/ads/analytics")
                .description("Get ad analytics")
                .id("adsAnalyticsApi")
                .produces("application/json")
                .outType(Map[].class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("adIds")
                    .type(RestParamType.query)
                    .required(true)
                    .description("List of Ad Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("columns")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")
                .endParam()
                .param()
                    .name("granularity")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Granularity")
                .endParam()
                .param()
                    .name("clickWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("engagementWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("viewWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
                .endParam()
                .param()
                    .name("conversionReportTime")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
                .endParam()
                .to("direct:adsAnalytics");
        

        /**
        GET /ad_accounts/{ad_account_id}/ads : List ads
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/ads")
                .description("List ads")
                .id("adsListApi")
                .produces("application/json")
                .outType(Paginated.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("campaignIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Campaign Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("adGroupIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Ad group Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("adIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Ad Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("entityStatuses")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Entity status")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("order")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .to("direct:adsList");
        

        /**
        POST /ad_accounts/{ad_account_id}/reports : Create async request for an account analytics report
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .post("/ad_accounts/{ad_account_id}/reports")
                .description("Create async request for an account analytics report")
                .id("analyticsCreateReportApi")
                .produces("application/json")
                .outType(AdsAnalyticsCreateAsyncResponse.class)
                .consumes("application/json")
                .type(AdsAnalyticsCreateAsyncRequest.class)
                
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("adsAnalyticsCreateAsyncRequest")
                    .type(RestParamType.body)
                    .required(true)
                .endParam()
                .to("direct:analyticsCreateReport");
        

        /**
        GET /ad_accounts/{ad_account_id}/reports : Get the account analytics report created by the async call
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/reports")
                .description("Get the account analytics report created by the async call")
                .id("analyticsGetReportApi")
                .produces("application/json")
                .outType(AdsAnalyticsGetAsyncResponse.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("token")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Token returned from the post request creation call")
                .endParam()
                .to("direct:analyticsGetReport");
        

        /**
        GET /ad_accounts/{ad_account_id}/campaigns/analytics : Get campaign analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/campaigns/analytics")
                .description("Get campaign analytics")
                .id("campaignsAnalyticsApi")
                .produces("application/json")
                .outType(Map[].class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("campaignIds")
                    .type(RestParamType.query)
                    .required(true)
                    .description("List of Campaign Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("columns")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")
                .endParam()
                .param()
                    .name("granularity")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Granularity")
                .endParam()
                .param()
                    .name("clickWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("engagementWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("viewWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
                .endParam()
                .param()
                    .name("conversionReportTime")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
                .endParam()
                .to("direct:campaignsAnalytics");
        

        /**
        GET /ad_accounts/{ad_account_id}/campaigns : List campaigns
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/campaigns")
                .description("List campaigns")
                .id("campaignsListApi")
                .produces("application/json")
                .outType(Paginated.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("campaignIds")
                    .type(RestParamType.query)
                    .required(false)
                    .description("List of Campaign Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("entityStatuses")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Entity status")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("order")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .to("direct:campaignsList");
        

        /**
        GET /ad_accounts/{ad_account_id}/product_groups/analytics : Get product group analytics
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("ads:read","See all of your advertising data, including ads, ad groups, campaigns etc.")
                
            .endSecurityDefinition()
            .get("/ad_accounts/{ad_account_id}/product_groups/analytics")
                .description("Get product group analytics")
                .id("productGroupsAnalyticsApi")
                .produces("application/json")
                .outType(Map[].class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.path)
                    .required(true)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("startDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report start date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("endDate")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Metric report end date (UTC). Format: YYYY-MM-DD")
                .endParam()
                .param()
                    .name("productGroupIds")
                    .type(RestParamType.query)
                    .required(true)
                    .description("List of Product group Ids to use to filter the results.")
                .endParam()
                .param()
                    .name("columns")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned")
                .endParam()
                .param()
                    .name("granularity")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Granularity")
                .endParam()
                .param()
                    .name("clickWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("engagementWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
                .endParam()
                .param()
                    .name("viewWindowDays")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
                .endParam()
                .param()
                    .name("conversionReportTime")
                    .type(RestParamType.query)
                    .required(false)
                    .description("The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
                .endParam()
                .to("direct:productGroupsAnalytics");
        
    }
}