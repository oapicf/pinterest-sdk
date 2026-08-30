package org.openapitools.api.consumer;

import org.openapitools.model.CreativeType;
import java.time.LocalDate;
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinFilter;
import org.openapitools.model.PinType;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequestCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
import org.openapitools.model.QuerypinanalyticsmetrictypesItems;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.PinsService;
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
@RequestMapping("/pins")
public class PinsServiceController {

    @DubboReference
    private PinsService pinsService;

    @RequestMapping(method = RequestMethod.GET, value = "/analytics")
    public Map<String, Map<String, PinAnalyticsMetricsResponse>> multiPinsAnalytics(
        @RequestParam(name = "pinIds") List<String> pinIds,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "metricTypes") List<MultiPinsAnalyticsMetricTypesItem> metricTypes,
        @RequestParam(name = "appTypes", defaultValue = "ALL") String appTypes,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{pin_id}/analytics")
    public Map<String, PinAnalyticsMetricsResponse> pinsAnalytics(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "startDate") LocalDate startDate,
        @RequestParam(name = "endDate") LocalDate endDate,
        @RequestParam(name = "metricTypes") List<QuerypinanalyticsmetrictypesItems> metricTypes,
        @RequestParam(name = "appTypes", defaultValue = "ALL") String appTypes,
        @RequestParam(name = "splitField", defaultValue = "NO_SPLIT") String splitField,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Pin pinsCreate(
        @RequestParam(name = "pinCreate") PinCreate pinCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.pinsCreate(pinCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{pin_id}")
    public Pin pinsDelete(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.pinsDelete(pinId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{pin_id}")
    public Pin pinsGet(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinMetrics", defaultValue = "false") Boolean pinMetrics
    ) {
        return pinsService.pinsGet(pinId, adAccountId, pinMetrics);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public PinsList200Response pinsList(
        @RequestParam(name = "pinFilter") PinFilter pinFilter,
        @RequestParam(name = "pinMetrics", defaultValue = "false") Boolean pinMetrics,
        @RequestParam(name = "includeProtectedPins", defaultValue = "false") Boolean includeProtectedPins,
        @RequestParam(name = "pinType") PinType pinType,
        @RequestParam(name = "creativeTypes") List<CreativeType> creativeTypes,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "domain") String domain,
        @RequestParam(name = "domains") List<String> domains,
        @RequestParam(name = "includeProductTagObj") Boolean includeProductTagObj,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return pinsService.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{pin_id}/save")
    public Pin pinsSave(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "pinsSaveRequestCreate") PinsSaveRequestCreate pinsSaveRequestCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.pinsSave(pinId, pinsSaveRequestCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{pin_id}")
    public Pin pinsUpdate(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "pinUpdate") PinUpdate pinUpdate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return pinsService.pinsUpdate(pinId, pinUpdate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{pin_id}/product_tags")
    public ProductTagsResponse productTagsBulkAdd(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "productTagsBulkAddRequest") ProductTagsBulkAddRequest productTagsBulkAddRequest
    ) {
        return pinsService.productTagsBulkAdd(pinId, productTagsBulkAddRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{pin_id}/product_tags/bulk-delete")
    public void productTagsBulkDelete(
        @RequestParam(name = "pinId") String pinId,
        @RequestParam(name = "productTagsBulkDeleteRequest") ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest
    ) {
        pinsService.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{pin_id}/product_tags")
    public ProductTagsResponse productTagsList(
        @RequestParam(name = "pinId") String pinId
    ) {
        return pinsService.productTagsList(pinId);
    }
}
