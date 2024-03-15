<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsDbItem
{
    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="updated_at", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

}
