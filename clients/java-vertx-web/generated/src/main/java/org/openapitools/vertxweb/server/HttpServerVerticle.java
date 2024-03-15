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
import org.openapitools.vertxweb.server.api.AdGroupsApiHandler;
import org.openapitools.vertxweb.server.api.AdGroupsApiImpl;
import org.openapitools.vertxweb.server.api.AdsApiHandler;
import org.openapitools.vertxweb.server.api.AdsApiImpl;
import org.openapitools.vertxweb.server.api.AudienceInsightsApiHandler;
import org.openapitools.vertxweb.server.api.AudienceInsightsApiImpl;
import org.openapitools.vertxweb.server.api.AudiencesApiHandler;
import org.openapitools.vertxweb.server.api.AudiencesApiImpl;
import org.openapitools.vertxweb.server.api.BillingApiHandler;
import org.openapitools.vertxweb.server.api.BillingApiImpl;
import org.openapitools.vertxweb.server.api.BoardsApiHandler;
import org.openapitools.vertxweb.server.api.BoardsApiImpl;
import org.openapitools.vertxweb.server.api.BulkApiHandler;
import org.openapitools.vertxweb.server.api.BulkApiImpl;
import org.openapitools.vertxweb.server.api.CampaignsApiHandler;
import org.openapitools.vertxweb.server.api.CampaignsApiImpl;
import org.openapitools.vertxweb.server.api.CatalogsApiHandler;
import org.openapitools.vertxweb.server.api.CatalogsApiImpl;
import org.openapitools.vertxweb.server.api.ConversionEventsApiHandler;
import org.openapitools.vertxweb.server.api.ConversionEventsApiImpl;
import org.openapitools.vertxweb.server.api.ConversionTagsApiHandler;
import org.openapitools.vertxweb.server.api.ConversionTagsApiImpl;
import org.openapitools.vertxweb.server.api.CustomerListsApiHandler;
import org.openapitools.vertxweb.server.api.CustomerListsApiImpl;
import org.openapitools.vertxweb.server.api.IntegrationsApiHandler;
import org.openapitools.vertxweb.server.api.IntegrationsApiImpl;
import org.openapitools.vertxweb.server.api.KeywordsApiHandler;
import org.openapitools.vertxweb.server.api.KeywordsApiImpl;
import org.openapitools.vertxweb.server.api.LeadAdsApiHandler;
import org.openapitools.vertxweb.server.api.LeadAdsApiImpl;
import org.openapitools.vertxweb.server.api.LeadFormsApiHandler;
import org.openapitools.vertxweb.server.api.LeadFormsApiImpl;
import org.openapitools.vertxweb.server.api.MediaApiHandler;
import org.openapitools.vertxweb.server.api.MediaApiImpl;
import org.openapitools.vertxweb.server.api.OauthApiHandler;
import org.openapitools.vertxweb.server.api.OauthApiImpl;
import org.openapitools.vertxweb.server.api.OrderLinesApiHandler;
import org.openapitools.vertxweb.server.api.OrderLinesApiImpl;
import org.openapitools.vertxweb.server.api.PinsApiHandler;
import org.openapitools.vertxweb.server.api.PinsApiImpl;
import org.openapitools.vertxweb.server.api.ProductGroupPromotionsApiHandler;
import org.openapitools.vertxweb.server.api.ProductGroupPromotionsApiImpl;
import org.openapitools.vertxweb.server.api.ProductGroupsApiHandler;
import org.openapitools.vertxweb.server.api.ProductGroupsApiImpl;
import org.openapitools.vertxweb.server.api.ResourcesApiHandler;
import org.openapitools.vertxweb.server.api.ResourcesApiImpl;
import org.openapitools.vertxweb.server.api.SearchApiHandler;
import org.openapitools.vertxweb.server.api.SearchApiImpl;
import org.openapitools.vertxweb.server.api.TermsApiHandler;
import org.openapitools.vertxweb.server.api.TermsApiImpl;
import org.openapitools.vertxweb.server.api.TermsOfServiceApiHandler;
import org.openapitools.vertxweb.server.api.TermsOfServiceApiImpl;
import org.openapitools.vertxweb.server.api.UserAccountApiHandler;
import org.openapitools.vertxweb.server.api.UserAccountApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AdAccountsApiHandler adAccountsHandler = new AdAccountsApiHandler(new AdAccountsApiImpl());
    private final AdGroupsApiHandler adGroupsHandler = new AdGroupsApiHandler(new AdGroupsApiImpl());
    private final AdsApiHandler adsHandler = new AdsApiHandler(new AdsApiImpl());
    private final AudienceInsightsApiHandler audienceInsightsHandler = new AudienceInsightsApiHandler(new AudienceInsightsApiImpl());
    private final AudiencesApiHandler audiencesHandler = new AudiencesApiHandler(new AudiencesApiImpl());
    private final BillingApiHandler billingHandler = new BillingApiHandler(new BillingApiImpl());
    private final BoardsApiHandler boardsHandler = new BoardsApiHandler(new BoardsApiImpl());
    private final BulkApiHandler bulkHandler = new BulkApiHandler(new BulkApiImpl());
    private final CampaignsApiHandler campaignsHandler = new CampaignsApiHandler(new CampaignsApiImpl());
    private final CatalogsApiHandler catalogsHandler = new CatalogsApiHandler(new CatalogsApiImpl());
    private final ConversionEventsApiHandler conversionEventsHandler = new ConversionEventsApiHandler(new ConversionEventsApiImpl());
    private final ConversionTagsApiHandler conversionTagsHandler = new ConversionTagsApiHandler(new ConversionTagsApiImpl());
    private final CustomerListsApiHandler customerListsHandler = new CustomerListsApiHandler(new CustomerListsApiImpl());
    private final IntegrationsApiHandler integrationsHandler = new IntegrationsApiHandler(new IntegrationsApiImpl());
    private final KeywordsApiHandler keywordsHandler = new KeywordsApiHandler(new KeywordsApiImpl());
    private final LeadAdsApiHandler leadAdsHandler = new LeadAdsApiHandler(new LeadAdsApiImpl());
    private final LeadFormsApiHandler leadFormsHandler = new LeadFormsApiHandler(new LeadFormsApiImpl());
    private final MediaApiHandler mediaHandler = new MediaApiHandler(new MediaApiImpl());
    private final OauthApiHandler oauthHandler = new OauthApiHandler(new OauthApiImpl());
    private final OrderLinesApiHandler orderLinesHandler = new OrderLinesApiHandler(new OrderLinesApiImpl());
    private final PinsApiHandler pinsHandler = new PinsApiHandler(new PinsApiImpl());
    private final ProductGroupPromotionsApiHandler productGroupPromotionsHandler = new ProductGroupPromotionsApiHandler(new ProductGroupPromotionsApiImpl());
    private final ProductGroupsApiHandler productGroupsHandler = new ProductGroupsApiHandler(new ProductGroupsApiImpl());
    private final ResourcesApiHandler resourcesHandler = new ResourcesApiHandler(new ResourcesApiImpl());
    private final SearchApiHandler searchHandler = new SearchApiHandler(new SearchApiImpl());
    private final TermsApiHandler termsHandler = new TermsApiHandler(new TermsApiImpl());
    private final TermsOfServiceApiHandler termsOfServiceHandler = new TermsOfServiceApiHandler(new TermsOfServiceApiImpl());
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
              adGroupsHandler.mount(builder);
              adsHandler.mount(builder);
              audienceInsightsHandler.mount(builder);
              audiencesHandler.mount(builder);
              billingHandler.mount(builder);
              boardsHandler.mount(builder);
              bulkHandler.mount(builder);
              campaignsHandler.mount(builder);
              catalogsHandler.mount(builder);
              conversionEventsHandler.mount(builder);
              conversionTagsHandler.mount(builder);
              customerListsHandler.mount(builder);
              integrationsHandler.mount(builder);
              keywordsHandler.mount(builder);
              leadAdsHandler.mount(builder);
              leadFormsHandler.mount(builder);
              mediaHandler.mount(builder);
              oauthHandler.mount(builder);
              orderLinesHandler.mount(builder);
              pinsHandler.mount(builder);
              productGroupPromotionsHandler.mount(builder);
              productGroupsHandler.mount(builder);
              resourcesHandler.mount(builder);
              searchHandler.mount(builder);
              termsHandler.mount(builder);
              termsOfServiceHandler.mount(builder);
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
