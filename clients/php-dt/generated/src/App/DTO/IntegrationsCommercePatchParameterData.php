<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for integrations_commerce/patch
 */
class IntegrationsCommercePatchParameterData
{
    /**
     * External business ID for the integration.
     * @DTA\Data(subset="path", field="external_business_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $external_business_id = null;

}
