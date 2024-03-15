<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Integration record
 */
class IntegrationRecord
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="external_business_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $external_business_id;

    /**
     * @DTA\Data(field="connected_merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $connected_merchant_id;

    /**
     * @DTA\Data(field="connected_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $connected_user_id;

    /**
     * @DTA\Data(field="connected_advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $connected_advertiser_id;

    /**
     * @DTA\Data(field="connected_lba_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $connected_lba_id;

    /**
     * @DTA\Data(field="connected_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $connected_tag_id;

    /**
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_access_token;

    /**
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_refresh_token;

    /**
     * @DTA\Data(field="partner_primary_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_primary_email;

    /**
     * @DTA\Data(field="partner_access_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $partner_access_token_expiry;

    /**
     * @DTA\Data(field="partner_refresh_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $partner_refresh_token_expiry;

    /**
     * @DTA\Data(field="scopes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $scopes;

    /**
     * @DTA\Data(field="partner_metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_metadata;

    /**
     * @DTA\Data(field="additional_id_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $additional_id_1;

    /**
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time;

}
