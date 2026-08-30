package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AdAccountToAdAccountSharedAudience
import org.openapitools.models.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.models.AdAccountToBusinessSharedAudience
import org.openapitools.models.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.models.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.models.AudienceAccountType
import org.openapitools.models.BusinessAccountAudiencesSharedAccountsList200Response
import org.openapitools.models.BusinessToAdAccountSharedAudience
import org.openapitools.models.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.models.BusinessToBusinessSharedAudience
import org.openapitools.models.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.models.Order
import org.openapitools.models.PinterestLibError
import org.openapitools.models.SharedAudiencesForBusinessList200Response

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual
import eu.timepit.refined.string.MatchesRegex

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class AudienceSharingApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: AudienceSharingApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object adAccountsAudiencesSharedAccounts/list {
    import AudienceSharingApiDelegate.adAccountsAudiencesSharedAccounts/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object audience_idQueryParam extends QueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("audience_id")
    object account_typeQueryParam extends QueryParamDecoderMatcher[AudienceAccountType]("account_type")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" / "shared" / "accounts" :? audience_idQueryParam(audience_id) +& account_typeQueryParam(account_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adAccountsAudiencesSharedAccounts/list.handle_pinterest_oauth2(auth, req, ad_account_id, audience_id, account_type, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" / "shared" / "accounts" :? audience_idQueryParam(audience_id) +& account_typeQueryParam(account_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.adAccountsAudiencesSharedAccounts/list.handle_client_credentials(auth, req, ad_account_id, audience_id, account_type, bookmark, page_size, responses)

    }

    val responses: adAccountsAudiencesSharedAccounts/listResponses[F] = new adAccountsAudiencesSharedAccounts/listResponses[F] {
      def resp200(value: AdAccountsAudiencesSharedAccountsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object businessAccountAudiencesSharedAccounts/list {
    import AudienceSharingApiDelegate.businessAccountAudiencesSharedAccounts/listResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object audience_idQueryParam extends QueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("audience_id")
    object account_typeQueryParam extends QueryParamDecoderMatcher[AudienceAccountType]("account_type")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "audiences" / "shared" / "accounts" :? audience_idQueryParam(audience_id) +& account_typeQueryParam(account_type) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.businessAccountAudiencesSharedAccounts/list.handle_pinterest_oauth2(auth, req, business_id, audience_id, account_type, bookmark, page_size, responses)

    }

    val responses: businessAccountAudiencesSharedAccounts/listResponses[F] = new businessAccountAudiencesSharedAccounts/listResponses[F] {
      def resp200(value: BusinessAccountAudiencesSharedAccountsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object sharedAudiencesForBusiness/list {
    import AudienceSharingApiDelegate.sharedAudiencesForBusiness/listResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[Order]("order")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "businesses" / business_idVarr(business_id) / "audiences" :? orderQueryParam(order) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.sharedAudiencesForBusiness/list.handle_pinterest_oauth2(auth, req, business_id, order, bookmark, page_size, responses)

    }

    val responses: sharedAudiencesForBusiness/listResponses[F] = new sharedAudiencesForBusiness/listResponses[F] {
      def resp200(value: SharedAudiencesForBusinessList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object updateAdAccountToAdAccountSharedAudience {
    import AudienceSharingApiDelegate.updateAdAccountToAdAccountSharedAudienceResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" / "ad_accounts" / "shared") as auth =>
          delegate.updateAdAccountToAdAccountSharedAudience.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] , ad_account_id, responses)

    }

    val responses: updateAdAccountToAdAccountSharedAudienceResponses[F] = new updateAdAccountToAdAccountSharedAudienceResponses[F] {
      def resp200(value: AdAccountToAdAccountSharedAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object updateAdAccountToBusinessSharedAudience {
    import AudienceSharingApiDelegate.updateAdAccountToBusinessSharedAudienceResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "audiences" / "businesses" / "shared") as auth =>
          delegate.updateAdAccountToBusinessSharedAudience.handle_pinterest_oauth2(auth, req, req.asJsonDecode[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] , ad_account_id, responses)

    }

    val responses: updateAdAccountToBusinessSharedAudienceResponses[F] = new updateAdAccountToBusinessSharedAudienceResponses[F] {
      def resp200(value: AdAccountToBusinessSharedAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object updateBusinessToAdAccountSharedAudience {
    import AudienceSharingApiDelegate.updateBusinessToAdAccountSharedAudienceResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "audiences" / "ad_accounts" / "shared") as auth =>
          delegate.updateBusinessToAdAccountSharedAudience.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] , business_id, responses)

    }

    val responses: updateBusinessToAdAccountSharedAudienceResponses[F] = new updateBusinessToAdAccountSharedAudienceResponses[F] {
      def resp200(value: BusinessToAdAccountSharedAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object updateBusinessToBusinessSharedAudience {
    import AudienceSharingApiDelegate.updateBusinessToBusinessSharedAudienceResponses

    object business_idVarr extends RefinedVarr[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "businesses" / business_idVarr(business_id) / "audiences" / "businesses" / "shared") as auth =>
          delegate.updateBusinessToBusinessSharedAudience.handle_pinterest_oauth2(auth, req, req.asJsonDecode[BusinessToBusinessSharedAudienceUpdateWithRequiredBody] , business_id, responses)

    }

    val responses: updateBusinessToBusinessSharedAudienceResponses[F] = new updateBusinessToBusinessSharedAudienceResponses[F] {
      def resp200(value: BusinessToBusinessSharedAudience): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    adAccountsAudiencesSharedAccounts/list.routepinterest_oauth2 <+>
    businessAccountAudiencesSharedAccounts/list.routepinterest_oauth2 <+>
    sharedAudiencesForBusiness/list.routepinterest_oauth2 <+>
    updateAdAccountToAdAccountSharedAudience.routepinterest_oauth2 <+>
    updateAdAccountToBusinessSharedAudience.routepinterest_oauth2 <+>
    updateBusinessToAdAccountSharedAudience.routepinterest_oauth2 <+>
    updateBusinessToBusinessSharedAudience.routepinterest_oauth2
  val routesclient_credentials =
    adAccountsAudiencesSharedAccounts/list.routeclient_credentials
}

object AudienceSharingApiDelegate {
  trait adAccountsAudiencesSharedAccounts/listResponses[F[_]] {
    def resp200(value: AdAccountsAudiencesSharedAccountsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait businessAccountAudiencesSharedAccounts/listResponses[F[_]] {
    def resp200(value: BusinessAccountAudiencesSharedAccountsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait sharedAudiencesForBusiness/listResponses[F[_]] {
    def resp200(value: SharedAudiencesForBusinessList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait updateAdAccountToAdAccountSharedAudienceResponses[F[_]] {
    def resp200(value: AdAccountToAdAccountSharedAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait updateAdAccountToBusinessSharedAudienceResponses[F[_]] {
    def resp200(value: AdAccountToBusinessSharedAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait updateBusinessToAdAccountSharedAudienceResponses[F[_]] {
    def resp200(value: BusinessToAdAccountSharedAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait updateBusinessToBusinessSharedAudienceResponses[F[_]] {
    def resp200(value: BusinessToBusinessSharedAudience): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait AudienceSharingApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait adAccountsAudiencesSharedAccounts/list {
    import AudienceSharingApiDelegate.adAccountsAudiencesSharedAccounts/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      audienceId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      accountType: AudienceAccountType,
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adAccountsAudiencesSharedAccounts/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      audienceId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      accountType: AudienceAccountType,
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: adAccountsAudiencesSharedAccounts/listResponses[F]
    ): F[Response[F]]

  }
  def adAccountsAudiencesSharedAccounts/list: adAccountsAudiencesSharedAccounts/list


  trait businessAccountAudiencesSharedAccounts/list {
    import AudienceSharingApiDelegate.businessAccountAudiencesSharedAccounts/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      audienceId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      accountType: AudienceAccountType,
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: businessAccountAudiencesSharedAccounts/listResponses[F]
    ): F[Response[F]]

  }
  def businessAccountAudiencesSharedAccounts/list: businessAccountAudiencesSharedAccounts/list


  trait sharedAudiencesForBusiness/list {
    import AudienceSharingApiDelegate.sharedAudiencesForBusiness/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      order: Option[Order],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: sharedAudiencesForBusiness/listResponses[F]
    ): F[Response[F]]

  }
  def sharedAudiencesForBusiness/list: sharedAudiencesForBusiness/list


  trait updateAdAccountToAdAccountSharedAudience {
    import AudienceSharingApiDelegate.updateAdAccountToAdAccountSharedAudienceResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      updateAdAccountToAdAccountSharedAudience: F[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: updateAdAccountToAdAccountSharedAudienceResponses[F]
    ): F[Response[F]]


  }
  def updateAdAccountToAdAccountSharedAudience: updateAdAccountToAdAccountSharedAudience


  trait updateAdAccountToBusinessSharedAudience {
    import AudienceSharingApiDelegate.updateAdAccountToBusinessSharedAudienceResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      updateAdAccountToBusinessSharedAudience: F[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: updateAdAccountToBusinessSharedAudienceResponses[F]
    ): F[Response[F]]


  }
  def updateAdAccountToBusinessSharedAudience: updateAdAccountToBusinessSharedAudience


  trait updateBusinessToAdAccountSharedAudience {
    import AudienceSharingApiDelegate.updateBusinessToAdAccountSharedAudienceResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      updateBusinessToAdAccountSharedAudience: F[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: updateBusinessToAdAccountSharedAudienceResponses[F]
    ): F[Response[F]]


  }
  def updateBusinessToAdAccountSharedAudience: updateBusinessToAdAccountSharedAudience


  trait updateBusinessToBusinessSharedAudience {
    import AudienceSharingApiDelegate.updateBusinessToBusinessSharedAudienceResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      updateBusinessToBusinessSharedAudience: F[BusinessToBusinessSharedAudienceUpdateWithRequiredBody],
      businessId: Refined[String, MinSize[1] And MaxSize[20] And MatchesRegex["^\\d+$"]],
      responses: updateBusinessToBusinessSharedAudienceResponses[F]
    ): F[Response[F]]


  }
  def updateBusinessToBusinessSharedAudience: updateBusinessToBusinessSharedAudience

}