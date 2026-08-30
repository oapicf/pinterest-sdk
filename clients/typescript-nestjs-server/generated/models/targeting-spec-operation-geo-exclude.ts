import { TargetingSpecListOperation } from './targeting-spec-list-operation';


export interface TargetingSpecOperationGeoExclude { 
  field: TargetingSpecOperationGeoExclude.FieldEnum;
  operation: TargetingSpecListOperation;
  values: Array<string>;
}
export namespace TargetingSpecOperationGeoExclude {
  export const FieldEnum = {
    GeoExclude: 'GEO_EXCLUDE'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
}


