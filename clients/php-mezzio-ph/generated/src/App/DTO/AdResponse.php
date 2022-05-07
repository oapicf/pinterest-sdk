<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdResponse
{
    /**
     * ID of the ad group that contains the ad.
     * @DTA\Data(field="ad_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
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
     * Ad creative type enum
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
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
     * Pin ID.
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $pin_id;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":TrackingUrls::class})
     * @var TrackingUrls|null
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
     * The ID of the advertiser that this ad belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * ID of the ad campaign that contains this ad.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * Destination URL template for all items within a collections drawer.
     * @DTA\Data(field="collection_items_destination_url_template", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $collection_items_destination_url_template;

    /**
     * Pin creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * The ID of this ad.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejected_reasons", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $rejected_reasons;

    /**
     * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejection_labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $rejection_labels;

    /**
     * Ad review status
     * @DTA\Data(field="review_status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $review_status;

    /**
     * Always \&quot;ad\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

    /**
     * Ad summary status
     * @DTA\Data(field="summary_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":PinPromotionSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":PinPromotionSummaryStatus::class})
     * @var PinPromotionSummaryStatus|null
     */
    public $summary_status;

}
