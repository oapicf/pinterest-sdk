package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-03T06:15:42.944881082Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface BusinessAccessApiService {
      Response brandAccountsCreate(String businessHierarchyId,BrandAccountCreate brandAccountCreate,SecurityContext securityContext)
      throws NotFoundException;
      Response brandAccountsUpdate(String brandAccountId,String businessHierarchyId,BrandAccountUpdate brandAccountUpdate,SecurityContext securityContext)
      throws NotFoundException;


}
