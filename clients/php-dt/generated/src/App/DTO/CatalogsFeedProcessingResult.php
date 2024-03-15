<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsFeedProcessingResult
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
     * @DTA\Data(field="ingestion_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedIngestionDetails::class})
     */
    public ?\App\DTO\CatalogsFeedIngestionDetails $ingestion_details = null;

    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProcessingStatus::class})
     */
    public ?\App\DTO\CatalogsFeedProcessingStatus $status = null;

    /**
     * @DTA\Data(field="product_counts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedProductCounts::class})
     */
    public ?\App\DTO\CatalogsFeedProductCounts $product_counts = null;

    /**
     * @DTA\Data(field="validation_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsFeedValidationDetails::class})
     */
    public ?\App\DTO\CatalogsFeedValidationDetails $validation_details = null;

}
