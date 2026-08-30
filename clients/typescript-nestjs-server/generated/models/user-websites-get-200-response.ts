import { UserWebsite } from './user-website';


export interface UserWebsitesGet200Response { 
  bookmark?: string | null;
  items: Array<UserWebsite>;
}

