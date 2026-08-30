import { PinMediaSourceImagesBase64 } from './pin-media-source-images-base64';
import { PinMediaSourceImageBase64 } from './pin-media-source-image-base64';
import { ContentType } from './content-type';
import { PinMediaSourceVideoID } from './pin-media-source-video-id';
import { PinMediaSourceImagesURL } from './pin-media-source-images-url';
import { PinMediaSourceImageURL } from './pin-media-source-image-url';
import { PinMediaSourceImagesURLItem } from './pin-media-source-images-url-item';
import { PinMediaSourcePinURL } from './pin-media-source-pin-url';


/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
/**
 * @type PinMediaSource
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 * @export
 */
export type PinMediaSource = PinMediaSourceImageBase64 | PinMediaSourceImageURL | PinMediaSourceImagesBase64 | PinMediaSourceImagesURL | PinMediaSourcePinURL | PinMediaSourceVideoID;

