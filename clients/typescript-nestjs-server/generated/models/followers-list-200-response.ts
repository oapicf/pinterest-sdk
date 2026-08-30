import { FollowUser } from './follow-user';


export interface FollowersList200Response { 
  bookmark?: string | null;
  items: Array<FollowUser>;
}

