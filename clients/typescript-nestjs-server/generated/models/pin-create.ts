import { AiDisclosures } from './ai-disclosures';
import { PinMediaSource } from './pin-media-source';


/**
 * Resource create operation model.
 */
export interface PinCreate { 
  /**
   * AI disclosure declarations the creator has made about this Pin.
   */
  ai_disclosures?: AiDisclosures;
  alt_text?: string | null;
  /**
   * The board to which this Pin belongs.
   */
  board_id?: string;
  /**
   * The board section to which this Pin belongs.
   */
  board_section_id?: string | null;
  description?: string | null;
  /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   */
  dominant_color?: string | null;
  link?: string | null;
  media_source?: PinMediaSource;
  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   */
  parent_pin_id?: string | null;
  /**
   * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
   */
  sponsor_id?: string | null;
  title?: string | null;
}

