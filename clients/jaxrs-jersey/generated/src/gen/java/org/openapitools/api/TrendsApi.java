package org.openapitools.api;

import org.openapitools.api.TrendsApiService;
import org.openapitools.api.factories.TrendsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Error;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsSupportedRegion;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/trends/keywords/{region}/top/{trend_type}")


@io.swagger.annotations.Api(description = "the trends API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TrendsApi  {
   private final TrendsApiService delegate;

   public TrendsApi(@Context ServletConfig servletContext) {
      TrendsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TrendsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TrendsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = TrendsApiServiceFactory.getTrendsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List trending keywords", notes = "<p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.", response = TrendingKeywordsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers")
        })
    }, tags={ "keywords", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = TrendingKeywordsResponse.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid trending keywords request parameters", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response trendingKeywordsList(@ApiParam(value = "The geographic region of interest. Only top trends within the specified region will be returned.<br /> The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas: - `US` - United States - `CA` - Canada - `DE` - Germany - `FR` - France - `ES` - Spain - `IT` - Italy - `DE+AT+CH` - Germanic countries - `GB+IE` - Great Britain & Ireland - `IT+ES+PT+GR+MT` - Southern Europe - `PL+RO+HU+SK+CZ` - Eastern Europe - `SE+DK+FI+NO` - Nordic countries - `NL+BE+LU` - Benelux - `AR` - Argentina - `BR` - Brazil - `CO` - Colombia - `MX` - Mexico - `MX+AR+CO+CL` - Hispanic LatAm - `AU+NZ` - Australasia", required = true, allowableValues="US, CA, DE, FR, ES, IT, DE+AT+CH, GB+IE, IT+ES+PT+GR+MT, PL+RO+HU+SK+CZ, SE+DK+FI+NO, NL+BE+LU, AR, BR, CO, MX, MX+AR+CO+CL, AU+NZ") @PathParam("region") @NotNull @Valid  TrendsSupportedRegion region,@ApiParam(value = "The methodology used to rank how trendy a keyword is. - `growing` trends have high upward growth in search volume over the last quarter - `monthly` trends have high search volume in the last month - `yearly` trends have high search volume in the last year - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)", required = true, allowableValues="growing, monthly, yearly, seasonal") @PathParam("trend_type") @NotNull @Valid  TrendType trendType,@ApiParam(value = "If set, filters the results to trends associated with the specified interests.<br /> If unset, trends for all interests will be returned.<br /> The list of supported interests is: - `animals` - Animals - `architecture` - Architecture - `art` - Art - `beauty` - Beauty - `childrens_fashion` - Children's Fashion - `design` - Design - `diy_and_crafts` - DIY & Crafts - `education` - Education - `electronics` - Electronics - `entertainment` - Entertainment - `event_planning` - Event Planning - `finance` - Finance - `food_and_drinks` - Food & Drink - `gardening` - Gardening - `health` - Health - `home_decor` - Home Decor - `mens_fashion` - Men's Fashion - `parenting` - Parenting - `quotes` - Quotes - `sport` - Sports - `travel` - Travel - `vehicles` - Vehicles - `wedding` - Wedding - `womens_fashion` - Women's Fashion") @QueryParam("interests") @Valid  List<String> interests,@ApiParam(value = "If set, filters the results to trends among users who identify with the specified gender(s).<br /> If unset, trends among all genders will be returned.<br /> The `unknown` group includes users with unspecified or customized gender profile settings.") @QueryParam("genders") @Valid  List<String> genders,@ApiParam(value = "If set, filters the results to trends among users in the specified age range(s).<br /> If unset, trends among all age groups will be returned.") @QueryParam("ages") @Valid  List<String> ages,@ApiParam(value = "Governs how the resulting time series data will be normalized to a [0-100] scale.<br /> By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.<br /> If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.", defaultValue = "false") @DefaultValue("false") @QueryParam("normalize_against_group")  Boolean normalizeAgainstGroup,@ApiParam(value = "The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.", defaultValue = "50") @DefaultValue("50") @QueryParam("limit")  @Min(1) @Max(50) Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.trendingKeywordsList(region, trendType, interests, genders, ages, normalizeAgainstGroup, limit, securityContext);
    }
}
