import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationLocale { 
  field: TargetingSpecOperationLocale.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationLocale {
  export const FieldEnum = {
    Locale: 'LOCALE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


