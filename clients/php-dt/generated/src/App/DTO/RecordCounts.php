<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RecordCounts
{
    /**
     * Number of invalid records processed
     * @DTA\Data(field="invalid")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $invalid = null;

    /**
     * Number of records processed
     * @DTA\Data(field="processed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $processed = null;

    /**
     * Number of valid records processed
     * @DTA\Data(field="valid")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $valid = null;

}
