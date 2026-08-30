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
     * @var string|null
     */
    public $amazon_storefront_id;

    /**
     * The Amazon storefront name
     * @DTA\Data(field="amazon_storefront_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $amazon_storefront_name;

    /**
     * The Amazon storefront url
     * @DTA\Data(field="amazon_storefront_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $amazon_storefront_url;

    /**
     * The Amazon user id
     * @DTA\Data(field="amazon_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $amazon_user_id;

    /**
     * The Amazon account linking status
     * @DTA\Data(field="is_amazon_account_linked")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_amazon_account_linked;

    /**
     * The one time passcode for Pinterest-initiated linking requests
     * @DTA\Data(field="one_time_passcode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $one_time_passcode;

    /**
     * The Pinterest user id for Amazon-initiated linking requests
     * @DTA\Data(field="pinterest_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $pinterest_user_id;

}
