package org.openapitools.api.consumer;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ResourcesService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/resources")
public class ResourcesServiceController {

    @DubboReference
    private ResourcesService resourcesService;

    @RequestMapping(method = RequestMethod.GET, value = "/ad_account_countries")
    public AdAccountCountriesGet200Response adAccountCountriesGet(
    ) {
        return resourcesService.adAccountCountriesGet();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delivery_metrics")
    public DeliveryMetricsGet200Response deliveryMetricsGet(
        @RequestParam(name = "reportType") ReportType reportType
    ) {
        return resourcesService.deliveryMetricsGet(reportType);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/targeting/interests/{interest_id}")
    public SingleInterestTargetingOption interestTargetingOptionsGet(
        @RequestParam(name = "interestId") String interestId
    ) {
        return resourcesService.interestTargetingOptionsGet(interestId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/lead_form_questions")
    public void leadFormQuestionsGet(
    ) {
        resourcesService.leadFormQuestionsGet();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/metrics_ready_state")
    public BookClosed metricsReadyStateGet(
        @RequestParam(name = "date") String date
    ) {
        return resourcesService.metricsReadyStateGet(date);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/targeting/{targeting_type}")
    public List<Object> targetingOptionsGet(
        @RequestParam(name = "targetingType") PublicTargetingType targetingType,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "clientId") String clientId,
        @RequestParam(name = "oauthSignature") String oauthSignature,
        @RequestParam(name = "timestamp") String timestamp
    ) {
        return resourcesService.targetingOptionsGet(targetingType, adAccountId, clientId, oauthSignature, timestamp);
    }
}
