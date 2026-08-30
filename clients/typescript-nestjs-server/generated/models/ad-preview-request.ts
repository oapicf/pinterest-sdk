import { AdPreviewShopping } from './ad-preview-shopping';
import { AdPreviewSourcePinId } from './ad-preview-source-pin-id';
import { BasePreferredMediaType } from './base-preferred-media-type';
import { AdPreviewSourceImage } from './ad-preview-source-image';
import { CustomizableCTAType } from './customizable-cta-type';
import { AdShoppingPreviewCreativeType } from './ad-shopping-preview-creative-type';


/**
 * @type AdPreviewRequest
 * @export
 */
export type AdPreviewRequest = AdPreviewShopping | AdPreviewSourceImage | AdPreviewSourcePinId;

