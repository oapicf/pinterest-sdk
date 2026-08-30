import { PinMedia } from './pin-media';
import { BoardOwner } from './board-owner';
import { AiDisclosures } from './ai-disclosures';
import { CreativeType } from './creative-type';


export interface AggregatedPinComment { 
  /**
   * AI disclosure declarations the creator has made about this Pin.
   */
  ai_disclosures?: AiDisclosures;
  alt_text?: string | null;
  /**
   * The board to which this Pin belongs.
   */
  board_id?: string;
  readonly board_owner?: BoardOwner;
  /**
   * The board section to which this Pin belongs.
   */
  board_section_id?: string | null;
  readonly created_at?: string;
  readonly creative_type?: CreativeType | null;
  description?: string | null;
  /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   */
  dominant_color?: string | null;
  /**
   * Whether the Pin has been promoted or not.
   */
  readonly has_been_promoted?: boolean;
  id: string;
  /**
   * Whether the \"operation user_account\" is the Pin owner.
   */
  readonly is_owner?: boolean;
  /**
   * Whether the Pin is a product Pin.
   */
  readonly is_product?: boolean;
  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   */
  readonly is_standard?: boolean;
  link?: string | null;
  readonly media?: PinMedia;
  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   */
  parent_pin_id?: string | null;
  /**
   * Pin metrics with associated time intervals if any.
   */
  readonly pin_metrics?: object | null;
  title?: string | null;
}
export namespace AggregatedPinComment {
}


