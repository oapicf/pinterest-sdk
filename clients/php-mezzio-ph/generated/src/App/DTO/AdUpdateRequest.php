<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdUpdateRequest
{
    /**
     * ID of the ad group that contains the ad.
     * @DTA\Data(field="ad_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $android_deep_link;

    /**
     * Comma-separated deep links for the carousel pin on Android.
     * @DTA\Data(field="carousel_android_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $carousel_android_deep_links;

    /**
     * Comma-separated destination URLs for the carousel pin to promote.
     * @DTA\Data(field="carousel_destination_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $carousel_destination_urls;

    /**
     * Comma-separated deep links for the carousel pin on iOS.
     * @DTA\Data(field="carousel_ios_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $carousel_ios_deep_links;

    /**
     * Tracking url for the ad clicks.
     * @DTA\Data(field="click_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $click_tracking_url;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

    /**
     * Destination URL.
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $destination_url;

    /**
     * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ios_deep_link;

    /**
     * Is original pin deleted?
     * @DTA\Data(field="is_pin_deleted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_pin_deleted;

    /**
     * Is pin repinnable?
     * @DTA\Data(field="is_removable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_removable;

    /**
     * Name of the ad - 255 chars max.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     * @var \App\DTO\AdCommonTrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Tracking URL for ad impressions.
     * @DTA\Data(field="view_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $view_tracking_url;

    /**
     * Lead form ID for lead ad generation.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $lead_form_id;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     * @var \App\DTO\GridClickType|null
     */
    public $grid_click_type;

    /**
     * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $customizable_cta_type;

    /**
     * @DTA\Data(field="quiz_pin_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCommonQuizPinData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCommonQuizPinData::class})
     * @var \App\DTO\AdCommonQuizPinData|null
     */
    public $quiz_pin_data;

    /**
     * The ID of this ad.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Pin ID. This field may only be updated for draft ads.
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $pin_id;

}
