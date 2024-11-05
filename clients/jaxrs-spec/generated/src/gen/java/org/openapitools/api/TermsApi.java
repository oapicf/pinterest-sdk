package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/terms")
@Api(description = "the terms API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsApi {

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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response termsRelatedList(@QueryParam("terms") @NotNull  @ApiParam("List of input terms.")  List<String> terms) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response termsSuggestedList(@QueryParam("term") @NotNull  @ApiParam("Input term.")  String term,@QueryParam("limit") @Min(1) @Max(10) @DefaultValue("4")  @ApiParam("Max suggested terms to return.")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }
}
