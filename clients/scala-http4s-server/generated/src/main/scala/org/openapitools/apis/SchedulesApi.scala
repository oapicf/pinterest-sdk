package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.PinterestLibPaginationOrder
import org.openapitools.models.Schedule
import org.openapitools.models.ScheduleBatchUpdate
import org.openapitools.models.ScheduleCreate
import org.openapitools.models.ScheduleStatus
import org.openapitools.models.ScheduleType
import org.openapitools.models.SchedulesCreate200ResponseInner
import org.openapitools.models.SchedulesList200Response
import org.openapitools.models.SchedulesUpdate200ResponseInner

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

final case class SchedulesApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: SchedulesApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object schedules/create {
    import SchedulesApiDelegate.schedules/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "schedules") as auth =>
          delegate.schedules/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[ScheduleCreate]] , ad_account_id, responses)

    }

    val responses: schedules/createResponses[F] = new schedules/createResponses[F] {
      def resp200(value: List[SchedulesCreate200ResponseInner]): F[Response[F]] = Ok(value)
      def resp201(value: List[Schedule]): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object schedules/list {
    import SchedulesApiDelegate.schedules/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object orderQueryParam extends OptionalQueryParamDecoderMatcher[PinterestLibPaginationOrder]("order")
    object schedule_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[ScheduleStatus]("schedule_statuses")
    object schedule_typeQueryParam extends OptionalQueryParamDecoderMatcher[ScheduleType]("schedule_type")
    object entity_idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("entity_ids")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "schedules" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& orderQueryParam(order) +& schedule_statusesQueryParam(schedule_statuses) +& schedule_typeQueryParam(schedule_type) +& entity_idsQueryParam(entity_ids)) as auth =>
        delegate.schedules/list.handle_pinterest_oauth2(auth, req, ad_account_id, bookmark, page_size, order, schedule_statuses, schedule_type, entity_ids, responses)

    }

    val responses: schedules/listResponses[F] = new schedules/listResponses[F] {
      def resp200(value: SchedulesList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object schedules/update {
    import SchedulesApiDelegate.schedules/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "schedules") as auth =>
          delegate.schedules/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[ScheduleBatchUpdate]] , ad_account_id, responses)

    }

    val responses: schedules/updateResponses[F] = new schedules/updateResponses[F] {
      def resp200(value: List[SchedulesUpdate200ResponseInner]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    schedules/create.routepinterest_oauth2 <+>
    schedules/list.routepinterest_oauth2 <+>
    schedules/update.routepinterest_oauth2
}

object SchedulesApiDelegate {
  trait schedules/createResponses[F[_]] {
    def resp200(value: List[SchedulesCreate200ResponseInner]): F[Response[F]]
    def resp201(value: List[Schedule]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait schedules/listResponses[F[_]] {
    def resp200(value: SchedulesList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait schedules/updateResponses[F[_]] {
    def resp200(value: List[SchedulesUpdate200ResponseInner]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait SchedulesApiDelegate[F[_], pinterest_oauth2] {

  trait schedules/create {
    import SchedulesApiDelegate.schedules/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      schedules/create: F[List[ScheduleCreate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: schedules/createResponses[F]
    ): F[Response[F]]


  }
  def schedules/create: schedules/create


  trait schedules/list {
    import SchedulesApiDelegate.schedules/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      order: Option[PinterestLibPaginationOrder],
      scheduleStatuses: Option[List[ScheduleStatus]],
      scheduleType: Option[ScheduleType],
      entityIds: List[Refined[String, MatchesRegex["^\\d+$"]]],
      responses: schedules/listResponses[F]
    ): F[Response[F]]

  }
  def schedules/list: schedules/list


  trait schedules/update {
    import SchedulesApiDelegate.schedules/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      schedules/update: F[List[ScheduleBatchUpdate]],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: schedules/updateResponses[F]
    ): F[Response[F]]


  }
  def schedules/update: schedules/update

}