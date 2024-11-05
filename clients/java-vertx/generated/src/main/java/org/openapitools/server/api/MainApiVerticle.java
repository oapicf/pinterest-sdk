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
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AdGroupsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AdGroupsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AdGroupsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AdsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AdsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AdsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AdvancedAuctionApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AdvancedAuctionApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AdvancedAuctionApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AudienceInsightsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AudienceInsightsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AudienceInsightsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AudienceSharingApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AudienceSharingApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AudienceSharingApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AudiencesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AudiencesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AudiencesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BillingApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BillingApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BillingApiVerticle : Deployment failed");
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
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BulkApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BulkApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BulkApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BusinessAccessAssetsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BusinessAccessAssetsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BusinessAccessAssetsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BusinessAccessInviteApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BusinessAccessInviteApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BusinessAccessInviteApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.BusinessAccessRelationshipsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("BusinessAccessRelationshipsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("BusinessAccessRelationshipsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CampaignsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CampaignsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CampaignsApiVerticle : Deployment failed");
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
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ConversionEventsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ConversionEventsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ConversionEventsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ConversionTagsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ConversionTagsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ConversionTagsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CustomerListsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CustomerListsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CustomerListsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.IntegrationsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("IntegrationsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("IntegrationsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.KeywordsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("KeywordsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("KeywordsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LeadAdsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LeadAdsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LeadAdsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LeadFormsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LeadFormsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LeadFormsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.LeadsExportApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("LeadsExportApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("LeadsExportApiVerticle : Deployment failed");
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
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.OrderLinesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("OrderLinesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("OrderLinesApiVerticle : Deployment failed");
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
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ProductGroupPromotionsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ProductGroupPromotionsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ProductGroupPromotionsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ResourcesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ResourcesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ResourcesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.SearchApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("SearchApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("SearchApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TargetingTemplateApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TargetingTemplateApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TargetingTemplateApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TermsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TermsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TermsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.TermsOfServiceApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("TermsOfServiceApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("TermsOfServiceApiVerticle : Deployment failed");
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
