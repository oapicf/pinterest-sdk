<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */
class PinMediaSourcePinURL
{
    /**
     * @DTA\Data(field="source_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source_type;

    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @DTA\Data(field="is_affiliate_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_affiliate_link;

}
