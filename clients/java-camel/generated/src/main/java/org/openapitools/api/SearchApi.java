/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class SearchApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /search/partner/pins : Search pins by a given search term
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("boards:read","See your public boards, including group boards you join")
                        .withScope("pins:read","See your public Pins")
                
            .endSecurityDefinition()
            .get("/search/partner/pins")
                .description("Search pins by a given search term")
                .id("searchPartnerPinsApi")
                .produces("application/json")
                .outType(SearchPartnerPins200Response.class)
                .param()
                    .name("term")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Search term to look up pins.")
                .endParam()
                .param()
                    .name("countryCode")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Two letter country code (ISO 3166-1 alpha-2)")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("locale")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Search locale.")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Max search result size")
                .endParam()
                .to("direct:searchPartnerPins");
        

        /**
        GET /search/boards : Search user&#39;s boards
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("boards:read","See your public boards, including group boards you join")
                        .withScope("boards:read_secret","See your secret boards")
                .end()
                .oauth2("client_credentials")
                    .flow("application")
                    .tokenUrl("https://api.pinterest.com/v3/oauth/access_token/")
                        .withScope("boards:read","See your public boards, including group boards you join")
                        .withScope("boards:read_secret","See your secret boards")
                
            .endSecurityDefinition()
            .get("/search/boards")
                .description("Search user's boards")
                .id("searchUserBoardsGetApi")
                .produces("application/json")
                .outType(SearchUserBoardsGet200Response.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .param()
                    .name("pageSize")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")
                .endParam()
                .param()
                    .name("query")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Search query. Can contain pin description keywords or comma-separated pin IDs.")
                .endParam()
                .to("direct:searchUserBoardsGet");
        

        /**
        GET /search/pins : Search user&#39;s Pins
        **/
        rest()
            .securityDefinitions()
                .oauth2("pinterest_oauth2")
                    .flow("accessCode")
                    .tokenUrl("https://api.pinterest.com/v5/oauth/token")
                    .authorizationUrl("https://www.pinterest.com/oauth/")
                        .withScope("boards:read","See your public boards, including group boards you join")
                        .withScope("boards:read_secret","See your secret boards")
                        .withScope("pins:read","See your public Pins")
                        .withScope("pins:read_secret","See your secret Pins")
                
            .endSecurityDefinition()
            .get("/search/pins")
                .description("Search user's Pins")
                .id("searchUserPinsListApi")
                .produces("application/json")
                .outType(PinsList200Response.class)
                .param()
                    .name("adAccountId")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Unique identifier of an ad account.")
                .endParam()
                .param()
                    .name("query")
                    .type(RestParamType.query)
                    .required(true)
                    .description("Search query. Can contain pin description keywords or comma-separated pin IDs.")
                .endParam()
                .param()
                    .name("bookmark")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Cursor used to fetch the next page of items")
                .endParam()
                .to("direct:searchUserPinsList");
        
    }
}
