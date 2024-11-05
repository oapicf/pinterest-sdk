package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class SearchApiService {
    public abstract Response searchPartnerPins( @NotNull String term, @NotNull String countryCode,String bookmark,String locale, @Min(1) @Max(50)Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchUserBoardsGet( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,String query,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchUserPinsList( @NotNull String query, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark,SecurityContext securityContext) throws NotFoundException;
}
