import { Schedule } from './schedule';


export interface SchedulesList200Response { 
  bookmark?: string | null;
  items: Array<Schedule>;
}

