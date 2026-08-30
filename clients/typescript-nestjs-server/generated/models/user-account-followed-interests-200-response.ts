import { Interest } from './interest';


export interface UserAccountFollowedInterests200Response { 
  bookmark?: string | null;
  items: Array<Interest>;
}

