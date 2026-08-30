package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CatalogsFeed;
import com.prokarma.pkmst.model.CatalogsFeedCreateRequestSchema;
import com.prokarma.pkmst.model.CatalogsFeedIngestion;
import com.prokarma.pkmst.model.CatalogsFeedUpdateRequestSchema;
import com.prokarma.pkmst.model.CatalogsItemValidationIssue;
import com.prokarma.pkmst.model.FeedProcessingResultsList200Response;
import com.prokarma.pkmst.model.FeedsList200Response;
import com.prokarma.pkmst.model.ItemsIssuesList200Response;
import java.util.List;
import com.prokarma.pkmst.model.PinterestLibError;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class CatalogFeedsApiController implements CatalogFeedsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CatalogFeedsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<FeedProcessingResultsList200Response> feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed.",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedProcessingResultsList200Response>(objectMapper.readValue("", FeedProcessingResultsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<FeedProcessingResultsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsCreate(@ApiParam(value = "" ,required=true )   @RequestBody CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsDelete(@ApiParam(value = "Unique identifier of a feed.",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsGet(@ApiParam(value = "Unique identifier of a feed.",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeedIngestion> feedsIngest(@ApiParam(value = "Unique identifier of a feed.",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeedIngestion>(objectMapper.readValue("", CatalogsFeedIngestion.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeedIngestion>(HttpStatus.OK);
    }

    public ResponseEntity<FeedsList200Response> feedsList(@ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.")  @RequestParam(value = "catalog_id", required = false) String catalogId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FeedsList200Response>(objectMapper.readValue("", FeedsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<FeedsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CatalogsFeed> feedsUpdate(@ApiParam(value = "Unique identifier of a feed.",required=true ) @PathVariable("feed_id") String feedId,
        @ApiParam(value = "" ,required=true )   @RequestBody CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CatalogsFeed>(objectMapper.readValue("", CatalogsFeed.class), HttpStatus.OK);
        }

        return new ResponseEntity<CatalogsFeed>(HttpStatus.OK);
    }

    public ResponseEntity<ItemsIssuesList200Response> itemsIssuesList(@ApiParam(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).",required=true ) @PathVariable("processing_result_id") String processingResultId,
        @ApiParam(value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")  @RequestParam(value = "item_numbers", required = false) List<Integer> itemNumbers,
        @ApiParam(value = "Filter item validation issues that have a given type of item validation issue.", allowableValues = "AD_IMAGE_0_LINK_LENGTH_TOO_LONG, AD_IMAGE_1_LINK_LENGTH_TOO_LONG, AD_IMAGE_2_LINK_LENGTH_TOO_LONG, AD_IMAGE_3_LINK_LENGTH_TOO_LONG, AD_IMAGE_4_LINK_LENGTH_TOO_LONG, AD_IMAGE_5_LINK_LENGTH_TOO_LONG, AD_IMAGE_6_LINK_LENGTH_TOO_LONG, AD_IMAGE_7_LINK_LENGTH_TOO_LONG, AD_IMAGE_8_LINK_LENGTH_TOO_LONG, AD_IMAGE_9_LINK_LENGTH_TOO_LONG, AD_IMAGE_10_LINK_LENGTH_TOO_LONG, AD_IMAGE_11_LINK_LENGTH_TOO_LONG, AD_IMAGE_12_LINK_LENGTH_TOO_LONG, AD_IMAGE_13_LINK_LENGTH_TOO_LONG, AD_IMAGE_14_LINK_LENGTH_TOO_LONG, AD_IMAGE_15_LINK_LENGTH_TOO_LONG, AD_IMAGE_16_LINK_LENGTH_TOO_LONG, AD_IMAGE_17_LINK_LENGTH_TOO_LONG, AD_IMAGE_18_LINK_LENGTH_TOO_LONG, AD_IMAGE_19_LINK_LENGTH_TOO_LONG, AD_IMAGE_0_LINK_WARNING, AD_IMAGE_1_LINK_WARNING, AD_IMAGE_2_LINK_WARNING, AD_IMAGE_3_LINK_WARNING, AD_IMAGE_4_LINK_WARNING, AD_IMAGE_5_LINK_WARNING, AD_IMAGE_6_LINK_WARNING, AD_IMAGE_7_LINK_WARNING, AD_IMAGE_8_LINK_WARNING, AD_IMAGE_9_LINK_WARNING, AD_IMAGE_10_LINK_WARNING, AD_IMAGE_11_LINK_WARNING, AD_IMAGE_12_LINK_WARNING, AD_IMAGE_13_LINK_WARNING, AD_IMAGE_14_LINK_WARNING, AD_IMAGE_15_LINK_WARNING, AD_IMAGE_16_LINK_WARNING, AD_IMAGE_17_LINK_WARNING, AD_IMAGE_18_LINK_WARNING, AD_IMAGE_19_LINK_WARNING, AD_IMAGE_0_LINK_REQUIRED, AD_IMAGE_1_LINK_REQUIRED, AD_IMAGE_2_LINK_REQUIRED, AD_IMAGE_3_LINK_REQUIRED, AD_IMAGE_4_LINK_REQUIRED, AD_IMAGE_5_LINK_REQUIRED, AD_IMAGE_6_LINK_REQUIRED, AD_IMAGE_7_LINK_REQUIRED, AD_IMAGE_8_LINK_REQUIRED, AD_IMAGE_9_LINK_REQUIRED, AD_IMAGE_10_LINK_REQUIRED, AD_IMAGE_11_LINK_REQUIRED, AD_IMAGE_12_LINK_REQUIRED, AD_IMAGE_13_LINK_REQUIRED, AD_IMAGE_14_LINK_REQUIRED, AD_IMAGE_15_LINK_REQUIRED, AD_IMAGE_16_LINK_REQUIRED, AD_IMAGE_17_LINK_REQUIRED, AD_IMAGE_18_LINK_REQUIRED, AD_IMAGE_19_LINK_REQUIRED, AD_IMAGE_0_TAG_LENGTH_TOO_LONG, AD_IMAGE_1_TAG_LENGTH_TOO_LONG, AD_IMAGE_2_TAG_LENGTH_TOO_LONG, AD_IMAGE_3_TAG_LENGTH_TOO_LONG, AD_IMAGE_4_TAG_LENGTH_TOO_LONG, AD_IMAGE_5_TAG_LENGTH_TOO_LONG, AD_IMAGE_6_TAG_LENGTH_TOO_LONG, AD_IMAGE_7_TAG_LENGTH_TOO_LONG, AD_IMAGE_8_TAG_LENGTH_TOO_LONG, AD_IMAGE_9_TAG_LENGTH_TOO_LONG, AD_IMAGE_10_TAG_LENGTH_TOO_LONG, AD_IMAGE_11_TAG_LENGTH_TOO_LONG, AD_IMAGE_12_TAG_LENGTH_TOO_LONG, AD_IMAGE_13_TAG_LENGTH_TOO_LONG, AD_IMAGE_14_TAG_LENGTH_TOO_LONG, AD_IMAGE_15_TAG_LENGTH_TOO_LONG, AD_IMAGE_16_TAG_LENGTH_TOO_LONG, AD_IMAGE_17_TAG_LENGTH_TOO_LONG, AD_IMAGE_18_TAG_LENGTH_TOO_LONG, AD_IMAGE_19_TAG_LENGTH_TOO_LONG, AD_IMAGE_0_TAG_REQUIRED, AD_IMAGE_1_TAG_REQUIRED, AD_IMAGE_2_TAG_REQUIRED, AD_IMAGE_3_TAG_REQUIRED, AD_IMAGE_4_TAG_REQUIRED, AD_IMAGE_5_TAG_REQUIRED, AD_IMAGE_6_TAG_REQUIRED, AD_IMAGE_7_TAG_REQUIRED, AD_IMAGE_8_TAG_REQUIRED, AD_IMAGE_9_TAG_REQUIRED, AD_IMAGE_10_TAG_REQUIRED, AD_IMAGE_11_TAG_REQUIRED, AD_IMAGE_12_TAG_REQUIRED, AD_IMAGE_13_TAG_REQUIRED, AD_IMAGE_14_TAG_REQUIRED, AD_IMAGE_15_TAG_REQUIRED, AD_IMAGE_16_TAG_REQUIRED, AD_IMAGE_17_TAG_REQUIRED, AD_IMAGE_18_TAG_REQUIRED, AD_IMAGE_19_TAG_REQUIRED, AD_IMAGE_0_LINK_DUPLICATED, AD_IMAGE_1_LINK_DUPLICATED, AD_IMAGE_2_LINK_DUPLICATED, AD_IMAGE_3_LINK_DUPLICATED, AD_IMAGE_4_LINK_DUPLICATED, AD_IMAGE_5_LINK_DUPLICATED, AD_IMAGE_6_LINK_DUPLICATED, AD_IMAGE_7_LINK_DUPLICATED, AD_IMAGE_8_LINK_DUPLICATED, AD_IMAGE_9_LINK_DUPLICATED, AD_IMAGE_10_LINK_DUPLICATED, AD_IMAGE_11_LINK_DUPLICATED, AD_IMAGE_12_LINK_DUPLICATED, AD_IMAGE_13_LINK_DUPLICATED, AD_IMAGE_14_LINK_DUPLICATED, AD_IMAGE_15_LINK_DUPLICATED, AD_IMAGE_16_LINK_DUPLICATED, AD_IMAGE_17_LINK_DUPLICATED, AD_IMAGE_18_LINK_DUPLICATED, AD_IMAGE_19_LINK_DUPLICATED, AD_IMAGE_0_TAG_DUPLICATED, AD_IMAGE_1_TAG_DUPLICATED, AD_IMAGE_2_TAG_DUPLICATED, AD_IMAGE_3_TAG_DUPLICATED, AD_IMAGE_4_TAG_DUPLICATED, AD_IMAGE_5_TAG_DUPLICATED, AD_IMAGE_6_TAG_DUPLICATED, AD_IMAGE_7_TAG_DUPLICATED, AD_IMAGE_8_TAG_DUPLICATED, AD_IMAGE_9_TAG_DUPLICATED, AD_IMAGE_10_TAG_DUPLICATED, AD_IMAGE_11_TAG_DUPLICATED, AD_IMAGE_12_TAG_DUPLICATED, AD_IMAGE_13_TAG_DUPLICATED, AD_IMAGE_14_TAG_DUPLICATED, AD_IMAGE_15_TAG_DUPLICATED, AD_IMAGE_16_TAG_DUPLICATED, AD_IMAGE_17_TAG_DUPLICATED, AD_IMAGE_18_TAG_DUPLICATED, AD_IMAGE_19_TAG_DUPLICATED, AD_VIDEO_0_LINK_LENGTH_TOO_LONG, AD_VIDEO_1_LINK_LENGTH_TOO_LONG, AD_VIDEO_2_LINK_LENGTH_TOO_LONG, AD_VIDEO_0_LINK_WARNING, AD_VIDEO_1_LINK_WARNING, AD_VIDEO_2_LINK_WARNING, AD_VIDEO_0_LINK_REQUIRED, AD_VIDEO_1_LINK_REQUIRED, AD_VIDEO_2_LINK_REQUIRED, AD_VIDEO_0_LINK_DUPLICATED, AD_VIDEO_1_LINK_DUPLICATED, AD_VIDEO_2_LINK_DUPLICATED, AD_VIDEO_0_TAG_LENGTH_TOO_LONG, AD_VIDEO_1_TAG_LENGTH_TOO_LONG, AD_VIDEO_2_TAG_LENGTH_TOO_LONG, AD_VIDEO_0_TAG_REQUIRED, AD_VIDEO_1_TAG_REQUIRED, AD_VIDEO_2_TAG_REQUIRED, AD_VIDEO_0_TAG_DUPLICATED, AD_VIDEO_1_TAG_DUPLICATED, AD_VIDEO_2_TAG_DUPLICATED, VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID")  @RequestParam(value = "item_validation_issue", required = false) CatalogsItemValidationIssue itemValidationIssue,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ItemsIssuesList200Response>(objectMapper.readValue("", ItemsIssuesList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<ItemsIssuesList200Response>(HttpStatus.OK);
    }

}
