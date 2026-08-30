import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationInterest { 
  field: TargetingSpecOperationInterest.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationInterest {
  export const FieldEnum = {
    Interest: 'INTEREST'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


