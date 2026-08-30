import { MatchType } from './match-type';


export interface TargetingTemplateKeyword { 
  match_type?: MatchType;
  /**
   * The keyword targeting (120 chars max).
   */
  value?: string;
}
export namespace TargetingTemplateKeyword {
}


