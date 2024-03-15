package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Error;
import org.openapitools.model.UserAccountFollowedInterests200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UsersApiServiceImpl extends UsersApiService {
    @Override
    public Response userAccountFollowedInterests( @Pattern(regexp="(?!^\\d+$)^.+$")String username, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
