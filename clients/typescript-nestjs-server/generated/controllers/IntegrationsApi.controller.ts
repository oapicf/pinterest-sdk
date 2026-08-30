import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { IntegrationsApi } from '../api';
import { IntegrationLogsRequestCreate, IntegrationLogsSuccessResponse, IntegrationMetadata, IntegrationMetadataCreate, IntegrationMetadataUpdate, IntegrationRecord, IntegrationsGetList200Response,  } from '../models';

@Controller()
export class IntegrationsApiController {
  constructor(private readonly integrationsApi: IntegrationsApi) {}

  @Delete('/integrations/commerce/:external_business_id')
  integrationsCommerceDel(@Param('external_business_id') externalBusinessId: string, @Req() request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata> {
    return this.integrationsApi.integrationsCommerceDel(externalBusinessId, request);
  }

  @Get('/integrations/commerce/:external_business_id')
  integrationsCommerceGet(@Param('external_business_id') externalBusinessId: string, @Req() request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata> {
    return this.integrationsApi.integrationsCommerceGet(externalBusinessId, request);
  }

  @Patch('/integrations/commerce/:external_business_id')
  integrationsCommercePatch(@Param('external_business_id') externalBusinessId: string, @Body() integrationMetadataUpdate: IntegrationMetadataUpdate, @Req() request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata> {
    return this.integrationsApi.integrationsCommercePatch(externalBusinessId, integrationMetadataUpdate, request);
  }

  @Post('/integrations/commerce')
  integrationsCommercePost(@Body() integrationMetadataCreate: IntegrationMetadataCreate, @Req() request: Request): IntegrationMetadata | Promise<IntegrationMetadata> | Observable<IntegrationMetadata> {
    return this.integrationsApi.integrationsCommercePost(integrationMetadataCreate, request);
  }

  @Get('/integrations/:id')
  integrationsGetById(@Param('id') id: string, @Req() request: Request): IntegrationRecord | Promise<IntegrationRecord> | Observable<IntegrationRecord> {
    return this.integrationsApi.integrationsGetById(id, request);
  }

  @Get('/integrations')
  integrationsGetList(@Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): IntegrationsGetList200Response | Promise<IntegrationsGetList200Response> | Observable<IntegrationsGetList200Response> {
    return this.integrationsApi.integrationsGetList(bookmark, pageSize, request);
  }

  @Post('/integrations/logs')
  integrationsLogsPost(@Body() integrationLogsRequestCreate: IntegrationLogsRequestCreate, @Req() request: Request): IntegrationLogsSuccessResponse | Promise<IntegrationLogsSuccessResponse> | Observable<IntegrationLogsSuccessResponse> {
    return this.integrationsApi.integrationsLogsPost(integrationLogsRequestCreate, request);
  }

} 