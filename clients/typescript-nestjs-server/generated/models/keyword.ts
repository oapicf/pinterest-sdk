import { MatchType } from './match-type';


export interface Keyword { 
  archived?: boolean;
  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  bid?: number | null;
  /**
   * Keyword ID .
   */
  id: string;
  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   */
  match_type: MatchType | null;
  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   */
  readonly parent_id: string;
  /**
   * Parent entity type (advertiser, campaign, ad group).
   */
  readonly parent_type?: string;
  /**
   * Always keyword
   */
  readonly type?: string;
  /**
   * Keyword value (120 chars max).
   */
  value: string;
}
export namespace Keyword {
}


