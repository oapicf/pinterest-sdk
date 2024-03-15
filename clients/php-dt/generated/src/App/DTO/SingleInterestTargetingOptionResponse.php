<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SingleInterestTargetingOptionResponse
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/\d+/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="child_interests", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection154::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection154::class})
     */
    public ?\App\DTO\Collection154 $child_interests = null;

    /**
     * @DTA\Data(field="level", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $level = null;

}
