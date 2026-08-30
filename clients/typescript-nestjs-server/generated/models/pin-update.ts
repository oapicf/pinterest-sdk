import { CarouselSlot } from './carousel-slot';
import { AiDisclosuresUpdate } from './ai-disclosures-update';


/**
 * Resource create or update operation model.
 */
export interface PinUpdate { 
  /**
   * AI disclosure declarations the creator has made about this Pin.
   */
  ai_disclosures?: AiDisclosuresUpdate;
  alt_text?: string | null;
  /**
   * The board to which this Pin belongs.
   */
  board_id?: string;
  /**
   * The board section to which this Pin belongs.
   */
  board_section_id?: string | null;
  /**
   * Carousel Pin slots data.
   */
  carousel_slots?: Array<CarouselSlot>;
  description?: string | null;
  link?: string | null;
  title?: string | null;
}

