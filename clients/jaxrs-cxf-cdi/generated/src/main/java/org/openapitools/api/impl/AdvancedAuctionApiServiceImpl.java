package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.Error;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionApiServiceImpl implements AdvancedAuctionApiService {
      @Override
      public Response advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, String adAccountId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, String adAccountId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
