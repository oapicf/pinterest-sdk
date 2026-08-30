import { AudienceUpdateOperationType } from './audience-update-operation-type';


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
export interface CustomerSegmentUpdateRequestUpdateWithRequiredBody { 
  /**
   * Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
   */
  audience_ids?: Array<string>;
  /**
   * Customer segment ID.
   */
  id: string;
  operation_type: AudienceUpdateOperationType;
}
export namespace CustomerSegmentUpdateRequestUpdateWithRequiredBody {
}


