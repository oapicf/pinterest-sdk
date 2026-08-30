package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.PinterestLibError
import org.openapitools.models.RelatedTerms

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual

import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class TermsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: TermsApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object termsRelated/list {
    import TermsApiDelegate.termsRelated/listResponses

    object termsQueryParam extends QuerySeqParamDecoderMatcher[String]("terms")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "terms" / "related" :? termsQueryParam(terms)) as auth =>
        delegate.termsRelated/list.handle_pinterest_oauth2(auth, req, terms, responses)

    }

    val responses: termsRelated/listResponses[F] = new termsRelated/listResponses[F] {
      def resp200(value: RelatedTerms): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object termsSuggested/list {
    import TermsApiDelegate.termsSuggested/listResponses

    object termQueryParam extends QueryParamDecoderMatcher[String]("term")
    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[10]]]("limit")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "terms" / "suggested" :? termQueryParam(term) +& limitQueryParam(limit)) as auth =>
        delegate.termsSuggested/list.handle_pinterest_oauth2(auth, req, term, limit, responses)

    }

    val responses: termsSuggested/listResponses[F] = new termsSuggested/listResponses[F] {
      def resp200(value: List[String]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    termsRelated/list.routepinterest_oauth2 <+>
    termsSuggested/list.routepinterest_oauth2
}

object TermsApiDelegate {
  trait termsRelated/listResponses[F[_]] {
    def resp200(value: RelatedTerms): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait termsSuggested/listResponses[F[_]] {
    def resp200(value: List[String]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait TermsApiDelegate[F[_], pinterest_oauth2] {

  trait termsRelated/list {
    import TermsApiDelegate.termsRelated/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      terms: List[String],
      responses: termsRelated/listResponses[F]
    ): F[Response[F]]

  }
  def termsRelated/list: termsRelated/list


  trait termsSuggested/list {
    import TermsApiDelegate.termsSuggested/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      term: String,
      limit: Option[Refined[Int, GreaterEqual[1] And LessEqual[10]]],
      responses: termsSuggested/listResponses[F]
    ): F[Response[F]]

  }
  def termsSuggested/list: termsSuggested/list

}