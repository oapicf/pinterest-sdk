<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * User selection of conversion health criteria for a single feature
 */
class ConversionHealthSelectionItem
{
    /**
     * Status for conversion types
     * @DTA\Data(field="conversionType", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $conversion_type = null;

    /**
     * Status for criteria
     * @DTA\Data(field="criteria", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $criteria = null;

    /**
     * Status for ingestion sources
     * @DTA\Data(field="ingestionSource", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $ingestion_source = null;

    /**
     * Overall status for this selection item
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"mixed"})
     */
    public ?mixed $status = null;

}
