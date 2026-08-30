<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class AdCreate
{
    /**
     * ID of the ad group that contains the ad.
     * @DTA\Data(field="ad_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $ad_group_id = null;

    /**
     * Deep link URL for Android devices.
     * @DTA\Data(field="android_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $android_deep_link = null;

    /**
     * Comma-separated deep links for the carousel pin on Android.
     * @DTA\Data(field="carousel_android_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     */
    public ?\App\DTO\Collection65 $carousel_android_deep_links = null;

    /**
     * Comma-separated destination URLs for the carousel pin to promote.
     * @DTA\Data(field="carousel_destination_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection66::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection66::class})
     */
    public ?\App\DTO\Collection66 $carousel_destination_urls = null;

    /**
     * Comma-separated deep links for the carousel pin on iOS.
     * @DTA\Data(field="carousel_ios_deep_links", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     */
    public ?\App\DTO\Collection67 $carousel_ios_deep_links = null;

    /**
     * Tracking url for the ad clicks.
     * @DTA\Data(field="click_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $click_tracking_url = null;

    /**
     * Destination URL template for all items within a collections drawer.
     * @DTA\Data(field="collection_items_destination_url_template", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $collection_items_destination_url_template = null;

    /**
     * @DTA\Data(field="collections_header_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCollectionsHeaderType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCollectionsHeaderType::class})
     */
    public ?\App\DTO\AdCollectionsHeaderType $collections_header_type = null;

    /**
     * @DTA\Data(field="creative_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

    /**
     * @DTA\Data(field="customizable_cta_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CustomizableCTAType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CustomizableCTAType::class})
     */
    public ?\App\DTO\CustomizableCTAType $customizable_cta_type = null;

    /**
     * Destination URL.
     * @DTA\Data(field="destination_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $destination_url = null;

    /**
     * @DTA\Data(field="disclosure_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DisclosureType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DisclosureType::class})
     */
    public ?\App\DTO\DisclosureType $disclosure_type = null;

    /**
     * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
     * @DTA\Data(field="disclosure_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $disclosure_url = null;

    /**
     * @DTA\Data(field="grid_click_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GridClickType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GridClickType::class})
     */
    public ?\App\DTO\GridClickType $grid_click_type = null;

    /**
     * Deep link URL for iOS devices.
     * @DTA\Data(field="ios_deep_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ios_deep_link = null;

    /**
     * Is the ad a carting/WTB ad?
     * @DTA\Data(field="is_carting", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_carting = null;

    /**
     * Whether the advertiser has accepted the terms and conditions for collage ad.
     * @DTA\Data(field="is_collage_accepted_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_collage_accepted_terms = null;

    /**
     * Whether the collage ad has a single destination url override.
     * @DTA\Data(field="is_collage_single_destination", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_collage_single_destination = null;

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
     * Lead form ID for lead ad generation.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(AG)?\d+$/"})
     */
    public ?string $lead_form_id = null;

    /**
     * Name of the ad - 255 chars max.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Pin ID. This field may only be updated for draft ads.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pin_id = null;

    /**
     * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @DTA\Data(field="quiz_pin_data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuizPinData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuizPinData::class})
     */
    public ?\App\DTO\QuizPinData $quiz_pin_data = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EntityStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EntityStatus::class})
     */
    public ?\App\DTO\EntityStatus $status = null;

    /**
     * @DTA\Data(field="tracking_urls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TrackingUrls::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TrackingUrls::class})
     */
    public ?\App\DTO\TrackingUrls $tracking_urls = null;

    /**
     * Tracking URL for ad impressions.
     * @DTA\Data(field="view_tracking_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $view_tracking_url = null;

}
