<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedProcessingResultFields
{
    /**
     * @DTA\Data(field="ingestion_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     * @var \App\DTO\CatalogsFeedIngestionDetails|null
     */
    public $ingestion_details;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     * @var \App\DTO\CatalogsFeedProcessingStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="product_counts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     * @var \App\DTO\CatalogsFeedProductCounts|null
     */
    public $product_counts;

    /**
     * @DTA\Data(field="validation_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     * @var \App\DTO\CatalogsFeedValidationDetails|null
     */
    public $validation_details;

}
