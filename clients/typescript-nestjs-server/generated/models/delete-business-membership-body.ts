import { DeleteBusinessMembershipMember } from './delete-business-membership-member';


/**
 * List of members with role to delete.
 */
export interface DeleteBusinessMembershipBody { 
  members: Array<DeleteBusinessMembershipMember>;
}

