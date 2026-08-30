package org.openapitools.api.consumer;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.IntegrationsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/integrations")
public class IntegrationsServiceController {

    @DubboReference
    private IntegrationsService integrationsService;

    @RequestMapping(method = RequestMethod.DELETE, value = "/commerce/{external_business_id}")
    public IntegrationMetadata integrationsCommerceDel(
        @RequestParam(name = "externalBusinessId") String externalBusinessId
    ) {
        return integrationsService.integrationsCommerceDel(externalBusinessId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/commerce/{external_business_id}")
    public IntegrationMetadata integrationsCommerceGet(
        @RequestParam(name = "externalBusinessId") String externalBusinessId
    ) {
        return integrationsService.integrationsCommerceGet(externalBusinessId);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/commerce/{external_business_id}")
    public IntegrationMetadata integrationsCommercePatch(
        @RequestParam(name = "externalBusinessId") String externalBusinessId,
        @RequestParam(name = "integrationMetadataUpdate") IntegrationMetadataUpdate integrationMetadataUpdate
    ) {
        return integrationsService.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/commerce")
    public IntegrationMetadata integrationsCommercePost(
        @RequestParam(name = "integrationMetadataCreate") IntegrationMetadataCreate integrationMetadataCreate
    ) {
        return integrationsService.integrationsCommercePost(integrationMetadataCreate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public IntegrationRecord integrationsGetById(
        @RequestParam(name = "id") String id
    ) {
        return integrationsService.integrationsGetById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public IntegrationsGetList200Response integrationsGetList(
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return integrationsService.integrationsGetList(bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/logs")
    public IntegrationLogsSuccessResponse integrationsLogsPost(
        @RequestParam(name = "integrationLogsRequestCreate") IntegrationLogsRequestCreate integrationLogsRequestCreate
    ) {
        return integrationsService.integrationsLogsPost(integrationLogsRequestCreate);
    }
}
