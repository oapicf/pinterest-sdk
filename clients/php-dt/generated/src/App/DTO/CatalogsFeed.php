<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Catalogs Feed object
 */
class CatalogsFeed
{
    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="updated_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

    /**
     * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="format")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFormat::class})
     */
    public ?\App\DTO\CatalogsFormat $format = null;

    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     */
    public ?\App\DTO\CatalogsType $catalog_type = null;

    /**
     * @DTA\Data(field="credentials")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedCredentials::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedCredentials::class})
     */
    public ?\App\DTO\CatalogsFeedCredentials $credentials = null;

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @DTA\Data(field="location")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(field="preferred_processing_schedule")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProcessingSchedule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProcessingSchedule::class})
     */
    public ?\App\DTO\CatalogsFeedProcessingSchedule $preferred_processing_schedule = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsStatus::class})
     */
    public ?\App\DTO\CatalogsStatus $status = null;

    /**
     * @DTA\Data(field="default_currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableCurrency::class})
     */
    public ?\App\DTO\NullableCurrency $default_currency = null;

    /**
     * The locale used within a feed for product descriptions.
     * @DTA\Data(field="default_locale")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $default_locale = null;

    /**
     * @DTA\Data(field="default_country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $default_country = null;

    /**
     * @DTA\Data(field="default_availability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductAvailabilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductAvailabilityType::class})
     */
    public ?\App\DTO\ProductAvailabilityType $default_availability = null;

    /**
     * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

}
