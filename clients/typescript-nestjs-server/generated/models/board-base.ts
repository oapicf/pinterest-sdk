import { BoardOwner } from './board-owner';
import { BoardMedia } from './board-media';


export interface BoardBase { 
  /**
   * Date and time of last board pins modified.
   */
  readonly board_pins_modified_at?: string;
  /**
   * Count of collaborators on the board.
   */
  readonly collaborator_count?: number;
  /**
   * Date and time of board creation.
   */
  readonly created_at?: string;
  description?: string | null;
  /**
   * Board follower count.
   */
  readonly follower_count?: number;
  readonly id: string;
  /**
   * If set to `true`, the board will be ad-only and can store ad-only Pins.
   */
  is_ads_only?: boolean;
  /**
   * Board media.
   */
  readonly media?: BoardMedia;
  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   */
  name: string;
  readonly owner?: BoardOwner;
  /**
   * Count of Pins on the board.
   */
  readonly pin_count?: number;
}

