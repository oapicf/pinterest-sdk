package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CatalogsListProductsByFilterRequest
import org.openapitools.models.CatalogsProductGroupPinsList200Response
import org.openapitools.models.CatalogsProductGroupProductCountsVertical
import org.openapitools.models.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.models.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.models.CatalogsProductGroupsList200Response
import org.openapitools.models.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.models.CatalogsVerticalProductGroup
import org.openapitools.models.PinterestLibError
import org.openapitools.models.ProductsByProductGroupFilterList200Response

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

final case class CatalogProductGroupsApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2, client_credentials
](delegate: CatalogProductGroupsApiDelegate[F, pinterest_oauth2, client_credentials]) extends Http4sDsl[F] {
  object catalogsProductGroupPins/list {
    import CatalogProductGroupsApiDelegate.catalogsProductGroupPins/listResponses

    object product_group_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object pin_metricsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("pin_metrics")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) / "products" :? ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.catalogsProductGroupPins/list.handle_pinterest_oauth2(auth, req, product_group_id, ad_account_id, pin_metrics, bookmark, page_size, responses)

    }
    val routeclient_credentials = AuthedRoutes.of[client_credentials, F] {
      case (req @ GET -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) / "products" :? ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.catalogsProductGroupPins/list.handle_client_credentials(auth, req, product_group_id, ad_account_id, pin_metrics, bookmark, page_size, responses)

    }

    val responses: catalogsProductGroupPins/listResponses[F] = new catalogsProductGroupPins/listResponses[F] {
      def resp200(value: CatalogsProductGroupPinsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/create {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/createResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "product_groups" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsProductGroups/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsProductGroupsCreateRequestSchema] , ad_account_id, responses)

    }

    val responses: catalogsProductGroups/createResponses[F] = new catalogsProductGroups/createResponses[F] {
      def resp200(value: CatalogsVerticalProductGroup): F[Response[F]] = Ok(value)
      def resp201(value: CatalogsVerticalProductGroup): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/createMany {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/createManyResponses

    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "product_groups" / "multiple" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsProductGroups/createMany.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[CatalogsProductGroupsCreateManyRequestItems]] , ad_account_id, responses)

    }

    val responses: catalogsProductGroups/createManyResponses[F] = new catalogsProductGroups/createManyResponses[F] {
      def resp201(value: List[String]): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/delete {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/deleteResponses

    object product_group_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsProductGroups/delete.handle_pinterest_oauth2(auth, req, product_group_id, ad_account_id, responses)

    }

    val responses: catalogsProductGroups/deleteResponses[F] = new catalogsProductGroups/deleteResponses[F] {
      def resp200(value: CatalogsVerticalProductGroup): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/deleteMany {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/deleteManyResponses

    object idQueryParam extends QuerySeqParamDecoderMatcher[Int]("id")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "catalogs" / "product_groups" / "multiple" :? idQueryParam(id) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsProductGroups/deleteMany.handle_pinterest_oauth2(auth, req, id, ad_account_id, responses)

    }

    val responses: catalogsProductGroups/deleteManyResponses[F] = new catalogsProductGroups/deleteManyResponses[F] {
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/get {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/getResponses

    object product_group_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsProductGroups/get.handle_pinterest_oauth2(auth, req, product_group_id, ad_account_id, responses)

    }

    val responses: catalogsProductGroups/getResponses[F] = new catalogsProductGroups/getResponses[F] {
      def resp200(value: CatalogsVerticalProductGroup): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/list {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/listResponses

    object idQueryParam extends OptionalQuerySeqParamDecoderMatcher[Int]("id")
    object feed_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("feed_id")
    object catalog_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("catalog_id")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "product_groups" :? idQueryParam(id) +& feed_idQueryParam(feed_id) +& catalog_idQueryParam(catalog_id) +& ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.catalogsProductGroups/list.handle_pinterest_oauth2(auth, req, id, feed_id, catalog_id, ad_account_id, bookmark, page_size, responses)

    }

    val responses: catalogsProductGroups/listResponses[F] = new catalogsProductGroups/listResponses[F] {
      def resp200(value: CatalogsProductGroupsList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/productCountsGet {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/productCountsGetResponses

    object product_group_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) / "product_counts" :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsProductGroups/productCountsGet.handle_pinterest_oauth2(auth, req, product_group_id, ad_account_id, responses)

    }

    val responses: catalogsProductGroups/productCountsGetResponses[F] = new catalogsProductGroups/productCountsGetResponses[F] {
      def resp200(value: CatalogsProductGroupProductCountsVertical): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsProductGroups/update {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/updateResponses

    object product_group_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "catalogs" / "product_groups" / product_group_idVarr(product_group_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsProductGroups/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsProductGroupsUpdateRequestSchema] , product_group_id, ad_account_id, responses)

    }

    val responses: catalogsProductGroups/updateResponses[F] = new catalogsProductGroups/updateResponses[F] {
      def resp200(value: CatalogsVerticalProductGroup): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object productsByProductGroupFilter/list {
    import CatalogProductGroupsApiDelegate.productsByProductGroupFilter/listResponses

    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object pin_metricsQueryParam extends OptionalQueryParamDecoderMatcher[Boolean]("pin_metrics")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / "products" / "get_by_product_group_filters" :? bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size) +& ad_account_idQueryParam(ad_account_id) +& pin_metricsQueryParam(pin_metrics)) as auth =>
          delegate.productsByProductGroupFilter/list.handle_pinterest_oauth2(auth, req, req.asJsonDecode[CatalogsListProductsByFilterRequest] , bookmark, page_size, ad_account_id, pin_metrics, responses)

    }

    val responses: productsByProductGroupFilter/listResponses[F] = new productsByProductGroupFilter/listResponses[F] {
      def resp200(value: ProductsByProductGroupFilterList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    catalogsProductGroupPins/list.routepinterest_oauth2 <+>
    catalogsProductGroups/create.routepinterest_oauth2 <+>
    catalogsProductGroups/createMany.routepinterest_oauth2 <+>
    catalogsProductGroups/delete.routepinterest_oauth2 <+>
    catalogsProductGroups/deleteMany.routepinterest_oauth2 <+>
    catalogsProductGroups/get.routepinterest_oauth2 <+>
    catalogsProductGroups/list.routepinterest_oauth2 <+>
    catalogsProductGroups/productCountsGet.routepinterest_oauth2 <+>
    catalogsProductGroups/update.routepinterest_oauth2 <+>
    productsByProductGroupFilter/list.routepinterest_oauth2
  val routesclient_credentials =
    catalogsProductGroupPins/list.routeclient_credentials
}

object CatalogProductGroupsApiDelegate {
  trait catalogsProductGroupPins/listResponses[F[_]] {
    def resp200(value: CatalogsProductGroupPinsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/createResponses[F[_]] {
    def resp200(value: CatalogsVerticalProductGroup): F[Response[F]]
    def resp201(value: CatalogsVerticalProductGroup): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/createManyResponses[F[_]] {
    def resp201(value: List[String]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/deleteResponses[F[_]] {
    def resp200(value: CatalogsVerticalProductGroup): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/deleteManyResponses[F[_]] {
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/getResponses[F[_]] {
    def resp200(value: CatalogsVerticalProductGroup): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/listResponses[F[_]] {
    def resp200(value: CatalogsProductGroupsList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/productCountsGetResponses[F[_]] {
    def resp200(value: CatalogsProductGroupProductCountsVertical): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsProductGroups/updateResponses[F[_]] {
    def resp200(value: CatalogsVerticalProductGroup): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait productsByProductGroupFilter/listResponses[F[_]] {
    def resp200(value: ProductsByProductGroupFilterList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogProductGroupsApiDelegate[F[_], pinterest_oauth2, client_credentials] {

  trait catalogsProductGroupPins/list {
    import CatalogProductGroupsApiDelegate.catalogsProductGroupPins/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: catalogsProductGroupPins/listResponses[F]
    ): F[Response[F]]

    def handle_client_credentials(
      auth: client_credentials,
      req: Request[F],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: catalogsProductGroupPins/listResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroupPins/list: catalogsProductGroupPins/list


  trait catalogsProductGroups/create {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsProductGroups/create: F[CatalogsProductGroupsCreateRequestSchema],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/createResponses[F]
    ): F[Response[F]]


  }
  def catalogsProductGroups/create: catalogsProductGroups/create


  trait catalogsProductGroups/createMany {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/createManyResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsProductGroups/createMany: F[List[CatalogsProductGroupsCreateManyRequestItems]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/createManyResponses[F]
    ): F[Response[F]]


  }
  def catalogsProductGroups/createMany: catalogsProductGroups/createMany


  trait catalogsProductGroups/delete {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/deleteResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroups/delete: catalogsProductGroups/delete


  trait catalogsProductGroups/deleteMany {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/deleteManyResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      id: List[Int],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/deleteManyResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroups/deleteMany: catalogsProductGroups/deleteMany


  trait catalogsProductGroups/get {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/getResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroups/get: catalogsProductGroups/get


  trait catalogsProductGroups/list {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      id: Option[List[Int]],
      feedId: Option[Refined[String, MatchesRegex["^\\d+$"]]],
      catalogId: Option[Refined[String, MatchesRegex["^\\d+$"]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: catalogsProductGroups/listResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroups/list: catalogsProductGroups/list


  trait catalogsProductGroups/productCountsGet {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/productCountsGetResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/productCountsGetResponses[F]
    ): F[Response[F]]

  }
  def catalogsProductGroups/productCountsGet: catalogsProductGroups/productCountsGet


  trait catalogsProductGroups/update {
    import CatalogProductGroupsApiDelegate.catalogsProductGroups/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsProductGroups/update: F[CatalogsProductGroupsUpdateRequestSchema],
      productGroupId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsProductGroups/updateResponses[F]
    ): F[Response[F]]


  }
  def catalogsProductGroups/update: catalogsProductGroups/update


  trait productsByProductGroupFilter/list {
    import CatalogProductGroupsApiDelegate.productsByProductGroupFilter/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      productsByProductGroupFilter/list: F[CatalogsListProductsByFilterRequest],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      pinMetrics: Option[Boolean],
      responses: productsByProductGroupFilter/listResponses[F]
    ): F[Response[F]]


  }
  def productsByProductGroupFilter/list: productsByProductGroupFilter/list

}