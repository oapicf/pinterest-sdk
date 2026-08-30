import { RelatedTermsRelatedTermsListItems } from './related-terms-related-terms-list-items';


export interface RelatedTerms { 
  /**
   * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
   */
  id?: string;
  /**
   * Total number of related terms returned
   */
  related_term_count?: number;
  /**
   * The id of the advertiser.
   */
  related_terms_list?: Array<RelatedTermsRelatedTermsListItems>;
}

