<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for terms_of_service/get
 */
class TermsOfServiceGetQueryData
{
    /**
     * Return HTML in TOS text.
     * @DTA\Data(field="include_html", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $include_html;

    /**
     * Request type.
     * @DTA\Data(field="tos_type", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $tos_type;

}
