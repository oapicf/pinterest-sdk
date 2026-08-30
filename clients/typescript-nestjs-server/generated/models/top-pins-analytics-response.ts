import { TopPinsSortBy } from './top-pins-sort-by';
import { TopPinsAnalyticsResponseDateAvailability } from './top-pins-analytics-response-date-availability';
import { TopPinsAnalyticsResponsePinsItems } from './top-pins-analytics-response-pins-items';


export interface TopPinsAnalyticsResponse { 
  date_availability?: TopPinsAnalyticsResponseDateAvailability;
  pins?: Array<TopPinsAnalyticsResponsePinsItems>;
  sort_by?: TopPinsSortBy;
}
export namespace TopPinsAnalyticsResponse {
}


