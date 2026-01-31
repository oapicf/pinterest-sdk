package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAccessApiServiceImpl extends BusinessAccessApiService {
    @Override
    public Response brandAccountsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId, BrandAccountsCreateRequest brandAccountsCreateRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response brandAccountsUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String brandAccountId, BrandAccountsUpdateRequest brandAccountsUpdateRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
