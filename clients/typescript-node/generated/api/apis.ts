export * from './adAccountsApi';
import { AdAccountsApi } from './adAccountsApi';
export * from './boardsApi';
import { BoardsApi } from './boardsApi';
export * from './catalogsApi';
import { CatalogsApi } from './catalogsApi';
export * from './mediaApi';
import { MediaApi } from './mediaApi';
export * from './oauthApi';
import { OauthApi } from './oauthApi';
export * from './pinsApi';
import { PinsApi } from './pinsApi';
export * from './userAccountApi';
import { UserAccountApi } from './userAccountApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AdAccountsApi, BoardsApi, CatalogsApi, MediaApi, OauthApi, PinsApi, UserAccountApi];
