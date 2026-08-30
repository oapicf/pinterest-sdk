<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A single row in a multi-field customer list (v2 format).
 */
class CustomerListRecordRow
{
    /**
     * Email address (plain or hashed with SHA1, SHA256, or MD5).
     * @DTA\Data(field="email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $email = null;

    /**
     * External ID identifier (not hashed).
     * @DTA\Data(field="external_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $external_id = null;

    /**
     * Hashed phone number (hashed with SHA1, SHA256, or MD5).
     * @DTA\Data(field="hashed_phone_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hashed_phone_number = null;

    /**
     * Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
     * @DTA\Data(field="hashed_pinner_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hashed_pinner_id = null;

    /**
     * IP address (not hashed).
     * @DTA\Data(field="ip_address", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ip_address = null;

    /**
     * LiveRamp envelope identifier (Base64-encoded, not hashed).
     * @DTA\Data(field="liveramp_envelope", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $liveramp_envelope = null;

    /**
     * Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
     * @DTA\Data(field="maid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $maid = null;

    /**
     * User agent string (not hashed).
     * @DTA\Data(field="user_agent", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user_agent = null;

}
