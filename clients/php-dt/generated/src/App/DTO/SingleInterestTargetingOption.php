<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SingleInterestTargetingOption
{
    /**
     * @DTA\Data(field="child_interests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection455::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection455::class})
     */
    public ?\App\DTO\Collection455 $child_interests = null;

    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $level = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
