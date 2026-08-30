import { TopVideoPinsSortBy } from './top-video-pins-sort-by';
import { TopVideoPinsAnalyticsResponseDateAvailability } from './top-video-pins-analytics-response-date-availability';
import { TopVideoPinsAnalyticsResponsePinsItems } from './top-video-pins-analytics-response-pins-items';


export interface TopVideoPinsAnalyticsResponse { 
  date_availability?: TopVideoPinsAnalyticsResponseDateAvailability;
  pins?: Array<TopVideoPinsAnalyticsResponsePinsItems>;
  sort_by?: TopVideoPinsSortBy;
}
export namespace TopVideoPinsAnalyticsResponse {
}


