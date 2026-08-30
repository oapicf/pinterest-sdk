import { AudienceSubcategory } from './audience-subcategory';


export interface AudienceCategory { 
  /**
   * Interest ID.
   */
  id?: string;
  /**
   * Interest affinity index.
   */
  index?: number;
  /**
   * Interest unique key (same as ID).
   */
  key?: string;
  /**
   * Interest name.
   */
  name?: string;
  /**
   * Interest\'s percent of category\'s total audience.
   */
  ratio?: number;
  /**
   * Subcategory interest distribution
   */
  subcategories?: Array<AudienceSubcategory>;
}

