import { PinMedia } from './pin-media';


/**
 * Summarized pin information
 */
export interface SummaryPin { 
  alt_text?: string | null;
  description?: string | null;
  id: string;
  link?: string | null;
  readonly media?: PinMedia;
  title?: string | null;
}

