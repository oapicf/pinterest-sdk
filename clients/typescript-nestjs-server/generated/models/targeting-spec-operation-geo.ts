import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationGeo { 
  field: TargetingSpecOperationGeo.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationGeo {
  export const FieldEnum = {
    Geo: 'GEO'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


