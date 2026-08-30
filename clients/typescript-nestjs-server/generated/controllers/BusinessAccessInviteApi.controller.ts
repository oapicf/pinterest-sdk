import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BusinessAccessInviteApi } from '../api';
import { AuthRespondInvitesBody, CancelInvitesRequest, CancelInvitesResponse, CreateAssetAccessRequestBody, CreateAssetAccessRequestResponse, CreateAssetInvitesRequest, CreateInvitesResultsResponseArray, CreateMembershipOrPartnershipInvitesBody, GetInvites200Response, InviteFilterStatus, InviteType, RespondToInvitesResponseArray, UpdateInvitesResultsResponseArray,  } from '../models';

@Controller()
export class BusinessAccessInviteApiController {
  constructor(private readonly businessAccessInviteApi: BusinessAccessInviteApi) {}

  @Post('/businesses/:business_id/requests/assets/access')
  assetAccessRequestsCreate(@Param('business_id') businessId: string, @Body() createAssetAccessRequestBody: CreateAssetAccessRequestBody, @Req() request: Request): CreateAssetAccessRequestResponse | Promise<CreateAssetAccessRequestResponse> | Observable<CreateAssetAccessRequestResponse> {
    return this.businessAccessInviteApi.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody, request);
  }

  @Delete('/businesses/:business_id/invites')
  cancelInvitesOrRequests(@Param('business_id') businessId: string, @Body() cancelInvitesRequest: CancelInvitesRequest, @Req() request: Request): CancelInvitesResponse | Promise<CancelInvitesResponse> | Observable<CancelInvitesResponse> {
    return this.businessAccessInviteApi.cancelInvitesOrRequests(businessId, cancelInvitesRequest, request);
  }

  @Post('/businesses/:business_id/invites/assets/access')
  createAssetInvites(@Param('business_id') businessId: string, @Body() createAssetInvitesRequest: CreateAssetInvitesRequest, @Req() request: Request): UpdateInvitesResultsResponseArray | Promise<UpdateInvitesResultsResponseArray> | Observable<UpdateInvitesResultsResponseArray> {
    return this.businessAccessInviteApi.createAssetInvites(businessId, createAssetInvitesRequest, request);
  }

  @Post('/businesses/:business_id/invites')
  createMembershipOrPartnershipInvites(@Param('business_id') businessId: string, @Body() createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody, @Req() request: Request): CreateInvitesResultsResponseArray | Promise<CreateInvitesResultsResponseArray> | Observable<CreateInvitesResultsResponseArray> {
    return this.businessAccessInviteApi.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody, request);
  }

  @Get('/businesses/:business_id/invites')
  getInvites(@Param('business_id') businessId: string, @Query('is_member', new DefaultValuePipe(true)) isMember: boolean | undefined, @Query('invite_status') inviteStatus: Array<InviteFilterStatus> | undefined, @Query('invite_type') inviteType: InviteType | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): GetInvites200Response | Promise<GetInvites200Response> | Observable<GetInvites200Response> {
    return this.businessAccessInviteApi.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize, request);
  }

  @Patch('/businesses/invites')
  respondBusinessAccessInvites(@Body() authRespondInvitesBody: AuthRespondInvitesBody, @Req() request: Request): RespondToInvitesResponseArray | Promise<RespondToInvitesResponseArray> | Observable<RespondToInvitesResponseArray> {
    return this.businessAccessInviteApi.respondBusinessAccessInvites(authRespondInvitesBody, request);
  }

} 