package org.openapitools.api

import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedsCreateRequest
import org.openapitools.model.CatalogsFeedsUpdateRequest
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchRequest
import org.openapitools.model.CatalogsProductGroup
import org.openapitools.model.CatalogsProductGroupCreateRequest
import org.openapitools.model.CatalogsProductGroupUpdateRequest
import org.openapitools.model.Error
import org.openapitools.model.Paginated
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v5}")
class CatalogsApiController() {


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/product_groups"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsCreate( @Valid @RequestBody catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest
): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/catalogs/product_groups/{product_group_id}"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsDelete(@Pattern(regexp="^\\d+$")  @PathVariable("product_group_id") productGroupId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/product_groups"],
        produces = ["application/json"]
    )
    fun catalogsProductGroupsList(@NotNull @Pattern(regexp="^\\d+$")  @RequestParam(value = "feed_id", required = true) feedId: kotlin.String
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/catalogs/product_groups/{product_group_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun catalogsProductGroupsUpdate(@Pattern(regexp="^\\d+$")  @PathVariable("product_group_id") productGroupId: kotlin.String
, @Valid @RequestBody catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest
): ResponseEntity<CatalogsProductGroup> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds/{feed_id}/processing_results"],
        produces = ["application/json"]
    )
    fun feedProcessingResultsList(@Pattern(regexp="^\\d+$")  @PathVariable("feed_id") feedId: kotlin.String
, @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/feeds"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsCreate( @Valid @RequestBody catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest
): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.DELETE],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"]
    )
    fun feedsDelete(@Pattern(regexp="^\\d+$")  @PathVariable("feed_id") feedId: kotlin.String
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"]
    )
    fun feedsGet(@Pattern(regexp="^\\d+$")  @PathVariable("feed_id") feedId: kotlin.String
): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/feeds"],
        produces = ["application/json"]
    )
    fun feedsList( @RequestParam(value = "bookmark", required = false) bookmark: kotlin.String?
,@Min(1) @Max(100)  @RequestParam(value = "page_size", required = false, defaultValue="25") pageSize: kotlin.Int
): ResponseEntity<Paginated> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.PATCH],
        value = ["/catalogs/feeds/{feed_id}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun feedsUpdate(@Pattern(regexp="^\\d+$")  @PathVariable("feed_id") feedId: kotlin.String
, @Valid @RequestBody catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest
): ResponseEntity<CatalogsFeed> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/items/batch/{batch_id}"],
        produces = ["application/json"]
    )
    fun itemsBatchGet( @PathVariable("batch_id") batchId: kotlin.String
): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/catalogs/items/batch"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun itemsBatchPost( @Valid @RequestBody catalogsItemsBatchRequest: CatalogsItemsBatchRequest
): ResponseEntity<CatalogsItemsBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/catalogs/items"],
        produces = ["application/json"]
    )
    fun itemsGet(@NotNull  @RequestParam(value = "country", required = true) country: kotlin.String
,@NotNull  @RequestParam(value = "item_ids", required = true) itemIds: kotlin.collections.List<kotlin.String>
,@NotNull  @RequestParam(value = "language", required = true) language: kotlin.String
): ResponseEntity<CatalogsItems> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
