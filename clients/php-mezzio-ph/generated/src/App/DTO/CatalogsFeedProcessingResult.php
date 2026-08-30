<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedProcessingResult
{
    /**
     * @DTA\Data(field="created_at")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * ID of the feed processing result.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="ingestion_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     * @var \App\DTO\CatalogsFeedIngestionDetails|null
     */
    public $ingestion_details;

    /**
     * @DTA\Data(field="product_counts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     * @var \App\DTO\CatalogsFeedProductCounts|null
     */
    public $product_counts;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     * @var \App\DTO\CatalogsFeedProcessingStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="updated_at")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

    /**
     * @DTA\Data(field="validation_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     * @var \App\DTO\CatalogsFeedValidationDetails|null
     */
    public $validation_details;

    /**
     * @DTA\Data(field="video_counts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedVideoCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedVideoCounts::class})
     * @var \App\DTO\CatalogsFeedVideoCounts|null
     */
    public $video_counts;

}
