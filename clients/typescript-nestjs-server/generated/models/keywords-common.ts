import { MatchTypeResponse } from './match-type-response';


export interface KeywordsCommon { 
  /**
   * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  bid?: number | null;
  match_type: MatchTypeResponse | null;
  /**
   * Keyword value (120 chars max).
   */
  value: string;
}
export namespace KeywordsCommon {
}


