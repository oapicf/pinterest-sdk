package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class TermsApiServiceImpl implements TermsApi {
    /**
     * List related terms
     *
     * Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
     *
     */
    public RelatedTerms termsRelatedList(List<String> terms) {
        // TODO: Implement...

        return null;
    }

    /**
     * List suggested terms
     *
     * Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
     *
     */
    public List<String> termsSuggestedList(String term, Integer limit) {
        // TODO: Implement...

        return null;
    }

}
