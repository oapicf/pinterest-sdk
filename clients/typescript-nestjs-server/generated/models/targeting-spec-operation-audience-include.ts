import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationAudienceInclude { 
  field: TargetingSpecOperationAudienceInclude.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationAudienceInclude {
  export const FieldEnum = {
    AudienceInclude: 'AUDIENCE_INCLUDE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


