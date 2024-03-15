<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdResponse
{
    /**
     * ID of the ad group that contains the ad.
     * @DTA\Data(field="ad_group_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $android_deep_link = null;

    /**
     * Comma-separated deep links for the carousel pin on Android.
     * @DTA\Data(field="carousel_android_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $carousel_android_deep_links = null;

    /**
     * Comma-separated destination URLs for the carousel pin to promote.
     * @DTA\Data(field="carousel_destination_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $carousel_destination_urls = null;

    /**
     * Comma-separated deep links for the carousel pin on iOS.
     * @DTA\Data(field="carousel_ios_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $carousel_ios_deep_links = null;

    /**
     * Tracking url for the ad clicks.
     * @DTA\Data(field="click_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $click_tracking_url = null;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

    /**
     * Destination URL.
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $destination_url = null;

    /**
     * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ios_deep_link = null;

    /**
     * Is original pin deleted?
     * @DTA\Data(field="is_pin_deleted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_pin_deleted = null;

    /**
     * Is pin repinnable?
     * @DTA\Data(field="is_removable", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_removable = null;

    /**
     * Name of the ad - 255 chars max.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCommonTrackingUrls::class})
     */
    public ?\App\DTO\AdCommonTrackingUrls $tracking_urls = null;

    /**
     * Tracking URL for ad impressions.
     * @DTA\Data(field="view_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $view_tracking_url = null;

    /**
     * Lead form ID for lead ad generation.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $lead_form_id = null;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     */
    public ?\App\DTO\GridClickType $grid_click_type = null;

    /**
     * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $customizable_cta_type = null;

    /**
     * @DTA\Data(field="quiz_pin_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCommonQuizPinData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCommonQuizPinData::class})
     */
    public ?\App\DTO\AdCommonQuizPinData $quiz_pin_data = null;

    /**
     * Pin ID.
     * @DTA\Data(field="pin_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pin_id = null;

    /**
     * The ID of the advertiser that this ad belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * ID of the ad campaign that contains this ad.
     * @DTA\Data(field="campaign_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $campaign_id = null;

    /**
     * Destination URL template for all items within a collections drawer.
     * @DTA\Data(field="collection_items_destination_url_template", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $collection_items_destination_url_template = null;

    /**
     * Pin creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * The ID of this ad.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejected_reasons", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $rejected_reasons = null;

    /**
     * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
     * @DTA\Data(field="rejection_labels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $rejection_labels = null;

    /**
     * Ad review status
     * @DTA\Data(field="review_status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $review_status = null;

    /**
     * Always \&quot;ad\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

    /**
     * Ad summary status
     * @DTA\Data(field="summary_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PinPromotionSummaryStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PinPromotionSummaryStatus::class})
     */
    public ?\App\DTO\PinPromotionSummaryStatus $summary_status = null;

}
