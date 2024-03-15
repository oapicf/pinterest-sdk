package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;
import org.openapitools.api.TermsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/terms")
@RequestScoped

@Api(description = "the terms API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class TermsApi  {

  @Context SecurityContext securityContext;

  @Inject TermsApiService delegate;


    @GET
    @Path("/related")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List related terms", notes = "Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.", response = RelatedTerms.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "terms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = RelatedTerms.class),
        @ApiResponse(code = 400, message = "Invalid terms related parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response termsRelatedList( @NotNull @ApiParam(value = "List of input terms.",required=true)  @QueryParam("terms") List<String> terms) {
        return delegate.termsRelatedList(terms, securityContext);
    }

    @GET
    @Path("/suggested")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List suggested terms", notes = "Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "terms" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid terms suggested parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response termsSuggestedList( @NotNull @ApiParam(value = "Input term.",required=true)  @QueryParam("term") String term,  @Min(1) @Max(10)@ApiParam(value = "Max suggested terms to return.", defaultValue="4") @DefaultValue("4")  @QueryParam("limit") Integer limit) {
        return delegate.termsSuggestedList(term, limit, securityContext);
    }
}
