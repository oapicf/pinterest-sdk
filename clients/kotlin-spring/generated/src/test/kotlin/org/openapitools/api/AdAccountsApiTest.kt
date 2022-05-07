package org.openapitools.api

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse
import org.openapitools.model.AdsAnalyticsGetAsyncResponse
import org.openapitools.model.Error
import org.openapitools.model.Granularity
import org.openapitools.model.Paginated
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AdAccountsApiTest {

    private val api: AdAccountsApiController = AdAccountsApiController()

    /**
     * To test AdAccountsApiController.adAccountAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountAnalyticsTest() {
        val adAccountId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val columns:kotlin.collections.List<kotlin.String> = TODO()
        val granularity:Granularity = TODO()
        val clickWindowDays:kotlin.Int = TODO()
        val engagementWindowDays:kotlin.Int = TODO()
        val viewWindowDays:kotlin.Int = TODO()
        val conversionReportTime:kotlin.String = TODO()
        val response: ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> = api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adAccountsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adAccountsListTest() {
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val includeSharedAccounts:kotlin.Boolean = TODO()
        val response: ResponseEntity<Paginated> = api.adAccountsList(bookmark, pageSize, includeSharedAccounts)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsAnalyticsTest() {
        val adAccountId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val adGroupIds:kotlin.collections.List<kotlin.String> = TODO()
        val columns:kotlin.collections.List<kotlin.String> = TODO()
        val granularity:Granularity = TODO()
        val clickWindowDays:kotlin.Int = TODO()
        val engagementWindowDays:kotlin.Int = TODO()
        val viewWindowDays:kotlin.Int = TODO()
        val conversionReportTime:kotlin.String = TODO()
        val response: ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> = api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adGroupsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adGroupsListTest() {
        val adAccountId:kotlin.String = TODO()
        val campaignIds:kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds:kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses:kotlin.collections.List<kotlin.String>? = TODO()
        val pageSize:kotlin.Int = TODO()
        val order:kotlin.String? = TODO()
        val bookmark:kotlin.String? = TODO()
        val translateInterestsToNames:kotlin.Boolean = TODO()
        val response: ResponseEntity<Paginated> = api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsAnalyticsTest() {
        val adAccountId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val adIds:kotlin.collections.List<kotlin.String> = TODO()
        val columns:kotlin.collections.List<kotlin.String> = TODO()
        val granularity:Granularity = TODO()
        val clickWindowDays:kotlin.Int = TODO()
        val engagementWindowDays:kotlin.Int = TODO()
        val viewWindowDays:kotlin.Int = TODO()
        val conversionReportTime:kotlin.String = TODO()
        val response: ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> = api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.adsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun adsListTest() {
        val adAccountId:kotlin.String = TODO()
        val campaignIds:kotlin.collections.List<kotlin.String>? = TODO()
        val adGroupIds:kotlin.collections.List<kotlin.String>? = TODO()
        val adIds:kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses:kotlin.collections.List<kotlin.String>? = TODO()
        val pageSize:kotlin.Int = TODO()
        val order:kotlin.String? = TODO()
        val bookmark:kotlin.String? = TODO()
        val response: ResponseEntity<Paginated> = api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsCreateReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsCreateReportTest() {
        val adAccountId:kotlin.String = TODO()
        val adsAnalyticsCreateAsyncRequest:AdsAnalyticsCreateAsyncRequest = TODO()
        val response: ResponseEntity<AdsAnalyticsCreateAsyncResponse> = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.analyticsGetReport
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun analyticsGetReportTest() {
        val adAccountId:kotlin.String = TODO()
        val token:kotlin.String = TODO()
        val response: ResponseEntity<AdsAnalyticsGetAsyncResponse> = api.analyticsGetReport(adAccountId, token)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsAnalyticsTest() {
        val adAccountId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val campaignIds:kotlin.collections.List<kotlin.String> = TODO()
        val columns:kotlin.collections.List<kotlin.String> = TODO()
        val granularity:Granularity = TODO()
        val clickWindowDays:kotlin.Int = TODO()
        val engagementWindowDays:kotlin.Int = TODO()
        val viewWindowDays:kotlin.Int = TODO()
        val conversionReportTime:kotlin.String = TODO()
        val response: ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> = api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.campaignsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun campaignsListTest() {
        val adAccountId:kotlin.String = TODO()
        val campaignIds:kotlin.collections.List<kotlin.String>? = TODO()
        val entityStatuses:kotlin.collections.List<kotlin.String>? = TODO()
        val pageSize:kotlin.Int = TODO()
        val order:kotlin.String? = TODO()
        val bookmark:kotlin.String? = TODO()
        val response: ResponseEntity<Paginated> = api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark)

        // TODO: test validations
    }

    /**
     * To test AdAccountsApiController.productGroupsAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productGroupsAnalyticsTest() {
        val adAccountId:kotlin.String = TODO()
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val productGroupIds:kotlin.collections.List<kotlin.String> = TODO()
        val columns:kotlin.collections.List<kotlin.String> = TODO()
        val granularity:Granularity = TODO()
        val clickWindowDays:kotlin.Int = TODO()
        val engagementWindowDays:kotlin.Int = TODO()
        val viewWindowDays:kotlin.Int = TODO()
        val conversionReportTime:kotlin.String = TODO()
        val response: ResponseEntity<List<kotlin.collections.Map<kotlin.String, kotlin.Any>>> = api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

        // TODO: test validations
    }

}
