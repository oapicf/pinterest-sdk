import { Body, Controller, DefaultValuePipe, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { MediaApi } from '../api';
import { Media, MediaList200Response, MediaUpload, MediaUploadCreate,  } from '../models';

@Controller()
export class MediaApiController {
  constructor(private readonly mediaApi: MediaApi) {}

  @Post('/media')
  mediaCreate(@Body() mediaUploadCreate: MediaUploadCreate, @Req() request: Request): MediaUpload | Promise<MediaUpload> | Observable<MediaUpload> {
    return this.mediaApi.mediaCreate(mediaUploadCreate, request);
  }

  @Get('/media/:media_id')
  mediaGet(@Param('media_id') mediaId: string, @Req() request: Request): Media | Promise<Media> | Observable<Media> {
    return this.mediaApi.mediaGet(mediaId, request);
  }

  @Get('/media')
  mediaList(@Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): MediaList200Response | Promise<MediaList200Response> | Observable<MediaList200Response> {
    return this.mediaApi.mediaList(bookmark, pageSize, request);
  }

} 