package org.openapitools.api

import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class UserAccountApiController() {


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account/analytics"],
        produces = ["application/json"]
    )
    fun userAccountAnalytics(@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
, @RequestParam(value = "from_claimed_content", required = false, defaultValue="BOTH") fromClaimedContent: kotlin.String
, @RequestParam(value = "pin_format", required = false, defaultValue="ALL") pinFormat: kotlin.String
, @RequestParam(value = "app_types", required = false, defaultValue="ALL") appTypes: kotlin.String
, @RequestParam(value = "metric_types", required = false) metricTypes: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") splitField: kotlin.String
,@Pattern(regexp="^\\d+$")  @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
): ResponseEntity<Map<String, AnalyticsMetricsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/user_account"],
        produces = ["application/json"]
    )
    fun userAccountGet(@Pattern(regexp="^\\d+$")  @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
): ResponseEntity<Account> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
