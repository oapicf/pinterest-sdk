import { BusinessRoleForMembers } from './business-role-for-members';


/**
 * A business member identified by `member_id` with their `business_role` in the business.
 */
export interface BusinessMembershipMember { 
  business_role: BusinessRoleForMembers;
  /**
   * Unique identifier of the member.
   */
  member_id: string;
}
export namespace BusinessMembershipMember {
}


