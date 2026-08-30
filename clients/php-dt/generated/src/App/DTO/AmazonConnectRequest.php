<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
class AmazonConnectRequest
{
    /**
     * The Amazon storefront id
     * @DTA\Data(field="amazon_storefront_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $amazon_storefront_id = null;

    /**
     * The Amazon storefront name
     * @DTA\Data(field="amazon_storefront_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $amazon_storefront_name = null;

    /**
     * The Amazon storefront url
     * @DTA\Data(field="amazon_storefront_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $amazon_storefront_url = null;

    /**
     * The Amazon user id
     * @DTA\Data(field="amazon_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $amazon_user_id = null;

    /**
     * The Amazon account linking status
     * @DTA\Data(field="is_amazon_account_linked")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_amazon_account_linked = null;

    /**
     * The one time passcode for Pinterest-initiated linking requests
     * @DTA\Data(field="one_time_passcode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $one_time_passcode = null;

    /**
     * The Pinterest user id for Amazon-initiated linking requests
     * @DTA\Data(field="pinterest_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pinterest_user_id = null;

}
