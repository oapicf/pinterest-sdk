

export interface TargetingSpecOperationMaximumAge { 
  field: TargetingSpecOperationMaximumAge.FieldEnum;
  operation: TargetingSpecOperationMaximumAge.OperationEnum;
  value: string | null;
}
export namespace TargetingSpecOperationMaximumAge {
  export const FieldEnum = {
    MaximumAge: 'MAXIMUM_AGE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
  export const OperationEnum = {
    Set: 'SET'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


