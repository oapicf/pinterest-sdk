import { TargetingSpecListOperation } from './targeting-spec-list-operation';
import { TargetingSpecAppType } from './targeting-spec-app-type';


export interface TargetingSpecOperationAppType { 
  field: TargetingSpecOperationAppType.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<TargetingSpecAppType>;
}
export namespace TargetingSpecOperationAppType {
  export const FieldEnum = {
    Apptype: 'APPTYPE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


