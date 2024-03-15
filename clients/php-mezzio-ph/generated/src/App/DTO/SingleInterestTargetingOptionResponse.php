<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SingleInterestTargetingOptionResponse
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/\\d+/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="child_interests", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection154::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection154::class})
     * @var \App\DTO\Collection154|null
     */
    public $child_interests;

    /**
     * @DTA\Data(field="level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $level;

}
