import { OperationType } from './operation-type';


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
export interface BusinessToBusinessSharedAudienceUpdateWithRequiredBody { 
  /**
   * Unique identifier of an audience
   */
  audience_id: string;
  operation_type: OperationType;
  /**
   * Business IDs to share with or revoke from (request) / that received the audience (response).
   */
  recipient_business_ids: Array<string>;
}
export namespace BusinessToBusinessSharedAudienceUpdateWithRequiredBody {
}


