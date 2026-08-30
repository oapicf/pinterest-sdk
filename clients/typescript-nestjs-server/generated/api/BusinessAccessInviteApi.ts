import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AuthRespondInvitesBody, CancelInvitesRequest, CancelInvitesResponse, CreateAssetAccessRequestBody, CreateAssetAccessRequestResponse, CreateAssetInvitesRequest, CreateInvitesResultsResponseArray, CreateMembershipOrPartnershipInvitesBody, GetInvites200Response, InviteFilterStatus, InviteType, RespondToInvitesResponseArray, UpdateInvitesResultsResponseArray,  } from '../models';


@Injectable()
export abstract class BusinessAccessInviteApi {

  abstract assetAccessRequestsCreate(businessId: string, createAssetAccessRequestBody: CreateAssetAccessRequestBody,  request: Request): CreateAssetAccessRequestResponse | Promise<CreateAssetAccessRequestResponse> | Observable<CreateAssetAccessRequestResponse>;


  abstract cancelInvitesOrRequests(businessId: string, cancelInvitesRequest: CancelInvitesRequest,  request: Request): CancelInvitesResponse | Promise<CancelInvitesResponse> | Observable<CancelInvitesResponse>;


  abstract createAssetInvites(businessId: string, createAssetInvitesRequest: CreateAssetInvitesRequest,  request: Request): UpdateInvitesResultsResponseArray | Promise<UpdateInvitesResultsResponseArray> | Observable<UpdateInvitesResultsResponseArray>;


  abstract createMembershipOrPartnershipInvites(businessId: string, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody,  request: Request): CreateInvitesResultsResponseArray | Promise<CreateInvitesResultsResponseArray> | Observable<CreateInvitesResultsResponseArray>;


  abstract getInvites(businessId: string, isMember: boolean | undefined, inviteStatus: Array<InviteFilterStatus> | undefined, inviteType: InviteType | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): GetInvites200Response | Promise<GetInvites200Response> | Observable<GetInvites200Response>;


  abstract respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody,  request: Request): RespondToInvitesResponseArray | Promise<RespondToInvitesResponseArray> | Observable<RespondToInvitesResponseArray>;

} 