<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Salesforce address information.
 */
class SSIOAccountAddress
{
    /**
     * Salesforce id for address
     * @DTA\Data(field="address_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $address_id;

    /**
     * Address display
     * @DTA\Data(field="display", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $display;

    /**
     * Legal entity for this insertion order
     * @DTA\Data(field="order_legal_entity", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $order_legal_entity;

    /**
     * Purpose for which the address is used, usually Billing or Businness
     * @DTA\Data(field="purpose", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $purpose;

}
