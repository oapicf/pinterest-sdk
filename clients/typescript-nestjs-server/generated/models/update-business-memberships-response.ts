import { BusinessMembershipMember } from './business-membership-member';


export interface UpdateBusinessMembershipsResponse { 
  /**
   * List of members with updated business access role.
   */
  items?: Array<BusinessMembershipMember>;
}

