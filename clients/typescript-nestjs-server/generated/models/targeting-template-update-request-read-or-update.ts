import { AudienceUpdateOperationType } from './audience-update-operation-type';
import { TargetingSpecOptimal } from './targeting-spec-optimal';


export interface TargetingTemplateUpdateRequestReadOrUpdate { 
  /**
   * Targeting template ID
   */
  id: string;
  operation_type: AudienceUpdateOperationType;
  /**
   * targeting profile attributes
   */
  targeting_attributes?: TargetingSpecOptimal;
}
export namespace TargetingTemplateUpdateRequestReadOrUpdate {
}


