import { TargetingSpecListOperation } from './targeting-spec-list-operation';
import { TargetingSpecGender } from './targeting-spec-gender';


export interface TargetingSpecOperationGender { 
  field: TargetingSpecOperationGender.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<TargetingSpecGender>;
}
export namespace TargetingSpecOperationGender {
  export const FieldEnum = {
    Gender: 'GENDER'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


