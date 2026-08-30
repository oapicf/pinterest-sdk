package org.openapitools.api.consumer;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.RelatedTerms;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.TermsService;
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
@RequestMapping("/terms")
public class TermsServiceController {

    @DubboReference
    private TermsService termsService;

    @RequestMapping(method = RequestMethod.GET, value = "/related")
    public RelatedTerms termsRelatedList(
        @RequestParam(name = "terms") List<String> terms
    ) {
        return termsService.termsRelatedList(terms);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/suggested")
    public List<String> termsSuggestedList(
        @RequestParam(name = "term") String term,
        @RequestParam(name = "limit", defaultValue = "4") Integer limit
    ) {
        return termsService.termsSuggestedList(term, limit);
    }
}
