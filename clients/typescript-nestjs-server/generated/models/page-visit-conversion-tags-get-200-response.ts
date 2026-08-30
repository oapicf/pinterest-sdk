import { ConversionEventResponse } from './conversion-event-response';


export interface PageVisitConversionTagsGet200Response { 
  bookmark?: string | null;
  items: Array<ConversionEventResponse>;
}

