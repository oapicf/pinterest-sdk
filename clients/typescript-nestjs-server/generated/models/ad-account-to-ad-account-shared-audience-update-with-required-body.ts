import { OperationType } from './operation-type';


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
export interface AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody { 
  /**
   * Unique identifier of an audience
   */
  audience_id: string;
  operation_type: OperationType;
  /**
   * Ad account IDs to share with or revoke from (request) / that received the audience (response).
   */
  recipient_account_ids: Array<string>;
}
export namespace AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody {
}


