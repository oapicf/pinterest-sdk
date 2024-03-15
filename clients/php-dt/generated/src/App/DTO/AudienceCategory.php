<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AudienceCategory
{
    /**
     * Interest unique key (same as ID).
     * @DTA\Data(field="key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $key = null;

    /**
     * Interest name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Interest&#39;s percent of category&#39;s total audience.
     * @DTA\Data(field="ratio", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $ratio = null;

    /**
     * Interest affinity index.
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $index = null;

    /**
     * Interest ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Subcategory interest distribution
     * @DTA\Data(field="subcategories", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection48::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection48::class})
     */
    public ?\App\DTO\Collection48 $subcategories = null;

}
