import { ScheduleCommonDeltaValue } from './schedule-common-delta-value';
import { ScheduleType } from './schedule-type';
import { ScheduleAction } from './schedule-action';
import { ScheduleStatus } from './schedule-status';


export interface ScheduleUpdateRequest { 
  entity_id?: string;
  /**
   * Entity type
   */
  entity_type?: string;
  /**
   * Schedule ID.
   */
  id: string;
  delta_value?: ScheduleCommonDeltaValue;
  /**
   * Schedule end time. Unix timestamp in seconds.
   */
  end_timestamp?: number;
  name?: string;
  schedule_action?: ScheduleAction;
  schedule_status?: ScheduleStatus;
  schedule_type?: ScheduleType;
  /**
   * Schedule start time. Unix timestamp in seconds.
   */
  start_timestamp?: number;
}
export namespace ScheduleUpdateRequest {
}


