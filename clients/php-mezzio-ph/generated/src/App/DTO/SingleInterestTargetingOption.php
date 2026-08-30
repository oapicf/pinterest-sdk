<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SingleInterestTargetingOption
{
    /**
     * @DTA\Data(field="child_interests")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection455::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection455::class})
     * @var \App\DTO\Collection455|null
     */
    public $child_interests;

    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $level;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
