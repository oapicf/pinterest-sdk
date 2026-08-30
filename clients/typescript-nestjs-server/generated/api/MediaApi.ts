import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Media, MediaList200Response, MediaUpload, MediaUploadCreate,  } from '../models';


@Injectable()
export abstract class MediaApi {

  abstract mediaCreate(mediaUploadCreate: MediaUploadCreate,  request: Request): MediaUpload | Promise<MediaUpload> | Observable<MediaUpload>;


  abstract mediaGet(mediaId: string,  request: Request): Media | Promise<Media> | Observable<Media>;


  abstract mediaList(bookmark: string | undefined, pageSize: number | undefined,  request: Request): MediaList200Response | Promise<MediaList200Response> | Observable<MediaList200Response>;

} 