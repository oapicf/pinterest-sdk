<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOAccountAddress
{
    /**
     * Address display
     * @DTA\Data(field="display", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $display = null;

    /**
     * Purpose for which the address is used, usually Billing or Businness
     * @DTA\Data(field="purpose", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

    /**
     * Salesforce id for address
     * @DTA\Data(field="address_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $address_id = null;

    /**
     * Legal entity for this insertion order
     * @DTA\Data(field="order_legal_entity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $order_legal_entity = null;

}
