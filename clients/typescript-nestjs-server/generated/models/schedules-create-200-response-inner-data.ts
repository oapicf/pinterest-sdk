import { PinterestLibError } from './pinterest-lib-error';
import { ScheduleType } from './schedule-type';
import { ScheduleAction } from './schedule-action';
import { ScheduleDeltaValue } from './schedule-delta-value';
import { AdAccountEntityType } from './ad-account-entity-type';
import { SchedulesCreate200ResponseInnerDataOneOf } from './schedules-create200-response-inner-data-one-of';
import { Schedule } from './schedule';
import { ScheduleStatus } from './schedule-status';


/**
 * Created/updated resource on success or error details on failure
 */
/**
 * @type SchedulesCreate200ResponseInnerData
 * Created/updated resource on success or error details on failure
 * @export
 */
export type SchedulesCreate200ResponseInnerData = Schedule | SchedulesCreate200ResponseInnerDataOneOf;

