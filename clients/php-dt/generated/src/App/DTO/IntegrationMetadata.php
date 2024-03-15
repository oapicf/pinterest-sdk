<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Integration metadata
 */
class IntegrationMetadata
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
     * @DTA\Data(field="partner_access_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $partner_access_token_expiry = null;

    /**
     * @DTA\Data(field="partner_refresh_token_expiry", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $partner_refresh_token_expiry = null;

    /**
     * @DTA\Data(field="scopes", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $scopes = null;

    /**
     * @DTA\Data(field="created_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $created_timestamp = null;

    /**
     * @DTA\Data(field="updated_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $updated_timestamp = null;

    /**
     * @DTA\Data(field="additional_id_1", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $additional_id_1 = null;

    /**
     * @DTA\Data(field="partner_metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_metadata = null;

}
