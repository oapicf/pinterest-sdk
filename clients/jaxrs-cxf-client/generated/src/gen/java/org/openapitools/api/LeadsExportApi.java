package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LeadsExportCreateRequest;
import org.openapitools.model.LeadsExportCreateResponse;
import org.openapitools.model.LeadsExportResponseData;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}/leads_export")
@Api(value = "/", description = "")
public interface LeadsExportApi  {

    /**
     * Create a request to export leads collected from a lead ad
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a request to export leads collected from a lead ad", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadsExportCreateResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LeadsExportCreateResponse leadsExportCreate(@PathParam("ad_account_id") String adAccountId, LeadsExportCreateRequest leadsExportCreateRequest);

    /**
     * Get the lead export from the lead export create call
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     */
    @GET
    @Path("/{leads_export_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get the lead export from the lead export create call", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = LeadsExportResponseData.class),
        @ApiResponse(code = 400, message = "Invalid ad account parameter.", response = Error.class),
        @ApiResponse(code = 404, message = "Invalid leads export id parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public LeadsExportResponseData leadsExportGet(@PathParam("ad_account_id") String adAccountId, @PathParam("leads_export_id") String leadsExportId);
}
