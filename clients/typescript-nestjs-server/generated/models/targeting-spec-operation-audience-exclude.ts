import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationAudienceExclude { 
  field: TargetingSpecOperationAudienceExclude.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationAudienceExclude {
  export const FieldEnum = {
    AudienceExclude: 'AUDIENCE_EXCLUDE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


