/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.IntegrationLogsRequest;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationRequest;
import org.openapitools.model.IntegrationRequestPatch;
import org.openapitools.model.IntegrationsGetList200Response;
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

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-14T23:02:10.408800522Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
@Tag(name = "Integrations", description = "The Integrations API")
public class IntegrationsController {
    /**
     * Delete commerce integration
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     */
    @Operation(
        operationId = "integrationsCommerceDel",
        summary = "Delete commerce integration",
        responses = {
            @ApiResponse(responseCode = "204", description = "Commerce Integration deleted successfully"),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "externalBusinessId", description = "External business ID for the integration.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Delete(uri="/integrations/commerce/{external_business_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Void> integrationsCommerceDel(
        @PathVariable(value="external_business_id") @NotNull String externalBusinessId
    ) {
        // TODO implement integrationsCommerceDel();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get commerce integration
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     * @return IntegrationMetadata
     */
    @Operation(
        operationId = "integrationsCommerceGet",
        summary = "Get commerce integration",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationMetadata.class))
            }),
            @ApiResponse(responseCode = "404", description = "Integration not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "externalBusinessId", description = "External business ID for the integration.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/integrations/commerce/{external_business_id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationMetadata> integrationsCommerceGet(
        @PathVariable(value="external_business_id") @NotNull String externalBusinessId
    ) {
        // TODO implement integrationsCommerceGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Update commerce integration
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param externalBusinessId External business ID for the integration. (required)
     * @param integrationRequestPatch Parameters to get create/update the Integration Metadata (optional)
     * @return IntegrationMetadata
     */
    @Operation(
        operationId = "integrationsCommercePatch",
        summary = "Update commerce integration",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationMetadata.class))
            }),
            @ApiResponse(responseCode = "404", description = "Integration not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "externalBusinessId", description = "External business ID for the integration.", required = true),
            @Parameter(name = "integrationRequestPatch", description = "Parameters to get create/update the Integration Metadata")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Patch(uri="/integrations/commerce/{external_business_id}")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationMetadata> integrationsCommercePatch(
        @PathVariable(value="external_business_id") @NotNull String externalBusinessId, 
        @Body @Nullable @Valid IntegrationRequestPatch integrationRequestPatch
    ) {
        // TODO implement integrationsCommercePatch();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Create commerce integration
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param integrationRequest Parameters to get create/update the Integration Metadata (optional)
     * @return IntegrationMetadata
     */
    @Operation(
        operationId = "integrationsCommercePost",
        summary = "Create commerce integration",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationMetadata.class))
            }),
            @ApiResponse(responseCode = "404", description = "Integration not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "409", description = "Can't access this integration metadata.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "integrationRequest", description = "Parameters to get create/update the Integration Metadata")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Post(uri="/integrations/commerce")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationMetadata> integrationsCommercePost(
        @Body @Nullable @Valid IntegrationRequest integrationRequest
    ) {
        // TODO implement integrationsCommercePost();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get integration metadata
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param id Integration ID. (required)
     * @return IntegrationRecord
     */
    @Operation(
        operationId = "integrationsGetById",
        summary = "Get integration metadata",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationRecord.class))
            }),
            @ApiResponse(responseCode = "404", description = "Integration not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "id", description = "Integration ID.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/integrations/{id}")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationRecord> integrationsGetById(
        @PathVariable(value="id") @NotNull String id
    ) {
        // TODO implement integrationsGetById();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Get integration metadata list
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return IntegrationsGetList200Response
     */
    @Operation(
        operationId = "integrationsGetList",
        summary = "Get integration metadata list",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationsGetList200Response.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "bookmark", description = "Cursor used to fetch the next page of items"),
            @Parameter(name = "pageSize", description = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.")
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:read" })
        }
    )
    @Get(uri="/integrations")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationsGetList200Response> integrationsGetList(
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize
    ) {
        // TODO implement integrationsGetList();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Receives batched logs from integration applications.
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     * @param integrationLogsRequest Ingest log information from external integration application. (required)
     * @return IntegrationLogsSuccessResponse
     */
    @Operation(
        operationId = "integrationsLogsPost",
        summary = "Receives batched logs from integration applications.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IntegrationLogsSuccessResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DetailedError.class))
            }),
            @ApiResponse(responseCode = "0", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        parameters = {
            @Parameter(name = "integrationLogsRequest", description = "Ingest log information from external integration application.", required = true)
        },
        security = {
            @SecurityRequirement(name = "pinterest_oauth2", scopes = { "ads:write" })
        }
    )
    @Post(uri="/integrations/logs")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/json"})
    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<IntegrationLogsSuccessResponse> integrationsLogsPost(
        @Body @NotNull @Valid IntegrationLogsRequest integrationLogsRequest
    ) {
        // TODO implement integrationsLogsPost();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}