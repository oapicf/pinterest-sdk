import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Board, BoardCreate, BoardPrivacyFilter, BoardSection, BoardSectionCreate, BoardSectionUpdateWithRequiredBody, BoardSectionsList200Response, BoardWithUpdatePrivacy, BoardWithUpdatePrivacyUpdate, BoardsList200Response, BoardsListPins200Response, CreativeType,  } from '../models';


@Injectable()
export abstract class BoardsApi {

  abstract boardSectionsCreate(boardId: string, boardSectionCreate: BoardSectionCreate, adAccountId: string | undefined,  request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection>;


  abstract boardSectionsDelete(boardId: string, sectionId: string, adAccountId: string | undefined,  request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection>;


  abstract boardSectionsList(boardId: string, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardSectionsList200Response | Promise<BoardSectionsList200Response> | Observable<BoardSectionsList200Response>;


  abstract boardSectionsListPins(boardId: string, sectionId: string, adAccountId: string | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardsListPins200Response | Promise<BoardsListPins200Response> | Observable<BoardsListPins200Response>;


  abstract boardSectionsUpdate(boardId: string, sectionId: string, boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, adAccountId: string | undefined,  request: Request): BoardSection | Promise<BoardSection> | Observable<BoardSection>;


  abstract boardsCreate(boardCreate: BoardCreate, adAccountId: string | undefined,  request: Request): Board | Promise<Board> | Observable<Board>;


  abstract boardsDelete(boardId: string, adAccountId: string | undefined,  request: Request): Board | Promise<Board> | Observable<Board>;


  abstract boardsGet(boardId: string, adAccountId: string | undefined,  request: Request): Board | Promise<Board> | Observable<Board>;


  abstract boardsList(adAccountId: string | undefined, privacy: BoardPrivacyFilter | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardsList200Response | Promise<BoardsList200Response> | Observable<BoardsList200Response>;


  abstract boardsListPins(boardId: string, creativeTypes: Array<CreativeType> | undefined, adAccountId: string | undefined, pinMetrics: boolean | undefined, bookmark: string | undefined, pageSize: number | undefined,  request: Request): BoardsListPins200Response | Promise<BoardsListPins200Response> | Observable<BoardsListPins200Response>;


  abstract boardsUpdate(boardId: string, boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, adAccountId: string | undefined,  request: Request): BoardWithUpdatePrivacy | Promise<BoardWithUpdatePrivacy> | Observable<BoardWithUpdatePrivacy>;

} 