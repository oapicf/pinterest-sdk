import {interfaces} from 'inversify';

import { AdAccountsService } from './api/adAccounts.service';
import { BoardsService } from './api/boards.service';
import { CatalogsService } from './api/catalogs.service';
import { MediaService } from './api/media.service';
import { OauthService } from './api/oauth.service';
import { PinsService } from './api/pins.service';
import { UserAccountService } from './api/userAccount.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AdAccountsService>('AdAccountsService').to(AdAccountsService).inSingletonScope();
        container.bind<BoardsService>('BoardsService').to(BoardsService).inSingletonScope();
        container.bind<CatalogsService>('CatalogsService').to(CatalogsService).inSingletonScope();
        container.bind<MediaService>('MediaService').to(MediaService).inSingletonScope();
        container.bind<OauthService>('OauthService').to(OauthService).inSingletonScope();
        container.bind<PinsService>('PinsService').to(PinsService).inSingletonScope();
        container.bind<UserAccountService>('UserAccountService').to(UserAccountService).inSingletonScope();
    }
}
