package org.openapitools.api.interfaces;

import org.openapitools.model.PinterestLibError;
import org.openapitools.model.RelatedTerms;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface TermsService {

    /**
     * List related terms
     * Get a list of terms logically related to each input term.  Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
     *
     * @param terms List of input terms. (required)
     * @return RelatedTerms
     */
    RelatedTerms termsRelatedList(
        List<String> terms
    );

    /**
     * List suggested terms
     * Get popular search terms that begin with your input term.  Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
     *
     * @param term Input term. (required)
     * @param limit Max suggested terms to return. (optional, default to 4)
     * @return List<String>
     */
    List<String> termsSuggestedList(
        String term,
        Integer limit
    );
}
