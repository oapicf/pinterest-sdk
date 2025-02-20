<?php
/**
 * Currency
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the Currency model.
 *
 * Currency Codes from ISO 4217
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum Currency: string
{
        case UNK = "UNK";
        case USD = "USD";
        case GBP = "GBP";
        case CAD = "CAD";
        case EUR = "EUR";
        case AUD = "AUD";
        case NZD = "NZD";
        case SEK = "SEK";
        case ILS = "ILS";
        case CHF = "CHF";
        case HKD = "HKD";
        case JPY = "JPY";
        case SGD = "SGD";
        case KRW = "KRW";
        case NOK = "NOK";
        case DKK = "DKK";
        case PLN = "PLN";
        case RON = "RON";
        case HUF = "HUF";
        case CZK = "CZK";
        case BRL = "BRL";
        case MXN = "MXN";
        case ARS = "ARS";
        case CLP = "CLP";
        case COP = "COP";
        case INR = "INR";
        case _TRY = "TRY";
}



