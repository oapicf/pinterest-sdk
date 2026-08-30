<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Ad
{
    /**
     * The ID of the advertiser that this ad belongs to.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * ID of the ad group that contains the ad.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $ad_group_id;

    /**
     * Deep link URL for Android devices.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $android_deep_link;

    /**
     * ID of the ad campaign that contains this ad.
     * @DTA\Data(field="campaign_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $campaign_id;

    /**
     * Comma-separated deep links for the carousel pin on Android.
     * @DTA\Data(field="carousel_android_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     * @var \App\DTO\Collection52|null
     */
    public $carousel_android_deep_links;

    /**
     * Comma-separated destination URLs for the carousel pin to promote.
     * @DTA\Data(field="carousel_destination_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     * @var \App\DTO\Collection53|null
     */
    public $carousel_destination_urls;

    /**
     * Comma-separated deep links for the carousel pin on iOS.
     * @DTA\Data(field="carousel_ios_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     * @var \App\DTO\Collection54|null
     */
    public $carousel_ios_deep_links;

    /**
     * The vendor platform type of the carting/WTB ad.
     * @DTA\Data(field="carting_platform_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var int|null
     */
    public $carting_platform_type;

    /**
     * Array of carting/WTB products for the ad.
     * @DTA\Data(field="carting_products", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     * @var \App\DTO\Collection56|null
     */
    public $carting_products;

    /**
     * Tracking url for the ad clicks.
     * @DTA\Data(field="click_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $click_tracking_url;

    /**
     * Destination URL template for all items within a collections drawer.
     * @DTA\Data(field="collection_items_destination_url_template", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $collection_items_destination_url_template;

    /**
     * @DTA\Data(field="collections_header_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCollectionsHeaderType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCollectionsHeaderType::class})
     * @var \App\DTO\AdCollectionsHeaderType|null
     */
    public $collections_header_type;

    /**
     * Pin creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * @DTA\Data(field="creative_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

    /**
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CustomizableCTAType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CustomizableCTAType::class})
     * @var \App\DTO\CustomizableCTAType|null
     */
    public $customizable_cta_type;

    /**
     * Destination URL.
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $destination_url;

    /**
     * @DTA\Data(field="disclosure_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DisclosureType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DisclosureType::class})
     * @var \App\DTO\DisclosureType|null
     */
    public $disclosure_type;

    /**
     * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
     * @DTA\Data(field="disclosure_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $disclosure_url;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     * @var \App\DTO\GridClickType|null
     */
    public $grid_click_type;

    /**
     * The ID of this ad.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":18})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Deep link URL for iOS devices.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ios_deep_link;

    /**
     * Is the ad a carting/WTB ad?
     * @DTA\Data(field="is_carting", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_carting;

    /**
     * Whether the advertiser has accepted the terms and conditions for collage ad.
     * @DTA\Data(field="is_collage_accepted_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_collage_accepted_terms;

    /**
     * Whether the collage ad has a single destination url override.
     * @DTA\Data(field="is_collage_single_destination", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_collage_single_destination;

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
     * Lead form ID for lead ad generation.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(AG)?\\d+$/"})
     * @var string|null
     */
    public $lead_form_id;

    /**
     * Name of the ad - 255 chars max.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Pin ID. This field may only be updated for draft ads.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $pin_id;

    /**
     * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @DTA\Data(field="quiz_pin_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuizPinData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuizPinData::class})
     * @var \App\DTO\QuizPinData|null
     */
    public $quiz_pin_data;

    /**
     * Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejected_reasons")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     * @var \App\DTO\Collection57|null
     */
    public $rejected_reasons;

    /**
     * Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejection_labels")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     * @var \App\DTO\Collection58|null
     */
    public $rejection_labels;

    /**
     * Ad review status
     * @DTA\Data(field="review_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdReviewStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdReviewStatus::class})
     * @var \App\DTO\AdReviewStatus|null
     */
    public $review_status;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     * @var \App\DTO\EntityStatus|null
     */
    public $status;

    /**
     * Ad summary status
     * @DTA\Data(field="summary_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinPromotionSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinPromotionSummaryStatus::class})
     * @var \App\DTO\PinPromotionSummaryStatus|null
     */
    public $summary_status;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrackingUrls::class})
     * @var \App\DTO\TrackingUrls|null
     */
    public $tracking_urls;

    /**
     * Always \&quot;ad\&quot;.
     * @DTA\Data(field="type")
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
     * Tracking URL for ad impressions.
     * @DTA\Data(field="view_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $view_tracking_url;

}
