package org.openapitools.api.consumer;

import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.SearchService;
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
@RequestMapping("/search")
public class SearchServiceController {

    @DubboReference
    private SearchService searchService;

    @RequestMapping(method = RequestMethod.GET, value = "/partner/pins")
    public SearchPartnerPins200Response searchPartnerPins(
        @RequestParam(name = "term") String term,
        @RequestParam(name = "countryCode") String countryCode,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "locale") String locale,
        @RequestParam(name = "limit", defaultValue = "10") Integer limit
    ) {
        return searchService.searchPartnerPins(term, countryCode, bookmark, locale, limit);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/boards")
    public BoardsList200Response searchUserBoardsGet(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "query") String query,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return searchService.searchUserBoardsGet(adAccountId, query, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pins")
    public PinsList200Response searchUserPinsList(
        @RequestParam(name = "query") String query,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark
    ) {
        return searchService.searchUserPinsList(query, adAccountId, bookmark);
    }
}
