/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  CancelInvitesBody,
  UpdateInvitesResultsResponseArray,
  CreateAssetAccessRequestBody,
  CreateMembershipOrPartnershipInvitesBody,
  CreateInvitesResultsResponseArray,
  CreateAssetAccessRequestResponse,
  CreateAssetInvitesRequest,
  RespondToInvitesResponseArray,
  InviteType,
  AuthRespondInvitesBody,
  DeleteInvitesResultsResponseArray,
  GetInvites200Response,
} from './models';

/**
 * assetAccessRequestsCreate - parameters interface
 */
export interface IAssetAccessRequestsCreateParams {
  businessId: string;
  createAssetAccessRequestBody: CreateAssetAccessRequestBody;
}

/**
 * cancelInvitesOrRequests - parameters interface
 */
export interface ICancelInvitesOrRequestsParams {
  businessId: string;
  cancelInvitesBody: CancelInvitesBody;
}

/**
 * createAssetInvites - parameters interface
 */
export interface ICreateAssetInvitesParams {
  businessId: string;
  createAssetInvitesRequest: CreateAssetInvitesRequest;
}

/**
 * createMembershipOrPartnershipInvites - parameters interface
 */
export interface ICreateMembershipOrPartnershipInvitesParams {
  businessId: string;
  createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody;
}

/**
 * getInvites - parameters interface
 */
export interface IGetInvitesParams {
  businessId: string;
  isMember?: boolean;
  inviteStatus?: Array<'PENDING' | 'EXPIRED'>;
  inviteType?: InviteType;
  bookmark?: string;
  pageSize?: number;
}

/**
 * respondBusinessAccessInvites - parameters interface
 */
export interface IRespondBusinessAccessInvitesParams {
  authRespondInvitesBody: AuthRespondInvitesBody;
}

/**
 * BusinessAccessInviteApi - API class
 */
@autoinject()
export class BusinessAccessInviteApi extends Api {

  /**
   * Creates a new BusinessAccessInviteApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Create a request to access an existing partner\&#39;s assets.
   * Create a request to access an existing partner\&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
   * @param params.businessId Unique identifier of the requesting business.
   * @param params.createAssetAccessRequestBody 
   */
  async assetAccessRequestsCreate(params: IAssetAccessRequestsCreateParams): Promise<CreateAssetAccessRequestResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('assetAccessRequestsCreate', params, 'businessId');
    this.ensureParamIsSet('assetAccessRequestsCreate', params, 'createAssetAccessRequestBody');

    // Create URL to call
    const url = `${this.basePath}/businesses/{business_id}/requests/assets/access`
      .replace(`{${'business_id'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createAssetAccessRequestBody'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Cancel invites/requests
   * Cancel membership/partnership invites and/or requests.
   * @param params.businessId Business id
   * @param params.cancelInvitesBody A list with invite ids
   */
  async cancelInvitesOrRequests(params: ICancelInvitesOrRequestsParams): Promise<DeleteInvitesResultsResponseArray> {
    // Verify required parameters are set
    this.ensureParamIsSet('cancelInvitesOrRequests', params, 'businessId');
    this.ensureParamIsSet('cancelInvitesOrRequests', params, 'cancelInvitesBody');

    // Create URL to call
    const url = `${this.basePath}/businesses/{business_id}/invites`
      .replace(`{${'business_id'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asDelete()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['cancelInvitesBody'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Update invite/request with an asset permission
   * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner\&#39;s assets\&quot; to request access to your   partner\&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
   * @param params.businessId Unique identifier of the requesting business.
   * @param params.createAssetInvitesRequest A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
   */
  async createAssetInvites(params: ICreateAssetInvitesParams): Promise<UpdateInvitesResultsResponseArray> {
    // Verify required parameters are set
    this.ensureParamIsSet('createAssetInvites', params, 'businessId');
    this.ensureParamIsSet('createAssetInvites', params, 'createAssetInvitesRequest');

    // Create URL to call
    const url = `${this.basePath}/businesses/{business_id}/invites/assets/access`
      .replace(`{${'business_id'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createAssetInvitesRequest'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Create invites or requests
   * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
   * @param params.businessId Business id
   * @param params.createMembershipOrPartnershipInvitesBody An object with the properties: invite_type, partners, members, business_role
   */
  async createMembershipOrPartnershipInvites(params: ICreateMembershipOrPartnershipInvitesParams): Promise<CreateInvitesResultsResponseArray> {
    // Verify required parameters are set
    this.ensureParamIsSet('createMembershipOrPartnershipInvites', params, 'businessId');
    this.ensureParamIsSet('createMembershipOrPartnershipInvites', params, 'createMembershipOrPartnershipInvitesBody');

    // Create URL to call
    const url = `${this.basePath}/businesses/{business_id}/invites`
      .replace(`{${'business_id'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['createMembershipOrPartnershipInvitesBody'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get invites/requests
   * Get the membership/partnership invites and/or requests for the authorized user.
   * @param params.businessId Unique identifier of the requesting business.
   * @param params.isMember A boolean field to indicate whether the invite is to create a partnership or a membership.
   * @param params.inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
   * @param params.inviteType Invite type to filter invites by. Only invites of the specified type will be returned.
   * @param params.bookmark Cursor used to fetch the next page of items
   * @param params.pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
   */
  async getInvites(params: IGetInvitesParams): Promise<GetInvites200Response> {
    // Verify required parameters are set
    this.ensureParamIsSet('getInvites', params, 'businessId');

    // Create URL to call
    const url = `${this.basePath}/businesses/{business_id}/invites`
      .replace(`{${'business_id'}}`, encodeURIComponent(`${params['businessId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'is_member': params['isMember'],
        'invite_status': params['inviteStatus'],
        'invite_type': params['inviteType'],
        'bookmark': params['bookmark'],
        'page_size': params['pageSize'],
      })

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Accept or decline an invite/request
   * Accept or decline invites or requests.
   * @param params.authRespondInvitesBody 
   */
  async respondBusinessAccessInvites(params: IRespondBusinessAccessInvitesParams): Promise<RespondToInvitesResponseArray> {
    // Verify required parameters are set
    this.ensureParamIsSet('respondBusinessAccessInvites', params, 'authRespondInvitesBody');

    // Create URL to call
    const url = `${this.basePath}/businesses/invites`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPatch()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['authRespondInvitesBody'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

