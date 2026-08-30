package org.openapitools.api.consumer;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.AdvancedAuctionService;
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
@RequestMapping("/advanced_auction")
public class AdvancedAuctionServiceController {

    @DubboReference
    private AdvancedAuctionService advancedAuctionService;

    @RequestMapping(method = RequestMethod.POST, value = "/items/get")
    public AdvancedAuctionItems advancedAuctionItemsGetPost(
        @RequestParam(name = "advancedAuctionItemsGetRequest") AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return advancedAuctionService.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items/submit")
    public AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(
        @RequestParam(name = "advancedAuctionItemsSubmitRequest") AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return advancedAuctionService.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId);
    }
}
