package org.openapitools.api

import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.Pin
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
class PinsApiController() {


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/pins/{pin_id}/analytics"],
        produces = ["application/json"]
    )
    fun pinsAnalytics( @PathVariable("pin_id") pinId: kotlin.String
,@NotNull  @RequestParam(value = "start_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) startDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "end_date", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE) endDate: java.time.LocalDate
,@NotNull  @RequestParam(value = "metric_types", required = true) metricTypes: kotlin.collections.List<kotlin.String>
, @RequestParam(value = "app_types", required = false, defaultValue="ALL") appTypes: kotlin.String
, @RequestParam(value = "split_field", required = false, defaultValue="NO_SPLIT") splitField: kotlin.String
,@Pattern(regexp="^\\d+$")  @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
): ResponseEntity<Map<String, AnalyticsMetricsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/pins"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun pinsCreate( @Valid @RequestBody pin: Pin
): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/pins/{pin_id}"],
        produces = ["application/json"]
    )
    fun pinsDelete( @PathVariable("pin_id") pinId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/pins/{pin_id}"],
        produces = ["application/json"]
    )
    fun pinsGet( @PathVariable("pin_id") pinId: kotlin.String
,@Pattern(regexp="^\\d+$")  @RequestParam(value = "ad_account_id", required = false) adAccountId: kotlin.String?
): ResponseEntity<Pin> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
