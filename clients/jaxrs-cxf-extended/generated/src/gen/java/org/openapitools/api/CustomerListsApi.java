package org.openapitools.api;

import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.Error;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}/customer_lists")
@Api(value = "/", description = "")
public interface CustomerListsApi  {

    /**
     * Create customer lists
     *
     * &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt; &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the &lt;a href&#x3D;\&quot;#operation/create_audience_handler\&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer lists", tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerList customerListsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid CustomerListRequest customerListRequest);

    /**
     * Get customer list
     *
     * Gets a specific customer list given the customer list ID.
     *
     */
    @GET
    @Path("/{customer_list_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list", tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerList customerListsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId);

    /**
     * Get customer lists
     *
     * &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer lists", tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListsList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerListsList200Response customerListsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("order") String order, @QueryParam("bookmark") String bookmark);

    /**
     * Update customer list
     *
     * &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/ads/targeting/#Audiences\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     *
     */
    @PATCH
    @Path("/{customer_list_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update customer list", tags={ "customer_lists" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerList customerListsUpdate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId, @Valid CustomerListUpdateRequest customerListUpdateRequest);
}
