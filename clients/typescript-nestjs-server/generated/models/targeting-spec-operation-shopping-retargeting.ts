import { TargetingSpecShoppingRetargeting } from './targeting-spec-shopping-retargeting';


export interface TargetingSpecOperationShoppingRetargeting { 
  field: TargetingSpecOperationShoppingRetargeting.FieldEnum;
  operation: TargetingSpecOperationShoppingRetargeting.OperationEnum;
  values: Array<TargetingSpecShoppingRetargeting>;
}
export namespace TargetingSpecOperationShoppingRetargeting {
  export const FieldEnum = {
    ShoppingRetargeting: 'SHOPPING_RETARGETING'
  } as const;
  export type FieldEnum = typeof FieldEnum[keyof typeof FieldEnum];
  export const OperationEnum = {
    Set: 'SET'
  } as const;
  export type OperationEnum = typeof OperationEnum[keyof typeof OperationEnum];
}


