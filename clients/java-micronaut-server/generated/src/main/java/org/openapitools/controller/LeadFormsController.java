/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.Error;
import org.openapitools.model.LeadFormArrayResponse;
import org.openapitools.model.LeadFormCreateRequest;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormUpdateRequest;
import org.openapitools.model.LeadFormsList200Response;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-05T02:03:37.829873561Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
@Tag(name = "LeadForms", description = "The LeadForms API")
public class LeadFormsController {
    /**
     * Get lead form by id
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormId Unique identifier of a lead form. (required)
     * @return LeadFormResponse
     */
    @Operation(
        operationId = "leadFormGet",
        summary = "Get lead form by id",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LeadFormResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "The lead form ID for the given ad account ID does not exist.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "leadFormId", description = "Unique identifier of a lead form.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<LeadFormResponse> leadFormGet(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @PathVariable(value="lead_form_id") @NotNull @Pattern(regexp="^\\d+$") String leadFormId
    ) {
        // TODO implement leadFormGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Create lead form test data
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormId Unique identifier of a lead form. (required)
     * @param leadFormTestRequest Subscription to create. (required)
     * @return LeadFormTestResponse
     */
    @Operation(
        operationId = "leadFormTestCreate",
        summary = "Create lead form test data",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LeadFormTestResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "Lead not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "leadFormId", description = "Unique identifier of a lead form.", required = true),
            @Parameter(name = "leadFormTestRequest", description = "Subscription to create.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Post(uri="/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<LeadFormTestResponse> leadFormTestCreate(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @PathVariable(value="lead_form_id") @NotNull @Pattern(regexp="^\\d+$") String leadFormId, 
        @Body @NotNull @Valid LeadFormTestRequest leadFormTestRequest
    ) {
        // TODO implement leadFormTestCreate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Create lead forms
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormCreateRequest List of lead forms to create, size limit [1, 30]. (required)
     * @return LeadFormArrayResponse
     */
    @Operation(
        operationId = "leadFormsCreate",
        summary = "Create lead forms",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LeadFormArrayResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "leadFormCreateRequest", description = "List of lead forms to create, size limit [1, 30].", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Post(uri="/ad_accounts/{ad_account_id}/lead_forms")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<LeadFormArrayResponse> leadFormsCreate(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Size(min=1, max=30) List<@Valid LeadFormCreateRequest> leadFormCreateRequest
    ) {
        // TODO implement leadFormsCreate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * List lead forms
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return LeadFormsList200Response
     */
    @Operation(
        operationId = "leadFormsList",
        summary = "List lead forms",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LeadFormsList200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information."),
            @Parameter(name = "order", description = "The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items."),
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/ad_accounts/{ad_account_id}/lead_forms")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<LeadFormsList200Response> leadFormsList(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="order") @Nullable String order, 
        @QueryValue(value="bookmark") @Nullable String bookmark
    ) {
        // TODO implement leadFormsList();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Update lead forms
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormUpdateRequest List of lead forms to update, size limit [1, 30]. (required)
     * @return LeadFormArrayResponse
     */
    @Operation(
        operationId = "leadFormsUpdate",
        summary = "Update lead forms",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LeadFormArrayResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ad account lead forms parameters.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "adAccountId", description = "Unique identifier of an ad account.", required = true),
            @Parameter(name = "leadFormUpdateRequest", description = "List of lead forms to update, size limit [1, 30].", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Patch(uri="/ad_accounts/{ad_account_id}/lead_forms")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<LeadFormArrayResponse> leadFormsUpdate(
        @PathVariable(value="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Size(min=1, max=30) List<@Valid LeadFormUpdateRequest> leadFormUpdateRequest
    ) {
        // TODO implement leadFormsUpdate();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
