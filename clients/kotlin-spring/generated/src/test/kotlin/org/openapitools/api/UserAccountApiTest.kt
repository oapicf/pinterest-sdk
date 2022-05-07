package org.openapitools.api

import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UserAccountApiTest {

    private val api: UserAccountApiController = UserAccountApiController()

    /**
     * To test UserAccountApiController.userAccountAnalytics
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountAnalyticsTest() {
        val startDate:java.time.LocalDate = TODO()
        val endDate:java.time.LocalDate = TODO()
        val fromClaimedContent:kotlin.String = TODO()
        val pinFormat:kotlin.String = TODO()
        val appTypes:kotlin.String = TODO()
        val metricTypes:kotlin.collections.List<kotlin.String>? = TODO()
        val splitField:kotlin.String = TODO()
        val adAccountId:kotlin.String? = TODO()
        val response: ResponseEntity<Map<String, AnalyticsMetricsResponse>> = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId)

        // TODO: test validations
    }

    /**
     * To test UserAccountApiController.userAccountGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun userAccountGetTest() {
        val adAccountId:kotlin.String? = TODO()
        val response: ResponseEntity<Account> = api.userAccountGet(adAccountId)

        // TODO: test validations
    }

}
