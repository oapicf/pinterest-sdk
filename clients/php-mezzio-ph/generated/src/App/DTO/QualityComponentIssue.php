<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of an issue with a quality component.
 */
class QualityComponentIssue
{
    /**
     * Unique identifier for the issue check.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Human-readable name of the issue.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Detailed reason for the issue.
     * @DTA\Data(field="reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $reason;

}
