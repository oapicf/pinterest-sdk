import { VideoMetadataWithItemType } from './video-metadata-with-item-type';
import { ImageSize } from './image-size';
import { ImageMetadata } from './image-metadata';


/**
 * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
 */
/**
 * @type PinMediaMetadata
 * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
 * @export
 */
export type PinMediaMetadata = ImageMetadata | VideoMetadataWithItemType;

