<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOAccountItem
{
    /**
     * Salesforce id for billto_info
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * Salesforce id for IO Terms and Conditions
     * @DTA\Data(field="io_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $io_terms_id;

    /**
     * Salesforce text for IO Terms and Conditions
     * @DTA\Data(field="io_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $io_terms;

    /**
     * Salesforce id for US Terms and Conditions
     * @DTA\Data(field="us_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $us_terms_id;

    /**
     * Salesforce text for US Terms and Conditions
     * @DTA\Data(field="us_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $us_terms;

    /**
     * Salesforce id for Rest of the World Terms and Conditions
     * @DTA\Data(field="row_terms_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $row_terms_id;

    /**
     * Salesforce text for Rest of the World Terms and Conditions
     * @DTA\Data(field="row_terms", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $row_terms;

    /**
     * Insertion Order Type - Pinterest Paper or Agency Paper
     * @DTA\Data(field="io_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $io_type;

    /**
     * Address information that is associated with this account.
     * @DTA\Data(field="addresses", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection131::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection131::class})
     * @var \App\DTO\Collection131|null
     */
    public $addresses;

}
