import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationLocationExclude { 
  field: TargetingSpecOperationLocationExclude.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationLocationExclude {
  export const FieldEnum = {
    LocationExclude: 'LOCATION_EXCLUDE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


