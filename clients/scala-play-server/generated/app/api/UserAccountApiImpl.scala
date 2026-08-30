package api

import model.Account
import model.AnalyticsMetricsResponse
import model.BigDecimal
import model.BoardsList200Response
import model.Error
import model.FollowUser
import model.FollowUserCreate
import model.FollowersList200Response
import model.LinkedBusiness
import java.time.LocalDate
import model.QuerymetrictypesItems
import model.QueryvideopinmetrictypesItems
import model.TopPinsAnalyticsResponse
import model.TopPinsSortBy
import model.TopVideoPinsAnalyticsResponse
import model.TopVideoPinsSortBy
import model.UserAccountFollowedInterests200Response
import model.UserFollowingFeedType
import model.UserWebsite
import model.UserWebsiteCreate
import model.UserWebsiteVerification
import model.UserWebsitesGet200Response

/**
  * Provides a default implementation for [[UserAccountApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class UserAccountApiImpl extends UserAccountApi {
  /**
    * @inheritdoc
    */
  override def boardsUserFollowsList(adAccountId: Option[String], explicitFollowing: Option[Boolean], bookmark: Option[String], pageSize: Option[Int]): BoardsList200Response = {
    // TODO: Implement better logic

    BoardsList200Response(None, List.empty[Board])
  }

  /**
    * @inheritdoc
    */
  override def followUserUpdate(username: String, followUserCreate: FollowUserCreate): FollowUser = {
    // TODO: Implement better logic

    FollowUser(None, None)
  }

  /**
    * @inheritdoc
    */
  override def followersList(bookmark: Option[String], pageSize: Option[Int]): FollowersList200Response = {
    // TODO: Implement better logic

    FollowersList200Response(None, List.empty[FollowUser])
  }

  /**
    * @inheritdoc
    */
  override def linkedBusinessAccountsGet(): List[LinkedBusiness] = {
    // TODO: Implement better logic

    List.empty[LinkedBusiness]
  }

  /**
    * @inheritdoc
    */
  override def unverifyWebsiteDelete(website: String): UserWebsite = {
    // TODO: Implement better logic

    UserWebsite(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[QuerymetrictypesItems]], splitField: Option[String], adAccountId: Option[String]): Map[String, AnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, AnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalyticsTopPins(startDate: LocalDate, endDate: LocalDate, sortBy: TopPinsSortBy, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[QuerymetrictypesItems]], numOfPins: Option[Int], createdInLastNDays: Option[BigDecimal], adAccountId: Option[String]): TopPinsAnalyticsResponse = {
    // TODO: Implement better logic

    TopPinsAnalyticsResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalyticsTopVideoPins(startDate: LocalDate, endDate: LocalDate, sortBy: TopVideoPinsSortBy, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[QueryvideopinmetrictypesItems]], numOfPins: Option[Int], createdInLastNDays: Option[BigDecimal], adAccountId: Option[String]): TopVideoPinsAnalyticsResponse = {
    // TODO: Implement better logic

    TopVideoPinsAnalyticsResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userAccountFollowedInterests(username: String, bookmark: Option[String], pageSize: Option[Int]): UserAccountFollowedInterests200Response = {
    // TODO: Implement better logic

    UserAccountFollowedInterests200Response(None, List.empty[Interest])
  }

  /**
    * @inheritdoc
    */
  override def userAccountGet(adAccountId: Option[String]): Account = {
    // TODO: Implement better logic

    Account(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userFollowingGet(adAccountId: Option[String], explicitFollowing: Option[Boolean], feedType: Option[UserFollowingFeedType], bookmark: Option[String], pageSize: Option[Int]): FollowersList200Response = {
    // TODO: Implement better logic

    FollowersList200Response(None, List.empty[FollowUser])
  }

  /**
    * @inheritdoc
    */
  override def userWebsitesGet(bookmark: Option[String], pageSize: Option[Int]): UserWebsitesGet200Response = {
    // TODO: Implement better logic

    UserWebsitesGet200Response(None, List.empty[UserWebsite])
  }

  /**
    * @inheritdoc
    */
  override def verifyWebsiteUpdate(userWebsiteCreate: UserWebsiteCreate, adAccountId: Option[String]): UserWebsite = {
    // TODO: Implement better logic

    UserWebsite(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def websiteVerificationGet(adAccountId: Option[String]): UserWebsiteVerification = {
    // TODO: Implement better logic

    UserWebsiteVerification(None, None, None, None, None)
  }
}
