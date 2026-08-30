package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LabelCreateRequest
import org.openapitools.models.LabelUpdateRequest
import org.openapitools.models.LabeledEntities
import org.openapitools.models.LabeledEntitiesCreate
import org.openapitools.models.LabelsList200Response
import org.openapitools.models.LabelsResponse
import org.openapitools.models.PinterestLibError
import org.openapitools.models.QueryLabelEntityStatusesItems
import org.openapitools.models.QueryLabelTypesItems

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

final case class LabelsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: LabelsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object labels/apply {
    import LabelsApiDelegate.labels/applyResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "labels" / label_id / "apply") as auth =>
          delegate.labels/apply.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LabeledEntitiesCreate] , ad_account_id, label_id, responses)

    }

    val responses: labels/applyResponses[F] = new labels/applyResponses[F] {
      def resp200(value: LabeledEntities): F[Response[F]] = Ok(value)
      def resp201(value: LabeledEntities): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object labels/create {
    import LabelsApiDelegate.labels/createResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "labels") as auth =>
          delegate.labels/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LabelCreateRequest] , ad_account_id, responses)

    }

    val responses: labels/createResponses[F] = new labels/createResponses[F] {
      def resp200(value: LabelsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object labels/list {
    import LabelsApiDelegate.labels/listResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]
    object campaign_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("campaign_ids")
    object label_idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("label_ids")
    object entity_statusesQueryParam extends OptionalQuerySeqParamDecoderMatcher[QueryLabelEntityStatusesItems]("entity_statuses")
    object label_typesQueryParam extends OptionalQuerySeqParamDecoderMatcher[QueryLabelTypesItems]("label_types")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "labels" :? campaign_idsQueryParam(campaign_ids) +& label_idsQueryParam(label_ids) +& entity_statusesQueryParam(entity_statuses) +& label_typesQueryParam(label_types) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.labels/list.handle_pinterest_oauth2(auth, req, ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, bookmark, page_size, responses)

    }

    val responses: labels/listResponses[F] = new labels/listResponses[F] {
      def resp200(value: LabelsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object labels/remove {
    import LabelsApiDelegate.labels/removeResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "labels" / label_id / "remove") as auth =>
          delegate.labels/remove.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LabeledEntitiesCreate] , ad_account_id, label_id, responses)

    }

    val responses: labels/removeResponses[F] = new labels/removeResponses[F] {
      def resp200(value: LabeledEntities): F[Response[F]] = Ok(value)
      def resp201(value: LabeledEntities): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object labels/update {
    import LabelsApiDelegate.labels/updateResponses

    object ad_account_idVarr extends RefinedVarr[String, MaxSize[18] And MatchesRegex["^\\d+$"]]

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "ad_accounts" / ad_account_idVarr(ad_account_id) / "labels") as auth =>
          delegate.labels/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LabelUpdateRequest] , ad_account_id, responses)

    }

    val responses: labels/updateResponses[F] = new labels/updateResponses[F] {
      def resp200(value: LabelsResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    labels/apply.routepinterest_oauth2 <+>
    labels/create.routepinterest_oauth2 <+>
    labels/list.routepinterest_oauth2 <+>
    labels/remove.routepinterest_oauth2 <+>
    labels/update.routepinterest_oauth2
}

object LabelsApiDelegate {
  trait labels/applyResponses[F[_]] {
    def resp200(value: LabeledEntities): F[Response[F]]
    def resp201(value: LabeledEntities): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait labels/createResponses[F[_]] {
    def resp200(value: LabelsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait labels/listResponses[F[_]] {
    def resp200(value: LabelsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait labels/removeResponses[F[_]] {
    def resp200(value: LabeledEntities): F[Response[F]]
    def resp201(value: LabeledEntities): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait labels/updateResponses[F[_]] {
    def resp200(value: LabelsResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait LabelsApiDelegate[F[_], pinterest_oauth2] {

  trait labels/apply {
    import LabelsApiDelegate.labels/applyResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      labels/apply: F[LabeledEntitiesCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      labelId: String,
      responses: labels/applyResponses[F]
    ): F[Response[F]]


  }
  def labels/apply: labels/apply


  trait labels/create {
    import LabelsApiDelegate.labels/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      labels/create: F[LabelCreateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: labels/createResponses[F]
    ): F[Response[F]]


  }
  def labels/create: labels/create


  trait labels/list {
    import LabelsApiDelegate.labels/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      campaignIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      labelIds: Option[List[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]],
      entityStatuses: Option[List[QueryLabelEntityStatusesItems]],
      labelTypes: Option[List[QueryLabelTypesItems]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: labels/listResponses[F]
    ): F[Response[F]]

  }
  def labels/list: labels/list


  trait labels/remove {
    import LabelsApiDelegate.labels/removeResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      labels/remove: F[LabeledEntitiesCreate],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      labelId: String,
      responses: labels/removeResponses[F]
    ): F[Response[F]]


  }
  def labels/remove: labels/remove


  trait labels/update {
    import LabelsApiDelegate.labels/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      labels/update: F[LabelUpdateRequest],
      adAccountId: Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]],
      responses: labels/updateResponses[F]
    ): F[Response[F]]


  }
  def labels/update: labels/update

}