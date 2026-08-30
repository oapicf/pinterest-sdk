import { MatchType } from './match-type';


export interface KeywordCreateItem { 
  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  bid?: number | null;
  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   */
  match_type: MatchType | null;
  /**
   * Keyword value (120 chars max).
   */
  value: string;
}
export namespace KeywordCreateItem {
}


