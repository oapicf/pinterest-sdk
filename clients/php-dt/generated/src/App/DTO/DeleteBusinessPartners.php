<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DeleteBusinessPartners
{
    /**
     * @DTA\Data(field="deleted_partners", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection392::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection392::class})
     */
    public ?\App\DTO\Collection392 $deleted_partners = null;

}
