package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TermsApiService;
import org.openapitools.api.factories.TermsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import java.util.List;
import org.openapitools.model.RelatedTerms;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/terms")


@io.swagger.annotations.Api(description = "the terms API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsApi  {
   private final TermsApiService delegate = TermsApiServiceFactory.getTermsApi();

    @GET
    @Path("/related")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List related terms", notes = "Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.", response = RelatedTerms.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "terms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = RelatedTerms.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid terms related parameters.", response = RelatedTerms.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = RelatedTerms.class) })
    public Response termsRelatedList(@ApiParam(value = "List of input terms.",required=true) @QueryParam("terms") List<String> terms
)
    throws NotFoundException {
        return delegate.termsRelatedList(terms);
    }
    @GET
    @Path("/suggested")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List suggested terms", notes = "Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "terms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid terms suggested parameters.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = String.class, responseContainer = "List") })
    public Response termsSuggestedList(@ApiParam(value = "Input term.",required=true) @QueryParam("term") String term
,@ApiParam(value = "Max suggested terms to return.", defaultValue="4") @DefaultValue("4") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.termsSuggestedList(term,limit);
    }
}
