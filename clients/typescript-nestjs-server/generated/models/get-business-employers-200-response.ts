import { UserBusinessRoleBinding } from './user-business-role-binding';


export interface GetBusinessEmployers200Response { 
  bookmark?: string | null;
  items: Array<UserBusinessRoleBinding>;
}

