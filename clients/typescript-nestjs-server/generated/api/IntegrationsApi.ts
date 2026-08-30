import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { IntegrationLogsRequestCreate, IntegrationLogsSuccessResponse, IntegrationMetadata, IntegrationMetadataCreate, IntegrationMetadataUpdate, IntegrationRecord, IntegrationsGetList200Response,  } from '../models';


@Injectable()
export abstract class IntegrationsApi {

  abstract integrationsCommerceDel(externalBusinessId: string,  request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata>;


  abstract integrationsCommerceGet(externalBusinessId: string,  request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata>;


  abstract integrationsCommercePatch(externalBusinessId: string, integrationMetadataUpdate: IntegrationMetadataUpdate,  request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata>;


  abstract integrationsCommercePost(integrationMetadataCreate: IntegrationMetadataCreate,  request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata>;


  abstract integrationsGetById(id: string,  request: Request): IntegrationRecord | Promise<IntegrationRecord> | Observable<IntegrationRecord>;


  abstract integrationsGetList(bookmark: string | undefined, pageSize: number | undefined,  request: Request): IntegrationsGetList200Response | Promise<IntegrationsGetList200Response> | Observable<IntegrationsGetList200Response>;


  abstract integrationsLogsPost(integrationLogsRequestCreate: IntegrationLogsRequestCreate,  request: Request): IntegrationLogsSuccessResponse | Promise<IntegrationLogsSuccessResponse> | Observable<IntegrationLogsSuccessResponse>;

} 