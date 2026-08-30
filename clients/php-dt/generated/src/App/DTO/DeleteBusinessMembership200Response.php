<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DeleteBusinessMembership200Response
{
    /**
     * @DTA\Data(field="deleted_members", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection381::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection381::class})
     */
    public ?\App\DTO\Collection381 $deleted_members = null;

}
