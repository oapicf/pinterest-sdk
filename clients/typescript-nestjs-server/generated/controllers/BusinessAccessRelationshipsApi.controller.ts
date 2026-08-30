import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BusinessAccessRelationshipsApi } from '../api';
import { BrandAccount, BrandAccountCreate, BrandAccountUpdate, BusinessMembershipMember, DeleteBusinessMembership200Response, DeleteBusinessMembershipBody, DeleteBusinessPartners, DeleteBusinessPartnersDelete, GetBusinessEmployers200Response, MemberBusinessRole, PartnerType, SystemUserUpdateWithRequiredBody, UpdateBusinessMembershipsResponse,  } from '../models';

@Controller()
export class BusinessAccessRelationshipsApiController {
  constructor(private readonly businessAccessRelationshipsApi: BusinessAccessRelationshipsApi) {}

  @Post('/business_access/business_hierarchy/:business_hierarchy_id/brand_accounts')
  brandAccountsCreate(@Param('business_hierarchy_id') businessHierarchyId: string, @Body() brandAccountCreate: BrandAccountCreate, @Req() request: Request): BrandAccount | Promise<BrandAccount> | Observable<BrandAccount> {
    return this.businessAccessRelationshipsApi.brandAccountsCreate(businessHierarchyId, brandAccountCreate, request);
  }

  @Patch('/business_access/business_hierarchy/:business_hierarchy_id/brand_accounts/:brand_account_id')
  brandAccountsUpdate(@Param('brand_account_id') brandAccountId: string, @Param('business_hierarchy_id') businessHierarchyId: string, @Body() brandAccountUpdate: BrandAccountUpdate, @Req() request: Request): BrandAccount | Promise<BrandAccount> | Observable<BrandAccount> {
    return this.businessAccessRelationshipsApi.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate, request);
  }

  @Delete('/businesses/:business_id/members')
  deleteBusinessMembership(@Param('business_id') businessId: string, @Body() deleteBusinessMembershipBody: DeleteBusinessMembershipBody, @Req() request: Request): DeleteBusinessMembership200Response | Promise<DeleteBusinessMembership200Response> | Observable<DeleteBusinessMembership200Response> {
    return this.businessAccessRelationshipsApi.deleteBusinessMembership(businessId, deleteBusinessMembershipBody, request);
  }

  @Delete('/businesses/:business_id/partners')
  deleteBusinessPartners(@Param('business_id') businessId: string, @Body() deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete, @Req() request: Request): DeleteBusinessPartners | Promise<DeleteBusinessPartners> | Observable<DeleteBusinessPartners> {
    return this.businessAccessRelationshipsApi.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete, request);
  }

  @Get('/businesses/employers')
  getBusinessEmployers(@Query('assets_summary', new DefaultValuePipe(true)) assetsSummary: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response> {
    return this.businessAccessRelationshipsApi.getBusinessEmployers(assetsSummary, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/members')
  getBusinessMembers(@Param('business_id') businessId: string, @Query('fetch_system_users', new DefaultValuePipe(false)) fetchSystemUsers: boolean | undefined, @Query('assets_summary', new DefaultValuePipe(false)) assetsSummary: boolean | undefined, @Query('business_roles') businessRoles: Array<MemberBusinessRole> | undefined, @Query('member_ids') memberIds: string | undefined, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response> {
    return this.businessAccessRelationshipsApi.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize, request);
  }

  @Get('/businesses/:business_id/partners')
  getBusinessPartners(@Param('business_id') businessId: string, @Query('assets_summary', new DefaultValuePipe(false)) assetsSummary: boolean | undefined, @Query('partner_type') partnerType: PartnerType | undefined, @Query('partner_ids') partnerIds: string | undefined, @Query('start_index', new DefaultValuePipe(0)) startIndex: number | undefined, @Query('sort_ascending') sortAscending: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response> {
    return this.businessAccessRelationshipsApi.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize, request);
  }

  @Patch('/businesses/:business_id/system_users/:system_user_id')
  systemUserUpdate(@Param('business_id') businessId: string, @Param('system_user_id') systemUserId: string, @Body() systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody, @Req() request: Request): void | Promise<void> | Observable<void> {
    return this.businessAccessRelationshipsApi.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody, request);
  }

  @Patch('/businesses/:business_id/members')
  updateBusinessMemberships(@Param('business_id') businessId: string, @Body() businessMembershipMember: Array<BusinessMembershipMember>, @Req() request: Request): UpdateBusinessMembershipsResponse | Promise<UpdateBusinessMembershipsResponse> | Observable<UpdateBusinessMembershipsResponse> {
    return this.businessAccessRelationshipsApi.updateBusinessMemberships(businessId, businessMembershipMember, request);
  }

} 