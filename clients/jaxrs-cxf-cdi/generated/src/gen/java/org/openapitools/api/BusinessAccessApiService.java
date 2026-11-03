package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-11-03T06:15:11.297068727Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface BusinessAccessApiService {
      public Response brandAccountsCreate(String businessHierarchyId, BrandAccountCreate brandAccountCreate, SecurityContext securityContext);
      public Response brandAccountsUpdate(String brandAccountId, String businessHierarchyId, BrandAccountUpdate brandAccountUpdate, SecurityContext securityContext);
}
