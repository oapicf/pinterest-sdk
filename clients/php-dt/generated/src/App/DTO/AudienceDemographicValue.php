<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Demographic detail for a single audience demographic
 */
class AudienceDemographicValue
{
    /**
     * Unique key for demographic item
     * @DTA\Data(field="key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $key = null;

    /**
     * Display name for demographic
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Value of demographic item as a percent of total audience
     * @DTA\Data(field="ratio", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $ratio = null;

}
