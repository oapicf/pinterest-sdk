import { Body, Controller, DefaultValuePipe, Delete, Get, Patch, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { BoardsApi } from '../api';
import { Board, BoardCreate, BoardPrivacyFilter, BoardSection, BoardSectionCreate, BoardSectionUpdateWithRequiredBody, BoardSectionsList200Response, BoardWithUpdatePrivacy, BoardWithUpdatePrivacyUpdate, BoardsList200Response, BoardsListPins200Response, CreativeType,  } from '../models';

@Controller()
export class BoardsApiController {
  constructor(private readonly boardsApi: BoardsApi) {}

  @Post('/boards/:board_id/sections')
  boardSectionsCreate(@Param('board_id') boardId: string, @Body() boardSectionCreate: BoardSectionCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection> {
    return this.boardsApi.boardSectionsCreate(boardId, boardSectionCreate, adAccountId, request);
  }

  @Delete('/boards/:board_id/sections/:section_id')
  boardSectionsDelete(@Param('board_id') boardId: string, @Param('section_id') sectionId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection> {
    return this.boardsApi.boardSectionsDelete(boardId, sectionId, adAccountId, request);
  }

  @Get('/boards/:board_id/sections')
  boardSectionsList(@Param('board_id') boardId: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardSectionsList200Response | Promise<BoardSectionsList200Response> | Observable<BoardSectionsList200Response> {
    return this.boardsApi.boardSectionsList(boardId, adAccountId, bookmark, pageSize, request);
  }

  @Get('/boards/:board_id/sections/:section_id/pins')
  boardSectionsListPins(@Param('board_id') boardId: string, @Param('section_id') sectionId: string, @Query('ad_account_id') adAccountId: string | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardsListPins200Response | Promise<BoardsListPins200Response> | Observable<BoardsListPins200Response> {
    return this.boardsApi.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize, request);
  }

  @Patch('/boards/:board_id/sections/:section_id')
  boardSectionsUpdate(@Param('board_id') boardId: string, @Param('section_id') sectionId: string, @Body() boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection> {
    return this.boardsApi.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId, request);
  }

  @Post('/boards')
  boardsCreate(@Body() boardCreate: BoardCreate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Board | Promise<Board> | Observable<Board> {
    return this.boardsApi.boardsCreate(boardCreate, adAccountId, request);
  }

  @Delete('/boards/:board_id')
  boardsDelete(@Param('board_id') boardId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Board | Promise<Board> | Observable<Board> {
    return this.boardsApi.boardsDelete(boardId, adAccountId, request);
  }

  @Get('/boards/:board_id')
  boardsGet(@Param('board_id') boardId: string, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): Board | Promise<Board> | Observable<Board> {
    return this.boardsApi.boardsGet(boardId, adAccountId, request);
  }

  @Get('/boards')
  boardsList(@Query('ad_account_id') adAccountId: string | undefined, @Query('privacy') privacy: BoardPrivacyFilter | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response> {
    return this.boardsApi.boardsList(adAccountId, privacy, bookmark, pageSize, request);
  }

  @Get('/boards/:board_id/pins')
  boardsListPins(@Param('board_id') boardId: string, @Query('creative_types') creativeTypes: Array<CreativeType> | undefined, @Query('ad_account_id') adAccountId: string | undefined, @Query('pin_metrics', new DefaultValuePipe(false)) pinMetrics: boolean | undefined, @Query('bookmark') bookmark: string | undefined, @Query('page_size', new DefaultValuePipe(25)) pageSize: number | undefined, @Req() request: Request): BoardsListPins200Response | Promise<BoardsListPins200Response> | Observable<BoardsListPins200Response> {
    return this.boardsApi.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize, request);
  }

  @Patch('/boards/:board_id')
  boardsUpdate(@Param('board_id') boardId: string, @Body() boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, @Query('ad_account_id') adAccountId: string | undefined, @Req() request: Request): BoardWithUpdatePrivacy | Promise<BoardWithUpdatePrivacy> | Observable<BoardWithUpdatePrivacy> {
    return this.boardsApi.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId, request);
  }

} 