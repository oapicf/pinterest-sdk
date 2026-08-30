import { BusinessRoleForMembers } from './business-role-for-members';


/**
 * Single instance of a business member to be removed from the business.
 */
export interface DeleteBusinessMembershipMember { 
  business_role: BusinessRoleForMembers;
  /**
   * Unique identifier of the member
   */
  member_id: string;
}
export namespace DeleteBusinessMembershipMember {
}


