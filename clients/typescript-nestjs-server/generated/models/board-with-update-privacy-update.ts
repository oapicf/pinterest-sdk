import { BoardUpdatePrivacy } from './board-update-privacy';


/**
 * Resource create or update operation model.
 */
export interface BoardWithUpdatePrivacyUpdate { 
  description?: string | null;
  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   */
  name?: string;
  privacy?: BoardUpdatePrivacy;
}
export namespace BoardWithUpdatePrivacyUpdate {
}


