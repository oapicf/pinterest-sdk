<?php
/**
 * Country
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
 * The version of the OpenAPI document: 5.12.0
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
 * Class representing the Country model.
 *
 * Country ID from ISO 3166-1 alpha-2.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
enum Country: string
{
        case AD = "AD";
        case AE = "AE";
        case AF = "AF";
        case AG = "AG";
        case AI = "AI";
        case AL = "AL";
        case AM = "AM";
        case AO = "AO";
        case AQ = "AQ";
        case AR = "AR";
        case _AS = "AS";
        case AT = "AT";
        case AU = "AU";
        case AW = "AW";
        case AX = "AX";
        case AZ = "AZ";
        case BA = "BA";
        case BB = "BB";
        case BD = "BD";
        case BE = "BE";
        case BF = "BF";
        case BG = "BG";
        case BH = "BH";
        case BI = "BI";
        case BJ = "BJ";
        case BL = "BL";
        case BM = "BM";
        case BN = "BN";
        case BO = "BO";
        case BQ = "BQ";
        case BR = "BR";
        case BS = "BS";
        case BT = "BT";
        case BV = "BV";
        case BW = "BW";
        case BY = "BY";
        case BZ = "BZ";
        case CA = "CA";
        case CC = "CC";
        case CD = "CD";
        case CF = "CF";
        case CG = "CG";
        case CH = "CH";
        case CI = "CI";
        case CK = "CK";
        case CL = "CL";
        case CM = "CM";
        case CN = "CN";
        case CO = "CO";
        case CR = "CR";
        case CU = "CU";
        case CV = "CV";
        case CW = "CW";
        case CX = "CX";
        case CY = "CY";
        case CZ = "CZ";
        case DE = "DE";
        case DJ = "DJ";
        case DK = "DK";
        case DM = "DM";
        case _DO = "DO";
        case DZ = "DZ";
        case EC = "EC";
        case EE = "EE";
        case EG = "EG";
        case EH = "EH";
        case ER = "ER";
        case ES = "ES";
        case ET = "ET";
        case FI = "FI";
        case FJ = "FJ";
        case FK = "FK";
        case FM = "FM";
        case FO = "FO";
        case FR = "FR";
        case GA = "GA";
        case GB = "GB";
        case GD = "GD";
        case GE = "GE";
        case GF = "GF";
        case GG = "GG";
        case GH = "GH";
        case GI = "GI";
        case GL = "GL";
        case GM = "GM";
        case GN = "GN";
        case GP = "GP";
        case GQ = "GQ";
        case GR = "GR";
        case GS = "GS";
        case GT = "GT";
        case GU = "GU";
        case GW = "GW";
        case GY = "GY";
        case HK = "HK";
        case HM = "HM";
        case HN = "HN";
        case HR = "HR";
        case HT = "HT";
        case HU = "HU";
        case ID = "ID";
        case IE = "IE";
        case IL = "IL";
        case IM = "IM";
        case IN = "IN";
        case IO = "IO";
        case IQ = "IQ";
        case IR = "IR";
        case IS = "IS";
        case IT = "IT";
        case JE = "JE";
        case JM = "JM";
        case JO = "JO";
        case JP = "JP";
        case KE = "KE";
        case KG = "KG";
        case KH = "KH";
        case KI = "KI";
        case KM = "KM";
        case KN = "KN";
        case KR = "KR";
        case KW = "KW";
        case KY = "KY";
        case KZ = "KZ";
        case LA = "LA";
        case LB = "LB";
        case LC = "LC";
        case LI = "LI";
        case LK = "LK";
        case LR = "LR";
        case LS = "LS";
        case LT = "LT";
        case LU = "LU";
        case LV = "LV";
        case LY = "LY";
        case MA = "MA";
        case MC = "MC";
        case MD = "MD";
        case ME = "ME";
        case MF = "MF";
        case MG = "MG";
        case MH = "MH";
        case MK = "MK";
        case ML = "ML";
        case MM = "MM";
        case MN = "MN";
        case MO = "MO";
        case MP = "MP";
        case MQ = "MQ";
        case MR = "MR";
        case MS = "MS";
        case MT = "MT";
        case MU = "MU";
        case MV = "MV";
        case MW = "MW";
        case MX = "MX";
        case MY = "MY";
        case MZ = "MZ";
        case NA = "NA";
        case NC = "NC";
        case NE = "NE";
        case NF = "NF";
        case NG = "NG";
        case NI = "NI";
        case NL = "NL";
        case NO = "NO";
        case NP = "NP";
        case NR = "NR";
        case NU = "NU";
        case NZ = "NZ";
        case OM = "OM";
        case PA = "PA";
        case PE = "PE";
        case PF = "PF";
        case PG = "PG";
        case PH = "PH";
        case PK = "PK";
        case PL = "PL";
        case PM = "PM";
        case PN = "PN";
        case PR = "PR";
        case PS = "PS";
        case PT = "PT";
        case PW = "PW";
        case PY = "PY";
        case QA = "QA";
        case RE = "RE";
        case RO = "RO";
        case RS = "RS";
        case RU = "RU";
        case RW = "RW";
        case SA = "SA";
        case SB = "SB";
        case SC = "SC";
        case SD = "SD";
        case SE = "SE";
        case SG = "SG";
        case SH = "SH";
        case SI = "SI";
        case SJ = "SJ";
        case SK = "SK";
        case SL = "SL";
        case SM = "SM";
        case SN = "SN";
        case SO = "SO";
        case SR = "SR";
        case SS = "SS";
        case ST = "ST";
        case SV = "SV";
        case SX = "SX";
        case SY = "SY";
        case SZ = "SZ";
        case TC = "TC";
        case TD = "TD";
        case TF = "TF";
        case TG = "TG";
        case TH = "TH";
        case TJ = "TJ";
        case TK = "TK";
        case TL = "TL";
        case TM = "TM";
        case TN = "TN";
        case TO = "TO";
        case TR = "TR";
        case TT = "TT";
        case TV = "TV";
        case TW = "TW";
        case TZ = "TZ";
        case UA = "UA";
        case UG = "UG";
        case UM = "UM";
        case US = "US";
        case UY = "UY";
        case UZ = "UZ";
        case VA = "VA";
        case VC = "VC";
        case VE = "VE";
        case VG = "VG";
        case VI = "VI";
        case VN = "VN";
        case VU = "VU";
        case WF = "WF";
        case WS = "WS";
        case YE = "YE";
        case YT = "YT";
        case ZA = "ZA";
        case ZM = "ZM";
        case ZW = "ZW";
}


