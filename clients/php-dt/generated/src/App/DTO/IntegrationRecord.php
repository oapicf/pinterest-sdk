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
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="external_business_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $external_business_id = null;

    /**
     * @DTA\Data(field="connected_merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $connected_merchant_id = null;

    /**
     * @DTA\Data(field="connected_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $connected_user_id = null;

    /**
     * @DTA\Data(field="connected_advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $connected_advertiser_id = null;

    /**
     * @DTA\Data(field="connected_lba_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $connected_lba_id = null;

    /**
     * @DTA\Data(field="connected_tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $connected_tag_id = null;

    /**
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_access_token = null;

    /**
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_refresh_token = null;

    /**
     * @DTA\Data(field="partner_primary_email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_primary_email = null;

    /**
     * @DTA\Data(field="partner_access_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $partner_access_token_expiry = null;

    /**
     * @DTA\Data(field="partner_refresh_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $partner_refresh_token_expiry = null;

    /**
     * @DTA\Data(field="scopes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $scopes = null;

    /**
     * @DTA\Data(field="partner_metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_metadata = null;

    /**
     * @DTA\Data(field="additional_id_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $additional_id_1 = null;

    /**
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
