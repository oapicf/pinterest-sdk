import { ScheduleType } from './schedule-type';
import { ScheduleAction } from './schedule-action';
import { ScheduleDeltaValue } from './schedule-delta-value';
import { AdAccountEntityType } from './ad-account-entity-type';
import { ScheduleStatus } from './schedule-status';


export interface Schedule { 
  delta_value?: ScheduleDeltaValue;
  /**
   * Schedule end time. Unix timestamp in seconds.
   */
  end_timestamp?: number;
  /**
   * entity ID.
   */
  entity_id: string;
  /**
   * Specify the entity_type to get summary information
   */
  entity_type?: AdAccountEntityType;
  /**
   * Schedule name.
   */
  name?: string;
  /**
   * The schedule action.
   */
  schedule_action?: ScheduleAction;
  /**
   * Schedule ID.
   */
  readonly schedule_id: string;
  /**
   * Schedule status.
   */
  schedule_status?: ScheduleStatus;
  /**
   * The schedule type.
   */
  schedule_type?: ScheduleType;
  /**
   * Schedule start time. Unix timestamp in seconds.
   */
  start_timestamp?: number;
}
export namespace Schedule {
}


