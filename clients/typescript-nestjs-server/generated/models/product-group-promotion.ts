import { ProductGroupPromotionCustomizableCTAType } from './product-group-promotion-customizable-cta-type';
import { PreferredMediaType } from './preferred-media-type';
import { EntityStatus } from './entity-status';
import { GridClickType } from './grid-click-type';
import { CreativeType } from './creative-type';
import { CollectionsHeaderType } from './collections-header-type';


export interface ProductGroupPromotion { 
  /**
   * ID of the ad group the product group belongs to.
   */
  ad_group_id?: string;
  /**
   * The bid in micro currency.
   */
  bid_in_micro_currency?: number;
  /**
   * ID of the catalogs product group that this product group promotion references (required for create operations)
   */
  catalog_product_group_id?: string;
  /**
   * Catalogs product group name
   */
  catalog_product_group_name?: string;
  collections_header_type?: CollectionsHeaderType | null;
  /**
   * Collections Hero Destination Url
   */
  collections_hero_destination_url?: string | null;
  /**
   * Hero Pin ID if this PG is promoted as a Collection
   */
  collections_hero_pin_id?: string | null;
  creative_type?: CreativeType;
  customizable_cta_type?: ProductGroupPromotionCustomizableCTAType;
  /**
   * The full product group definition path
   */
  definition?: string;
  grid_click_type?: GridClickType | null;
  /**
   * ID of the product group promotion (required for update operations).
   */
  id?: string;
  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   */
  included?: boolean;
  /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   */
  is_generate_background?: boolean | null;
  /**
   * Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
   */
  is_image_auto_resizing?: boolean | null;
  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   */
  is_mdl?: boolean;
  /**
   * The parent Product Group ID of this Product Group
   */
  parent_id?: string;
  preferred_media_type?: PreferredMediaType | null;
  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   */
  relative_definition?: string;
  /**
   * The ad image tag selected for the product group promotion.
   */
  selected_image_tag?: string | null;
  /**
   * The ad video tag selected for the product group promotion.
   */
  selected_video_tag?: string | null;
  /**
   * Slideshow Collections Description
   */
  slideshow_collections_description?: string | null;
  /**
   * Slideshow Collections Title
   */
  slideshow_collections_title?: string | null;
  status?: EntityStatus;
  /**
   * Tracking template for proudct group promotions. 4000 limit
   */
  tracking_url?: string;
}
export namespace ProductGroupPromotion {
}


