package org.openapitools.api.interfaces;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.math.BigDecimal;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.FollowUser;
import org.openapitools.model.FollowUserCreate;
import org.openapitools.model.FollowersList200Response;
import org.openapitools.model.LinkedBusiness;
import java.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.QuerymetrictypesItems;
import org.openapitools.model.QueryvideopinmetrictypesItems;
import org.openapitools.model.TopPinsAnalyticsResponse;
import org.openapitools.model.TopPinsSortBy;
import org.openapitools.model.TopVideoPinsAnalyticsResponse;
import org.openapitools.model.TopVideoPinsSortBy;
import org.openapitools.model.UserFollowingFeedType;
import org.openapitools.model.UserWebsite;
import org.openapitools.model.UserWebsiteCreate;
import org.openapitools.model.UserWebsiteVerification;
import org.openapitools.model.UserWebsitesGet200Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface UserAccountService {

    /**
     * List following boards
     * Get a list of the boards a user follows. The request returns a board summary object array.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardsList200Response
     */
    BoardsList200Response boardsUserFollowsList(
        String adAccountId,
        Boolean explicitFollowing,
        String bookmark,
        Integer pageSize
    );

    /**
     * Follow user
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
     *
     * @param username A valid username (required)
     * @param followUserCreate  (required)
     * @return FollowUser
     */
    FollowUser followUserUpdate(
        String username,
        FollowUserCreate followUserCreate
    );

    /**
     * List followers
     * Get a list of your followers.
     *
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return FollowersList200Response
     */
    FollowersList200Response followersList(
        String bookmark,
        Integer pageSize
    );

    /**
     * List linked businesses
     * Get a list of your linked business accounts.
     *
     * @return List<LinkedBusiness>
     */
    List<LinkedBusiness> linkedBusinessAccountsGet(
    );

    /**
     * Unverify website
     * Unverify a website verified by the signed-in user.
     *
     * @param website Website with path or domain only (required)
     * @return UserWebsite
     */
    UserWebsite unverifyWebsiteDelete(
        String website
    );

    /**
     * Get user account analytics
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get data for, default is all. (optional)
     * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map<String, AnalyticsMetricsResponse>
     */
    Map<String, AnalyticsMetricsResponse> userAccountAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        String fromClaimedContent,
        String pinFormat,
        String appTypes,
        String contentType,
        String source,
        List<QuerymetrictypesItems> metricTypes,
        String splitField,
        String adAccountId
    );

    /**
     * Get user account top pins analytics
     * Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param sortBy Specify sorting order for metrics (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get data for, default is all. (optional)
     * @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to 10)
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return TopPinsAnalyticsResponse
     */
    TopPinsAnalyticsResponse userAccountAnalyticsTopPins(
        LocalDate startDate,
        LocalDate endDate,
        TopPinsSortBy sortBy,
        String fromClaimedContent,
        String pinFormat,
        String appTypes,
        String contentType,
        String source,
        List<QuerymetrictypesItems> metricTypes,
        Integer numOfPins,
        BigDecimal createdInLastNDays,
        String adAccountId
    );

    /**
     * Get user account top video pins analytics
     * Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param sortBy Specify sorting order for video metrics (required)
     * @param fromClaimedContent Filter on Pins that match your claimed domain. (optional, default to BOTH)
     * @param pinFormat Pin formats to get data for, default is all. (optional, default to ALL)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param contentType Filter to paid or organic data. Default is all. (optional, default to ALL)
     * @param source Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional, default to ALL)
     * @param metricTypes Metric types to get video data for, default is all. (optional)
     * @param numOfPins Number of pins to include, default is 10. Max is 50. (optional, default to 10)
     * @param createdInLastNDays Get metrics for pins created in the last \&quot;n\&quot; days. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return TopVideoPinsAnalyticsResponse
     */
    TopVideoPinsAnalyticsResponse userAccountAnalyticsTopVideoPins(
        LocalDate startDate,
        LocalDate endDate,
        TopVideoPinsSortBy sortBy,
        String fromClaimedContent,
        String pinFormat,
        String appTypes,
        String contentType,
        String source,
        List<QueryvideopinmetrictypesItems> metricTypes,
        Integer numOfPins,
        BigDecimal createdInLastNDays,
        String adAccountId
    );

    /**
     * Get user account
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Account
     */
    Account userAccountGet(
        String adAccountId
    );

    /**
     * List following
     * Get a list of who a certain user follows.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param explicitFollowing Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional, default to false)
     * @param feedType Thrift param specifying what type of followees will be kept. Default to include all followees. (optional, default to ALL)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return FollowersList200Response
     */
    FollowersList200Response userFollowingGet(
        String adAccountId,
        Boolean explicitFollowing,
        UserFollowingFeedType feedType,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get user websites
     * Get user websites, claimed or not
     *
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return UserWebsitesGet200Response
     */
    UserWebsitesGet200Response userWebsitesGet(
        String bookmark,
        Integer pageSize
    );

    /**
     * Verify website
     * Verify a website as a signed-in user.
     *
     * @param userWebsiteCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return UserWebsite
     */
    UserWebsite verifyWebsiteUpdate(
        UserWebsiteCreate userWebsiteCreate,
        String adAccountId
    );

    /**
     * Get user verification code for website claiming
     * Get verification code for user to install on the website to claim it.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return UserWebsiteVerification
     */
    UserWebsiteVerification websiteVerificationGet(
        String adAccountId
    );
}
