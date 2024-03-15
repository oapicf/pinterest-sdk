package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/terms")
@Api(value = "/", description = "")
public interface TermsApi  {

    /**
     * List related terms
     *
     * Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
     *
     */
    @GET
    @Path("/related")
    @Produces({ "application/json" })
    @ApiOperation(value = "List related terms", tags={ "terms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RelatedTerms.class),
        @ApiResponse(code = 400, message = "Invalid terms related parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public RelatedTerms termsRelatedList(@QueryParam("terms") @NotNull List<String> terms);

    /**
     * List suggested terms
     *
     * Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
     *
     */
    @GET
    @Path("/suggested")
    @Produces({ "application/json" })
    @ApiOperation(value = "List suggested terms", tags={ "terms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid terms suggested parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public List<String> termsSuggestedList(@QueryParam("term") @NotNull String term, @QueryParam("limit") @Min(1) @Max(10) @DefaultValue("4")Integer limit);
}
