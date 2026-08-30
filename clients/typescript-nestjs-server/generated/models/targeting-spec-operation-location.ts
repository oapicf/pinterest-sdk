import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationLocation { 
  field: TargetingSpecOperationLocation.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationLocation {
  export const FieldEnum = {
    Location: 'LOCATION'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


