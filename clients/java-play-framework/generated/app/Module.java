import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AdAccountsApiControllerImpInterface.class).to(AdAccountsApiControllerImp.class);
        bind(BoardsApiControllerImpInterface.class).to(BoardsApiControllerImp.class);
        bind(CatalogsApiControllerImpInterface.class).to(CatalogsApiControllerImp.class);
        bind(MediaApiControllerImpInterface.class).to(MediaApiControllerImp.class);
        bind(OauthApiControllerImpInterface.class).to(OauthApiControllerImp.class);
        bind(PinsApiControllerImpInterface.class).to(PinsApiControllerImp.class);
        bind(UserAccountApiControllerImpInterface.class).to(UserAccountApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}