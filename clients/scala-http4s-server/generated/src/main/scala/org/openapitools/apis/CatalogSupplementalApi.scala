package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.models.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.models.CatalogsLocalStoresList200Response
import org.openapitools.models.CatalogsLocalStoresUpdate200ResponseInner
import org.openapitools.models.LocalInventoryItemsBatch
import org.openapitools.models.LocalInventoryItemsBatchCreate
import org.openapitools.models.LocalInventoryItemsGet
import org.openapitools.models.LocalInventoryItemsGetCreate
import org.openapitools.models.LocalStore
import org.openapitools.models.LocalStoreBatchUpdate
import org.openapitools.models.LocalStoreCreate
import org.openapitools.models.PinterestLibError
import org.openapitools.models.SupplementalItemsBatchResponse

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
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

final case class CatalogSupplementalApiRoutes[
  F[_]: JsonDecoder: Monad, pinterest_oauth2
](delegate: CatalogSupplementalApiDelegate[F, pinterest_oauth2]) extends Http4sDsl[F] {
  object catalogsLocalInventoryItems/post {
    import CatalogSupplementalApiDelegate.catalogsLocalInventoryItems/postResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_inventory_items" / "query" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsLocalInventoryItems/post.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LocalInventoryItemsGetCreate] , catalog_id, ad_account_id, responses)

    }

    val responses: catalogsLocalInventoryItems/postResponses[F] = new catalogsLocalInventoryItems/postResponses[F] {
      def resp200(value: LocalInventoryItemsGet): F[Response[F]] = Ok(value)
      def resp201(value: LocalInventoryItemsGet): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsLocalInventoryItemsBatch/operate {
    import CatalogSupplementalApiDelegate.catalogsLocalInventoryItemsBatch/operateResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_inventory_items" / "batch" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsLocalInventoryItemsBatch/operate.handle_pinterest_oauth2(auth, req, req.asJsonDecode[LocalInventoryItemsBatchCreate] , catalog_id, ad_account_id, responses)

    }

    val responses: catalogsLocalInventoryItemsBatch/operateResponses[F] = new catalogsLocalInventoryItemsBatch/operateResponses[F] {
      def resp200(value: SupplementalItemsBatchResponse): F[Response[F]] = Ok(value)
      def resp201(value: LocalInventoryItemsBatch): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsLocalStores/create {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/createResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ POST -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_stores" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsLocalStores/create.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[LocalStoreCreate]] , catalog_id, ad_account_id, responses)

    }

    val responses: catalogsLocalStores/createResponses[F] = new catalogsLocalStores/createResponses[F] {
      def resp200(value: List[CatalogsLocalStoresCreate200ResponseInner]): F[Response[F]] = Ok(value)
      def resp201(value: List[LocalStore]): F[Response[F]] = Created(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsLocalStores/delete {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/deleteResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object idsQueryParam extends QuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ids")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ DELETE -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_stores" :? idsQueryParam(ids) +& ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsLocalStores/delete.handle_pinterest_oauth2(auth, req, catalog_id, ids, ad_account_id, responses)

    }

    val responses: catalogsLocalStores/deleteResponses[F] = new catalogsLocalStores/deleteResponses[F] {
      def resp200(value: List[CatalogsLocalStoresDelete200ResponseInner]): F[Response[F]] = Ok(value)
      def resp204(): F[Response[F]] = NoContent()
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsLocalStores/list {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/listResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object idsQueryParam extends OptionalQuerySeqParamDecoderMatcher[Refined[String, MatchesRegex["^\\d+$"]]]("ids")
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")
    object bookmarkQueryParam extends OptionalQueryParamDecoderMatcher[String]("bookmark")
    object page_sizeQueryParam extends OptionalQueryParamDecoderMatcher[Refined[Int, GreaterEqual[1] And LessEqual[250]]]("page_size")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_stores" :? idsQueryParam(ids) +& ad_account_idQueryParam(ad_account_id) +& bookmarkQueryParam(bookmark) +& page_sizeQueryParam(page_size)) as auth =>
        delegate.catalogsLocalStores/list.handle_pinterest_oauth2(auth, req, catalog_id, ids, ad_account_id, bookmark, page_size, responses)

    }

    val responses: catalogsLocalStores/listResponses[F] = new catalogsLocalStores/listResponses[F] {
      def resp200(value: CatalogsLocalStoresList200Response): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsLocalStores/update {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/updateResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ PATCH -> Root / "catalogs" / catalog_idVarr(catalog_id) / "local_stores" :? ad_account_idQueryParam(ad_account_id)) as auth =>
          delegate.catalogsLocalStores/update.handle_pinterest_oauth2(auth, req, req.asJsonDecode[List[LocalStoreBatchUpdate]] , catalog_id, ad_account_id, responses)

    }

    val responses: catalogsLocalStores/updateResponses[F] = new catalogsLocalStores/updateResponses[F] {
      def resp200(value: List[CatalogsLocalStoresUpdate200ResponseInner]): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }
  object catalogsSupplementalItemsBatch/get {
    import CatalogSupplementalApiDelegate.catalogsSupplementalItemsBatch/getResponses

    object catalog_idVarr extends RefinedVarr[String, MaxSize[19] And MatchesRegex["^\\d+$"]]
    object batch_idVarr extends RefinedVarr[String, MatchesRegex["^\\d+$"]]
    object ad_account_idQueryParam extends OptionalQueryParamDecoderMatcher[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]]("ad_account_id")

    val routepinterest_oauth2 = AuthedRoutes.of[pinterest_oauth2, F] {
      case (req @ GET -> Root / "catalogs" / catalog_idVarr(catalog_id) / "supplemental_items" / "batch" / batch_idVarr(batch_id) :? ad_account_idQueryParam(ad_account_id)) as auth =>
        delegate.catalogsSupplementalItemsBatch/get.handle_pinterest_oauth2(auth, req, catalog_id, batch_id, ad_account_id, responses)

    }

    val responses: catalogsSupplementalItemsBatch/getResponses[F] = new catalogsSupplementalItemsBatch/getResponses[F] {
      def resp200(value: SupplementalItemsBatchResponse): F[Response[F]] = Ok(value)
      def resp400(value: PinterestLibError): F[Response[F]] = BadRequest(value)
      def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]] = Unauthorized(authenticate, value)
      def resp403(value: PinterestLibError): F[Response[F]] = Forbidden(value)
      def resp404(value: PinterestLibError): F[Response[F]] = NotFound(value)
      def resp429(value: PinterestLibError): F[Response[F]] = TooManyRequests(value)
      def resp200(value: PinterestLibError): F[Response[F]] = Ok(value)
    }
  }

  val routespinterest_oauth2 =
    catalogsLocalInventoryItems/post.routepinterest_oauth2 <+>
    catalogsLocalInventoryItemsBatch/operate.routepinterest_oauth2 <+>
    catalogsLocalStores/create.routepinterest_oauth2 <+>
    catalogsLocalStores/delete.routepinterest_oauth2 <+>
    catalogsLocalStores/list.routepinterest_oauth2 <+>
    catalogsLocalStores/update.routepinterest_oauth2 <+>
    catalogsSupplementalItemsBatch/get.routepinterest_oauth2
}

object CatalogSupplementalApiDelegate {
  trait catalogsLocalInventoryItems/postResponses[F[_]] {
    def resp200(value: LocalInventoryItemsGet): F[Response[F]]
    def resp201(value: LocalInventoryItemsGet): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsLocalInventoryItemsBatch/operateResponses[F[_]] {
    def resp200(value: SupplementalItemsBatchResponse): F[Response[F]]
    def resp201(value: LocalInventoryItemsBatch): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsLocalStores/createResponses[F[_]] {
    def resp200(value: List[CatalogsLocalStoresCreate200ResponseInner]): F[Response[F]]
    def resp201(value: List[LocalStore]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsLocalStores/deleteResponses[F[_]] {
    def resp200(value: List[CatalogsLocalStoresDelete200ResponseInner]): F[Response[F]]
    def resp204(): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsLocalStores/listResponses[F[_]] {
    def resp200(value: CatalogsLocalStoresList200Response): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsLocalStores/updateResponses[F[_]] {
    def resp200(value: List[CatalogsLocalStoresUpdate200ResponseInner]): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

  trait catalogsSupplementalItemsBatch/getResponses[F[_]] {
    def resp200(value: SupplementalItemsBatchResponse): F[Response[F]]
    def resp400(value: PinterestLibError): F[Response[F]]
    def resp401(authenticate: `WWW-Authenticate`, value: PinterestLibError): F[Response[F]]
    def resp403(value: PinterestLibError): F[Response[F]]
    def resp404(value: PinterestLibError): F[Response[F]]
    def resp429(value: PinterestLibError): F[Response[F]]
    def resp200(value: PinterestLibError): F[Response[F]]
  }

}

trait CatalogSupplementalApiDelegate[F[_], pinterest_oauth2] {

  trait catalogsLocalInventoryItems/post {
    import CatalogSupplementalApiDelegate.catalogsLocalInventoryItems/postResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsLocalInventoryItems/post: F[LocalInventoryItemsGetCreate],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsLocalInventoryItems/postResponses[F]
    ): F[Response[F]]


  }
  def catalogsLocalInventoryItems/post: catalogsLocalInventoryItems/post


  trait catalogsLocalInventoryItemsBatch/operate {
    import CatalogSupplementalApiDelegate.catalogsLocalInventoryItemsBatch/operateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsLocalInventoryItemsBatch/operate: F[LocalInventoryItemsBatchCreate],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsLocalInventoryItemsBatch/operateResponses[F]
    ): F[Response[F]]


  }
  def catalogsLocalInventoryItemsBatch/operate: catalogsLocalInventoryItemsBatch/operate


  trait catalogsLocalStores/create {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/createResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsLocalStores/create: F[List[LocalStoreCreate]],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsLocalStores/createResponses[F]
    ): F[Response[F]]


  }
  def catalogsLocalStores/create: catalogsLocalStores/create


  trait catalogsLocalStores/delete {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/deleteResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      ids: List[Refined[String, MatchesRegex["^\\d+$"]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsLocalStores/deleteResponses[F]
    ): F[Response[F]]

  }
  def catalogsLocalStores/delete: catalogsLocalStores/delete


  trait catalogsLocalStores/list {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/listResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      ids: Option[List[Refined[String, MatchesRegex["^\\d+$"]]]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      bookmark: Option[String],
      pageSize: Option[Refined[Int, GreaterEqual[1] And LessEqual[250]]],
      responses: catalogsLocalStores/listResponses[F]
    ): F[Response[F]]

  }
  def catalogsLocalStores/list: catalogsLocalStores/list


  trait catalogsLocalStores/update {
    import CatalogSupplementalApiDelegate.catalogsLocalStores/updateResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogsLocalStores/update: F[List[LocalStoreBatchUpdate]],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsLocalStores/updateResponses[F]
    ): F[Response[F]]


  }
  def catalogsLocalStores/update: catalogsLocalStores/update


  trait catalogsSupplementalItemsBatch/get {
    import CatalogSupplementalApiDelegate.catalogsSupplementalItemsBatch/getResponses


    def handle_pinterest_oauth2(
      auth: pinterest_oauth2,
      req: Request[F],
      catalogId: Refined[String, MaxSize[19] And MatchesRegex["^\\d+$"]],
      batchId: Refined[String, MatchesRegex["^\\d+$"]],
      adAccountId: Option[Refined[String, MaxSize[18] And MatchesRegex["^\\d+$"]]],
      responses: catalogsSupplementalItemsBatch/getResponses[F]
    ): F[Response[F]]

  }
  def catalogsSupplementalItemsBatch/get: catalogsSupplementalItemsBatch/get

}