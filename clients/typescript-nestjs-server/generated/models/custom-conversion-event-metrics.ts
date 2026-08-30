import { AdeColumnType } from './ade-column-type';


export interface CustomConversionEventMetrics { 
  custom_event_metrics_type: AdeColumnType;
  /**
   * Name of the advertiser-defined custom conversion event
   */
  custom_event_name: string;
}
export namespace CustomConversionEventMetrics {
}


