<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class DeleteBusinessPartnersDelete
{
    /**
     * A list of partner ids to be deleted
     * @DTA\Data(field="partner_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection391::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection391::class})
     */
    public ?\App\DTO\Collection391 $partner_ids = null;

    /**
     * @DTA\Data(field="partner_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NullablePartnerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NullablePartnerType::class})
     */
    public ?\App\DTO\NullablePartnerType $partner_type = null;

}
