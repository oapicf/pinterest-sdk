import { SummaryStatus } from './summary-status';
import { ConversionObjectiveType } from './conversion-objective-type';


export interface BulkDownloadCampaignFilter { 
  campaign_status?: Array<SummaryStatus>;
  /**
   * Unix UTC timestamp.
   */
  end_time?: string;
  /**
   * Campaign name
   */
  name?: string;
  objective_type?: Array<ConversionObjectiveType>;
  /**
   * Unix UTC timestamp.
   */
  start_time?: string;
}

