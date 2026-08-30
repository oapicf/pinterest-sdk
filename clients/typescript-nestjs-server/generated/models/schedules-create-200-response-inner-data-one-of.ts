import { PinterestLibError } from './pinterest-lib-error';


export interface SchedulesCreate200ResponseInnerDataOneOf { 
  id: string;
  /**
   * Schedule ID.
   */
  schedule_id: string;
  exceptions: PinterestLibError;
}

