

/**
 * The resource was successfully deleted.
 */
export interface PinterestLibStatus204 { 
  statusCode: PinterestLibStatus204.StatusCodeEnum;
}
export namespace PinterestLibStatus204 {
  export const StatusCodeEnum = {
    NUMBER_204: 204
  } as const;
  export type StatusCodeEnum = typeof StatusCodeEnum[keyof typeof StatusCodeEnum];
}


