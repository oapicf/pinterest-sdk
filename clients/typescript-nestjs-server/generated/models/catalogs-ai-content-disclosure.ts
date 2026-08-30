import { CatalogsAiContentDisclosureLabel } from './catalogs-ai-content-disclosure-label';


/**
 * AI content disclosure for a single asset of a catalog item.
 */
export interface CatalogsAiContentDisclosure { 
  /**
   * Disclosure labels that apply to this asset.
   */
  disclosure: Array<CatalogsAiContentDisclosureLabel>;
  /**
   * URL of the asset. Must match one of image_link, additional_image_link, or video_link.
   */
  url: string;
}

