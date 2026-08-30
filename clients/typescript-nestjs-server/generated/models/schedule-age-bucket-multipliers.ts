

/**
 * This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
export interface ScheduleAgeBucketMultipliers { 
  [key: string]: number | any;


  AGE_BUCKET?: ScheduleAgeBucketMultipliers.AGEBUCKETEnum;
}
export namespace ScheduleAgeBucketMultipliers {
  export const AGEBUCKETEnum = {
    _1824: '18-24',
    _2534: '25-34',
    _3544: '35-44',
    _4549: '45-49',
    _5054: '50-54',
    _5564: '55-64',
    _65: '65+'
  } as const;
  export type AGEBUCKETEnum = typeof AGEBUCKETEnum[keyof typeof AGEBUCKETEnum];
}


