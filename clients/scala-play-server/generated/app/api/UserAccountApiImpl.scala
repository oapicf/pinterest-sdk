package api

import model.Account
import model.AnalyticsMetricsResponse
import model.BoardsUserFollowsList200Response
import model.Error
import model.FollowUserRequest
import model.FollowersList200Response
import model.LinkedBusiness
import java.time.LocalDate
import model.TopPinsAnalyticsResponse
import model.TopVideoPinsAnalyticsResponse
import model.UserAccountFollowedInterests200Response
import model.UserFollowingFeedType
import model.UserFollowingGet200Response
import model.UserSummary
import model.UserWebsiteSummary
import model.UserWebsiteVerificationCode
import model.UserWebsiteVerifyRequest
import model.UserWebsitesGet200Response

/**
  * Provides a default implementation for [[UserAccountApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class UserAccountApiImpl extends UserAccountApi {
  /**
    * @inheritdoc
    */
  override def boardsUserFollowsList(bookmark: Option[String], pageSize: Option[Int], explicitFollowing: Option[Boolean], adAccountId: Option[String]): BoardsUserFollowsList200Response = {
    // TODO: Implement better logic

    BoardsUserFollowsList200Response(List.empty[Board], None)
  }

  /**
    * @inheritdoc
    */
  override def followUserUpdate(username: String, followUserRequest: FollowUserRequest): UserSummary = {
    // TODO: Implement better logic

    UserSummary(None, None)
  }

  /**
    * @inheritdoc
    */
  override def followersList(bookmark: Option[String], pageSize: Option[Int]): FollowersList200Response = {
    // TODO: Implement better logic

    FollowersList200Response(List.empty[UserSummary], None)
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
  override def unverifyWebsiteDelete(website: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalytics(startDate: LocalDate, endDate: LocalDate, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], splitField: Option[String], adAccountId: Option[String]): Map[String, AnalyticsMetricsResponse] = {
    // TODO: Implement better logic

    Map.empty[String, AnalyticsMetricsResponse]
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalyticsTopPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): TopPinsAnalyticsResponse = {
    // TODO: Implement better logic

    TopPinsAnalyticsResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userAccountAnalyticsTopVideoPins(startDate: LocalDate, endDate: LocalDate, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Option[List[String]], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): TopVideoPinsAnalyticsResponse = {
    // TODO: Implement better logic

    TopVideoPinsAnalyticsResponse(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def userAccountFollowedInterests(username: String, bookmark: Option[String], pageSize: Option[Int]): UserAccountFollowedInterests200Response = {
    // TODO: Implement better logic

    UserAccountFollowedInterests200Response(List.empty[Interest], None)
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
  override def userFollowingGet(bookmark: Option[String], pageSize: Option[Int], feedType: Option[UserFollowingFeedType], explicitFollowing: Option[Boolean], adAccountId: Option[String]): UserFollowingGet200Response = {
    // TODO: Implement better logic

    UserFollowingGet200Response(List.empty[UserSummary], None)
  }

  /**
    * @inheritdoc
    */
  override def userWebsitesGet(bookmark: Option[String], pageSize: Option[Int]): UserWebsitesGet200Response = {
    // TODO: Implement better logic

    UserWebsitesGet200Response(List.empty[UserWebsiteSummary], None)
  }

  /**
    * @inheritdoc
    */
  override def verifyWebsiteUpdate(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: Option[String]): UserWebsiteSummary = {
    // TODO: Implement better logic

    UserWebsiteSummary(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def websiteVerificationGet(adAccountId: Option[String]): UserWebsiteVerificationCode = {
    // TODO: Implement better logic

    UserWebsiteVerificationCode(None, None, None, None, None)
  }
}
