package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AdvancedAuctionItems;
import org.openapitools.model.AdvancedAuctionItemsGetRequest;
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest;
import org.openapitools.model.AdvancedAuctionProcessedItems;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-07T04:05:33.662988146Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public abstract class AdvancedAuctionApiService {
    public abstract Response advancedAuctionItemsGetPost(AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response advancedAuctionItemsSubmitPost(AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest
 ,String adAccountId
 ) throws NotFoundException;
}
