import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { BrandAccount, BrandAccountCreate, BrandAccountUpdate, BusinessMembershipMember, DeleteBusinessMembership200Response, DeleteBusinessMembershipBody, DeleteBusinessPartners, DeleteBusinessPartnersDelete, GetBusinessEmployers200Response, MemberBusinessRole, PartnerType, SystemUserUpdateWithRequiredBody, UpdateBusinessMembershipsResponse,  } from '../models';


@Injectable()
export abstract class BusinessAccessRelationshipsApi {

  abstract brandAccountsCreate(businessHierarchyId: string, brandAccountCreate: BrandAccountCreate,  request: Request): BrandAccount | Promise<BrandAccount> | Observable<BrandAccount>;


  abstract brandAccountsUpdate(brandAccountId: string, businessHierarchyId: string, brandAccountUpdate: BrandAccountUpdate,  request: Request): BrandAccount | Promise<BrandAccount> | Observable<BrandAccount>;


  abstract deleteBusinessMembership(businessId: string, deleteBusinessMembershipBody: DeleteBusinessMembershipBody,  request: Request): DeleteBusinessMembership200Response | Promise<DeleteBusinessMembership200Response> | Observable<DeleteBusinessMembership200Response>;


  abstract deleteBusinessPartners(businessId: string, deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete,  request: Request): DeleteBusinessPartners | Promise<DeleteBusinessPartners> | Observable<DeleteBusinessPartners>;


  abstract getBusinessEmployers(assetsSummary: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response>;


  abstract getBusinessMembers(businessId: string, fetchSystemUsers: boolean | undefined, assetsSummary: boolean | undefined, businessRoles: Array<MemberBusinessRole> | undefined, memberIds: string | undefined, startIndex: number | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response>;


  abstract getBusinessPartners(businessId: string, assetsSummary: boolean | undefined, partnerType: PartnerType | undefined, partnerIds: string | undefined, startIndex: number | undefined, sortAscending: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): GetBusinessEmployers200Response | Promise<GetBusinessEmployers200Response> | Observable<GetBusinessEmployers200Response>;


  abstract systemUserUpdate(businessId: string, systemUserId: string, systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody,  request: Request): void | Promise<void> | Observable<void>;


  abstract updateBusinessMemberships(businessId: string, businessMembershipMember: Array<BusinessMembershipMember>,  request: Request): UpdateBusinessMembershipsResponse | Promise<UpdateBusinessMembershipsResponse> | Observable<UpdateBusinessMembershipsResponse>;

} 