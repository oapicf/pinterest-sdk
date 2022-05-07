package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticals(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept)
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
                startFuture.fail(readFile.cause());
            }
        });
    }

    public void deployVerticals(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AdAccountsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AdAccountsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AdAccountsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BoardsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BoardsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BoardsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CatalogsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CatalogsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CatalogsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.MediaApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("MediaApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("MediaApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OauthApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OauthApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OauthApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.PinsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("PinsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("PinsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.UserAccountApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("UserAccountApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("UserAccountApiVerticle : Deployment failed");
            }
        });
        
    }
}
