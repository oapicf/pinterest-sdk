<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] in BETA. For update, only draft campaigns may update objective type.
 */
class ObjectiveType
{
}
