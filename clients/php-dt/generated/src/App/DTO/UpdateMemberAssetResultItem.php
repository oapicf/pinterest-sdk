<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdateMemberAssetResultItem
{
    /**
     * @DTA\Data(field="response", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UsersForIndividualAssetResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UsersForIndividualAssetResponse::class})
     */
    public ?\App\DTO\UsersForIndividualAssetResponse $response = null;

}
