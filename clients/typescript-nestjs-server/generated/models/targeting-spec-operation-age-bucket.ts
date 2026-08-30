import { TargetingSpecAgeBucket } from './targeting-spec-age-bucket';


export interface TargetingSpecOperationAgeBucket { 
  field: TargetingSpecOperationAgeBucket.FieldEnum;
  operation: TargetingSpecOperationAgeBucket.OperationEnum;
  values: Array<TargetingSpecAgeBucket>;
}
export namespace TargetingSpecOperationAgeBucket {
  export const FieldEnum = {
    AgeBucket: 'AGE_BUCKET'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
  export const OperationEnum = {
    Set: 'SET'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


