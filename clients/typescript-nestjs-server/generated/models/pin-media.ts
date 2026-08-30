import { PinMediaMetadata } from './pin-media-metadata';
import { PinMediaWithImages } from './pin-media-with-images';
import { ImageSize } from './image-size';
import { PinMediaWithVideo } from './pin-media-with-video';
import { PinMediaWithImageAndVideo } from './pin-media-with-image-and-video';
import { PinMediaWithImage } from './pin-media-with-image';
import { PinMediaWithVideos } from './pin-media-with-videos';


/**
 * Pin media that can be an image, video, or a mix of both.
 */
/**
 * @type PinMedia
 * Pin media that can be an image, video, or a mix of both.
 * @export
 */
export type PinMedia = PinMediaWithImage | PinMediaWithImageAndVideo | PinMediaWithImages | PinMediaWithVideo | PinMediaWithVideos;

