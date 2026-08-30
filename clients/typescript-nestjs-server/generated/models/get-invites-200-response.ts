import { InviteResponse } from './invite-response';


export interface GetInvites200Response { 
  bookmark?: string | null;
  items: Array<InviteResponse>;
}

