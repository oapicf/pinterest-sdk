import { DynamicModule, HttpService, HttpModule, Module, Global } from '@nestjs/common';
import { Configuration } from './configuration';

import { AdAccountsService } from './api/adAccounts.service';
import { BoardsService } from './api/boards.service';
import { CatalogsService } from './api/catalogs.service';
import { MediaService } from './api/media.service';
import { OauthService } from './api/oauth.service';
import { PinsService } from './api/pins.service';
import { UserAccountService } from './api/userAccount.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AdAccountsService,
    BoardsService,
    CatalogsService,
    MediaService,
    OauthService,
    PinsService,
    UserAccountService
  ],
  providers: [
    AdAccountsService,
    BoardsService,
    CatalogsService,
    MediaService,
    OauthService,
    PinsService,
    UserAccountService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( httpService: HttpService) { }
}
