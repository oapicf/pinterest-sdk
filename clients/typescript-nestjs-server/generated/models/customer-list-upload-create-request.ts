import { UserListOperationType } from './user-list-operation-type';


export interface CustomerListUploadCreateRequest { 
  operation: UserListOperationType;
  /**
   * Number of parts to upload the file in.
   */
  total_parts: number;
}
export namespace CustomerListUploadCreateRequest {
}


