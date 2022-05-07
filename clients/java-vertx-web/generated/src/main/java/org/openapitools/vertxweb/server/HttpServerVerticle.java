package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.AdAccountsApiHandler;
import org.openapitools.vertxweb.server.api.AdAccountsApiImpl;
import org.openapitools.vertxweb.server.api.BoardsApiHandler;
import org.openapitools.vertxweb.server.api.BoardsApiImpl;
import org.openapitools.vertxweb.server.api.CatalogsApiHandler;
import org.openapitools.vertxweb.server.api.CatalogsApiImpl;
import org.openapitools.vertxweb.server.api.MediaApiHandler;
import org.openapitools.vertxweb.server.api.MediaApiImpl;
import org.openapitools.vertxweb.server.api.OauthApiHandler;
import org.openapitools.vertxweb.server.api.OauthApiImpl;
import org.openapitools.vertxweb.server.api.PinsApiHandler;
import org.openapitools.vertxweb.server.api.PinsApiImpl;
import org.openapitools.vertxweb.server.api.UserAccountApiHandler;
import org.openapitools.vertxweb.server.api.UserAccountApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AdAccountsApiHandler adAccountsHandler = new AdAccountsApiHandler(new AdAccountsApiImpl());
    private final BoardsApiHandler boardsHandler = new BoardsApiHandler(new BoardsApiImpl());
    private final CatalogsApiHandler catalogsHandler = new CatalogsApiHandler(new CatalogsApiImpl());
    private final MediaApiHandler mediaHandler = new MediaApiHandler(new MediaApiImpl());
    private final OauthApiHandler oauthHandler = new OauthApiHandler(new OauthApiImpl());
    private final PinsApiHandler pinsHandler = new PinsApiHandler(new PinsApiImpl());
    private final UserAccountApiHandler userAccountHandler = new UserAccountApiHandler(new UserAccountApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              adAccountsHandler.mount(builder);
              boardsHandler.mount(builder);
              catalogsHandler.mount(builder);
              mediaHandler.mount(builder);
              oauthHandler.mount(builder);
              pinsHandler.mount(builder);
              userAccountHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
