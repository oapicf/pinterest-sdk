<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AudienceCategory
{
    /**
     * Interest unique key (same as ID).
     * @DTA\Data(field="key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $key;

    /**
     * Interest name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Interest&#39;s percent of category&#39;s total audience.
     * @DTA\Data(field="ratio", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $ratio;

    /**
     * Interest affinity index.
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $index;

    /**
     * Interest ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Subcategory interest distribution
     * @DTA\Data(field="subcategories", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection48::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection48::class})
     * @var \App\DTO\Collection48|null
     */
    public $subcategories;

}
