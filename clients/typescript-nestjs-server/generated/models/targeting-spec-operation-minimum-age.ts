

export interface TargetingSpecOperationMinimumAge { 
  field: TargetingSpecOperationMinimumAge.FieldEnum;
  operation: TargetingSpecOperationMinimumAge.OperationEnum;
  value: string | null;
}
export namespace TargetingSpecOperationMinimumAge {
  export const FieldEnum = {
    MinimumAge: 'MINIMUM_AGE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
  export const OperationEnum = {
    Set: 'SET'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


