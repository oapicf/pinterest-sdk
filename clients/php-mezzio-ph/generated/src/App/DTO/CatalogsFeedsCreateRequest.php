<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
class CatalogsFeedsCreateRequest
{
    /**
     * @DTA\Data(field="default_currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullableCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullableCurrency::class})
     * @var \App\DTO\NullableCurrency|null
     */
    public $default_currency;

    /**
     * A human-friendly name associated to a given feed.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="format")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFormat::class})
     * @var \App\DTO\CatalogsFormat|null
     */
    public $format;

    /**
     * @DTA\Data(field="default_locale", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedsCreateRequestDefaultLocale::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedsCreateRequestDefaultLocale::class})
     * @var \App\DTO\CatalogsFeedsCreateRequestDefaultLocale|null
     */
    public $default_locale;

    /**
     * @DTA\Data(field="credentials", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedCredentials::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedCredentials::class})
     * @var \App\DTO\CatalogsFeedCredentials|null
     */
    public $credentials;

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @DTA\Data(field="location")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(http|https|ftp|sftp):\/\//"})
     * @var string|null
     */
    public $location;

    /**
     * @DTA\Data(field="preferred_processing_schedule", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProcessingSchedule::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProcessingSchedule::class})
     * @var \App\DTO\CatalogsFeedProcessingSchedule|null
     */
    public $preferred_processing_schedule;

    /**
     * @DTA\Data(field="default_country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $default_country;

    /**
     * @DTA\Data(field="default_availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductAvailabilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductAvailabilityType::class})
     * @var \App\DTO\ProductAvailabilityType|null
     */
    public $default_availability;

}
