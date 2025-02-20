/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "Country.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

Country::Country()
{
    
}

void Country::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Country::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Country::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Country" : pathPrefix;

    
    if (m_value == Country::eCountry::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool Country::operator==(const Country& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool Country::operator!=(const Country& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Country& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case Country::eCountry::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case Country::eCountry::AD:
            j = "AD";
            break;
        case Country::eCountry::AE:
            j = "AE";
            break;
        case Country::eCountry::AF:
            j = "AF";
            break;
        case Country::eCountry::AG:
            j = "AG";
            break;
        case Country::eCountry::AI:
            j = "AI";
            break;
        case Country::eCountry::AL:
            j = "AL";
            break;
        case Country::eCountry::AM:
            j = "AM";
            break;
        case Country::eCountry::AO:
            j = "AO";
            break;
        case Country::eCountry::AQ:
            j = "AQ";
            break;
        case Country::eCountry::AR:
            j = "AR";
            break;
        case Country::eCountry::AS:
            j = "AS";
            break;
        case Country::eCountry::AT:
            j = "AT";
            break;
        case Country::eCountry::AU:
            j = "AU";
            break;
        case Country::eCountry::AW:
            j = "AW";
            break;
        case Country::eCountry::AX:
            j = "AX";
            break;
        case Country::eCountry::AZ:
            j = "AZ";
            break;
        case Country::eCountry::BA:
            j = "BA";
            break;
        case Country::eCountry::BB:
            j = "BB";
            break;
        case Country::eCountry::BD:
            j = "BD";
            break;
        case Country::eCountry::BE:
            j = "BE";
            break;
        case Country::eCountry::BF:
            j = "BF";
            break;
        case Country::eCountry::BG:
            j = "BG";
            break;
        case Country::eCountry::BH:
            j = "BH";
            break;
        case Country::eCountry::BI:
            j = "BI";
            break;
        case Country::eCountry::BJ:
            j = "BJ";
            break;
        case Country::eCountry::BL:
            j = "BL";
            break;
        case Country::eCountry::BM:
            j = "BM";
            break;
        case Country::eCountry::BN:
            j = "BN";
            break;
        case Country::eCountry::BO:
            j = "BO";
            break;
        case Country::eCountry::BQ:
            j = "BQ";
            break;
        case Country::eCountry::BR:
            j = "BR";
            break;
        case Country::eCountry::BS:
            j = "BS";
            break;
        case Country::eCountry::BT:
            j = "BT";
            break;
        case Country::eCountry::BV:
            j = "BV";
            break;
        case Country::eCountry::BW:
            j = "BW";
            break;
        case Country::eCountry::BY:
            j = "BY";
            break;
        case Country::eCountry::BZ:
            j = "BZ";
            break;
        case Country::eCountry::CA:
            j = "CA";
            break;
        case Country::eCountry::CC:
            j = "CC";
            break;
        case Country::eCountry::CD:
            j = "CD";
            break;
        case Country::eCountry::CF:
            j = "CF";
            break;
        case Country::eCountry::CG:
            j = "CG";
            break;
        case Country::eCountry::CH:
            j = "CH";
            break;
        case Country::eCountry::CI:
            j = "CI";
            break;
        case Country::eCountry::CK:
            j = "CK";
            break;
        case Country::eCountry::CL:
            j = "CL";
            break;
        case Country::eCountry::CM:
            j = "CM";
            break;
        case Country::eCountry::CN:
            j = "CN";
            break;
        case Country::eCountry::CO:
            j = "CO";
            break;
        case Country::eCountry::CR:
            j = "CR";
            break;
        case Country::eCountry::CU:
            j = "CU";
            break;
        case Country::eCountry::CV:
            j = "CV";
            break;
        case Country::eCountry::CW:
            j = "CW";
            break;
        case Country::eCountry::CX:
            j = "CX";
            break;
        case Country::eCountry::CY:
            j = "CY";
            break;
        case Country::eCountry::CZ:
            j = "CZ";
            break;
        case Country::eCountry::DE:
            j = "DE";
            break;
        case Country::eCountry::DJ:
            j = "DJ";
            break;
        case Country::eCountry::DK:
            j = "DK";
            break;
        case Country::eCountry::DM:
            j = "DM";
            break;
        case Country::eCountry::DO:
            j = "DO";
            break;
        case Country::eCountry::DZ:
            j = "DZ";
            break;
        case Country::eCountry::EC:
            j = "EC";
            break;
        case Country::eCountry::EE:
            j = "EE";
            break;
        case Country::eCountry::EG:
            j = "EG";
            break;
        case Country::eCountry::EH:
            j = "EH";
            break;
        case Country::eCountry::ER:
            j = "ER";
            break;
        case Country::eCountry::ES:
            j = "ES";
            break;
        case Country::eCountry::ET:
            j = "ET";
            break;
        case Country::eCountry::FI:
            j = "FI";
            break;
        case Country::eCountry::FJ:
            j = "FJ";
            break;
        case Country::eCountry::FK:
            j = "FK";
            break;
        case Country::eCountry::FM:
            j = "FM";
            break;
        case Country::eCountry::FO:
            j = "FO";
            break;
        case Country::eCountry::FR:
            j = "FR";
            break;
        case Country::eCountry::GA:
            j = "GA";
            break;
        case Country::eCountry::GB:
            j = "GB";
            break;
        case Country::eCountry::GD:
            j = "GD";
            break;
        case Country::eCountry::GE:
            j = "GE";
            break;
        case Country::eCountry::GF:
            j = "GF";
            break;
        case Country::eCountry::GG:
            j = "GG";
            break;
        case Country::eCountry::GH:
            j = "GH";
            break;
        case Country::eCountry::GI:
            j = "GI";
            break;
        case Country::eCountry::GL:
            j = "GL";
            break;
        case Country::eCountry::GM:
            j = "GM";
            break;
        case Country::eCountry::GN:
            j = "GN";
            break;
        case Country::eCountry::GP:
            j = "GP";
            break;
        case Country::eCountry::GQ:
            j = "GQ";
            break;
        case Country::eCountry::GR:
            j = "GR";
            break;
        case Country::eCountry::GS:
            j = "GS";
            break;
        case Country::eCountry::GT:
            j = "GT";
            break;
        case Country::eCountry::GU:
            j = "GU";
            break;
        case Country::eCountry::GW:
            j = "GW";
            break;
        case Country::eCountry::GY:
            j = "GY";
            break;
        case Country::eCountry::HK:
            j = "HK";
            break;
        case Country::eCountry::HM:
            j = "HM";
            break;
        case Country::eCountry::HN:
            j = "HN";
            break;
        case Country::eCountry::HR:
            j = "HR";
            break;
        case Country::eCountry::HT:
            j = "HT";
            break;
        case Country::eCountry::HU:
            j = "HU";
            break;
        case Country::eCountry::ID:
            j = "ID";
            break;
        case Country::eCountry::IE:
            j = "IE";
            break;
        case Country::eCountry::IL:
            j = "IL";
            break;
        case Country::eCountry::IM:
            j = "IM";
            break;
        case Country::eCountry::IN:
            j = "IN";
            break;
        case Country::eCountry::IO:
            j = "IO";
            break;
        case Country::eCountry::IQ:
            j = "IQ";
            break;
        case Country::eCountry::IR:
            j = "IR";
            break;
        case Country::eCountry::IS:
            j = "IS";
            break;
        case Country::eCountry::IT:
            j = "IT";
            break;
        case Country::eCountry::JE:
            j = "JE";
            break;
        case Country::eCountry::JM:
            j = "JM";
            break;
        case Country::eCountry::JO:
            j = "JO";
            break;
        case Country::eCountry::JP:
            j = "JP";
            break;
        case Country::eCountry::KE:
            j = "KE";
            break;
        case Country::eCountry::KG:
            j = "KG";
            break;
        case Country::eCountry::KH:
            j = "KH";
            break;
        case Country::eCountry::KI:
            j = "KI";
            break;
        case Country::eCountry::KM:
            j = "KM";
            break;
        case Country::eCountry::KN:
            j = "KN";
            break;
        case Country::eCountry::KR:
            j = "KR";
            break;
        case Country::eCountry::KW:
            j = "KW";
            break;
        case Country::eCountry::KY:
            j = "KY";
            break;
        case Country::eCountry::KZ:
            j = "KZ";
            break;
        case Country::eCountry::LA:
            j = "LA";
            break;
        case Country::eCountry::LB:
            j = "LB";
            break;
        case Country::eCountry::LC:
            j = "LC";
            break;
        case Country::eCountry::LI:
            j = "LI";
            break;
        case Country::eCountry::LK:
            j = "LK";
            break;
        case Country::eCountry::LR:
            j = "LR";
            break;
        case Country::eCountry::LS:
            j = "LS";
            break;
        case Country::eCountry::LT:
            j = "LT";
            break;
        case Country::eCountry::LU:
            j = "LU";
            break;
        case Country::eCountry::LV:
            j = "LV";
            break;
        case Country::eCountry::LY:
            j = "LY";
            break;
        case Country::eCountry::MA:
            j = "MA";
            break;
        case Country::eCountry::MC:
            j = "MC";
            break;
        case Country::eCountry::MD:
            j = "MD";
            break;
        case Country::eCountry::ME:
            j = "ME";
            break;
        case Country::eCountry::MF:
            j = "MF";
            break;
        case Country::eCountry::MG:
            j = "MG";
            break;
        case Country::eCountry::MH:
            j = "MH";
            break;
        case Country::eCountry::MK:
            j = "MK";
            break;
        case Country::eCountry::ML:
            j = "ML";
            break;
        case Country::eCountry::MM:
            j = "MM";
            break;
        case Country::eCountry::MN:
            j = "MN";
            break;
        case Country::eCountry::MO:
            j = "MO";
            break;
        case Country::eCountry::MP:
            j = "MP";
            break;
        case Country::eCountry::MQ:
            j = "MQ";
            break;
        case Country::eCountry::MR:
            j = "MR";
            break;
        case Country::eCountry::MS:
            j = "MS";
            break;
        case Country::eCountry::MT:
            j = "MT";
            break;
        case Country::eCountry::MU:
            j = "MU";
            break;
        case Country::eCountry::MV:
            j = "MV";
            break;
        case Country::eCountry::MW:
            j = "MW";
            break;
        case Country::eCountry::MX:
            j = "MX";
            break;
        case Country::eCountry::MY:
            j = "MY";
            break;
        case Country::eCountry::MZ:
            j = "MZ";
            break;
        case Country::eCountry::NA:
            j = "NA";
            break;
        case Country::eCountry::NC:
            j = "NC";
            break;
        case Country::eCountry::NE:
            j = "NE";
            break;
        case Country::eCountry::NF:
            j = "NF";
            break;
        case Country::eCountry::NG:
            j = "NG";
            break;
        case Country::eCountry::NI:
            j = "NI";
            break;
        case Country::eCountry::NL:
            j = "NL";
            break;
        case Country::eCountry::NO:
            j = "NO";
            break;
        case Country::eCountry::NP:
            j = "NP";
            break;
        case Country::eCountry::NR:
            j = "NR";
            break;
        case Country::eCountry::NU:
            j = "NU";
            break;
        case Country::eCountry::NZ:
            j = "NZ";
            break;
        case Country::eCountry::OM:
            j = "OM";
            break;
        case Country::eCountry::PA:
            j = "PA";
            break;
        case Country::eCountry::PE:
            j = "PE";
            break;
        case Country::eCountry::PF:
            j = "PF";
            break;
        case Country::eCountry::PG:
            j = "PG";
            break;
        case Country::eCountry::PH:
            j = "PH";
            break;
        case Country::eCountry::PK:
            j = "PK";
            break;
        case Country::eCountry::PL:
            j = "PL";
            break;
        case Country::eCountry::PM:
            j = "PM";
            break;
        case Country::eCountry::PN:
            j = "PN";
            break;
        case Country::eCountry::PR:
            j = "PR";
            break;
        case Country::eCountry::PS:
            j = "PS";
            break;
        case Country::eCountry::PT:
            j = "PT";
            break;
        case Country::eCountry::PW:
            j = "PW";
            break;
        case Country::eCountry::PY:
            j = "PY";
            break;
        case Country::eCountry::QA:
            j = "QA";
            break;
        case Country::eCountry::RE:
            j = "RE";
            break;
        case Country::eCountry::RO:
            j = "RO";
            break;
        case Country::eCountry::RS:
            j = "RS";
            break;
        case Country::eCountry::RU:
            j = "RU";
            break;
        case Country::eCountry::RW:
            j = "RW";
            break;
        case Country::eCountry::SA:
            j = "SA";
            break;
        case Country::eCountry::SB:
            j = "SB";
            break;
        case Country::eCountry::SC:
            j = "SC";
            break;
        case Country::eCountry::SD:
            j = "SD";
            break;
        case Country::eCountry::SE:
            j = "SE";
            break;
        case Country::eCountry::SG:
            j = "SG";
            break;
        case Country::eCountry::SH:
            j = "SH";
            break;
        case Country::eCountry::SI:
            j = "SI";
            break;
        case Country::eCountry::SJ:
            j = "SJ";
            break;
        case Country::eCountry::SK:
            j = "SK";
            break;
        case Country::eCountry::SL:
            j = "SL";
            break;
        case Country::eCountry::SM:
            j = "SM";
            break;
        case Country::eCountry::SN:
            j = "SN";
            break;
        case Country::eCountry::SO:
            j = "SO";
            break;
        case Country::eCountry::SR:
            j = "SR";
            break;
        case Country::eCountry::SS:
            j = "SS";
            break;
        case Country::eCountry::ST:
            j = "ST";
            break;
        case Country::eCountry::SV:
            j = "SV";
            break;
        case Country::eCountry::SX:
            j = "SX";
            break;
        case Country::eCountry::SY:
            j = "SY";
            break;
        case Country::eCountry::SZ:
            j = "SZ";
            break;
        case Country::eCountry::TC:
            j = "TC";
            break;
        case Country::eCountry::TD:
            j = "TD";
            break;
        case Country::eCountry::TF:
            j = "TF";
            break;
        case Country::eCountry::TG:
            j = "TG";
            break;
        case Country::eCountry::TH:
            j = "TH";
            break;
        case Country::eCountry::TJ:
            j = "TJ";
            break;
        case Country::eCountry::TK:
            j = "TK";
            break;
        case Country::eCountry::TL:
            j = "TL";
            break;
        case Country::eCountry::TM:
            j = "TM";
            break;
        case Country::eCountry::TN:
            j = "TN";
            break;
        case Country::eCountry::TO:
            j = "TO";
            break;
        case Country::eCountry::TR:
            j = "TR";
            break;
        case Country::eCountry::TT:
            j = "TT";
            break;
        case Country::eCountry::TV:
            j = "TV";
            break;
        case Country::eCountry::TW:
            j = "TW";
            break;
        case Country::eCountry::TZ:
            j = "TZ";
            break;
        case Country::eCountry::UA:
            j = "UA";
            break;
        case Country::eCountry::UG:
            j = "UG";
            break;
        case Country::eCountry::UM:
            j = "UM";
            break;
        case Country::eCountry::US:
            j = "US";
            break;
        case Country::eCountry::UY:
            j = "UY";
            break;
        case Country::eCountry::UZ:
            j = "UZ";
            break;
        case Country::eCountry::VA:
            j = "VA";
            break;
        case Country::eCountry::VC:
            j = "VC";
            break;
        case Country::eCountry::VE:
            j = "VE";
            break;
        case Country::eCountry::VG:
            j = "VG";
            break;
        case Country::eCountry::VI:
            j = "VI";
            break;
        case Country::eCountry::VN:
            j = "VN";
            break;
        case Country::eCountry::VU:
            j = "VU";
            break;
        case Country::eCountry::WF:
            j = "WF";
            break;
        case Country::eCountry::WS:
            j = "WS";
            break;
        case Country::eCountry::YE:
            j = "YE";
            break;
        case Country::eCountry::YT:
            j = "YT";
            break;
        case Country::eCountry::ZA:
            j = "ZA";
            break;
        case Country::eCountry::ZM:
            j = "ZM";
            break;
        case Country::eCountry::ZW:
            j = "ZW";
            break;
    }
}

void from_json(const nlohmann::json& j, Country& o)
{
    
    auto s = j.get<std::string>();
    if (s == "AD") {
     o.setValue(Country::eCountry::AD);
    } 
    else if (s == "AE") {
     o.setValue(Country::eCountry::AE);
    } 
    else if (s == "AF") {
     o.setValue(Country::eCountry::AF);
    } 
    else if (s == "AG") {
     o.setValue(Country::eCountry::AG);
    } 
    else if (s == "AI") {
     o.setValue(Country::eCountry::AI);
    } 
    else if (s == "AL") {
     o.setValue(Country::eCountry::AL);
    } 
    else if (s == "AM") {
     o.setValue(Country::eCountry::AM);
    } 
    else if (s == "AO") {
     o.setValue(Country::eCountry::AO);
    } 
    else if (s == "AQ") {
     o.setValue(Country::eCountry::AQ);
    } 
    else if (s == "AR") {
     o.setValue(Country::eCountry::AR);
    } 
    else if (s == "AS") {
     o.setValue(Country::eCountry::AS);
    } 
    else if (s == "AT") {
     o.setValue(Country::eCountry::AT);
    } 
    else if (s == "AU") {
     o.setValue(Country::eCountry::AU);
    } 
    else if (s == "AW") {
     o.setValue(Country::eCountry::AW);
    } 
    else if (s == "AX") {
     o.setValue(Country::eCountry::AX);
    } 
    else if (s == "AZ") {
     o.setValue(Country::eCountry::AZ);
    } 
    else if (s == "BA") {
     o.setValue(Country::eCountry::BA);
    } 
    else if (s == "BB") {
     o.setValue(Country::eCountry::BB);
    } 
    else if (s == "BD") {
     o.setValue(Country::eCountry::BD);
    } 
    else if (s == "BE") {
     o.setValue(Country::eCountry::BE);
    } 
    else if (s == "BF") {
     o.setValue(Country::eCountry::BF);
    } 
    else if (s == "BG") {
     o.setValue(Country::eCountry::BG);
    } 
    else if (s == "BH") {
     o.setValue(Country::eCountry::BH);
    } 
    else if (s == "BI") {
     o.setValue(Country::eCountry::BI);
    } 
    else if (s == "BJ") {
     o.setValue(Country::eCountry::BJ);
    } 
    else if (s == "BL") {
     o.setValue(Country::eCountry::BL);
    } 
    else if (s == "BM") {
     o.setValue(Country::eCountry::BM);
    } 
    else if (s == "BN") {
     o.setValue(Country::eCountry::BN);
    } 
    else if (s == "BO") {
     o.setValue(Country::eCountry::BO);
    } 
    else if (s == "BQ") {
     o.setValue(Country::eCountry::BQ);
    } 
    else if (s == "BR") {
     o.setValue(Country::eCountry::BR);
    } 
    else if (s == "BS") {
     o.setValue(Country::eCountry::BS);
    } 
    else if (s == "BT") {
     o.setValue(Country::eCountry::BT);
    } 
    else if (s == "BV") {
     o.setValue(Country::eCountry::BV);
    } 
    else if (s == "BW") {
     o.setValue(Country::eCountry::BW);
    } 
    else if (s == "BY") {
     o.setValue(Country::eCountry::BY);
    } 
    else if (s == "BZ") {
     o.setValue(Country::eCountry::BZ);
    } 
    else if (s == "CA") {
     o.setValue(Country::eCountry::CA);
    } 
    else if (s == "CC") {
     o.setValue(Country::eCountry::CC);
    } 
    else if (s == "CD") {
     o.setValue(Country::eCountry::CD);
    } 
    else if (s == "CF") {
     o.setValue(Country::eCountry::CF);
    } 
    else if (s == "CG") {
     o.setValue(Country::eCountry::CG);
    } 
    else if (s == "CH") {
     o.setValue(Country::eCountry::CH);
    } 
    else if (s == "CI") {
     o.setValue(Country::eCountry::CI);
    } 
    else if (s == "CK") {
     o.setValue(Country::eCountry::CK);
    } 
    else if (s == "CL") {
     o.setValue(Country::eCountry::CL);
    } 
    else if (s == "CM") {
     o.setValue(Country::eCountry::CM);
    } 
    else if (s == "CN") {
     o.setValue(Country::eCountry::CN);
    } 
    else if (s == "CO") {
     o.setValue(Country::eCountry::CO);
    } 
    else if (s == "CR") {
     o.setValue(Country::eCountry::CR);
    } 
    else if (s == "CU") {
     o.setValue(Country::eCountry::CU);
    } 
    else if (s == "CV") {
     o.setValue(Country::eCountry::CV);
    } 
    else if (s == "CW") {
     o.setValue(Country::eCountry::CW);
    } 
    else if (s == "CX") {
     o.setValue(Country::eCountry::CX);
    } 
    else if (s == "CY") {
     o.setValue(Country::eCountry::CY);
    } 
    else if (s == "CZ") {
     o.setValue(Country::eCountry::CZ);
    } 
    else if (s == "DE") {
     o.setValue(Country::eCountry::DE);
    } 
    else if (s == "DJ") {
     o.setValue(Country::eCountry::DJ);
    } 
    else if (s == "DK") {
     o.setValue(Country::eCountry::DK);
    } 
    else if (s == "DM") {
     o.setValue(Country::eCountry::DM);
    } 
    else if (s == "DO") {
     o.setValue(Country::eCountry::DO);
    } 
    else if (s == "DZ") {
     o.setValue(Country::eCountry::DZ);
    } 
    else if (s == "EC") {
     o.setValue(Country::eCountry::EC);
    } 
    else if (s == "EE") {
     o.setValue(Country::eCountry::EE);
    } 
    else if (s == "EG") {
     o.setValue(Country::eCountry::EG);
    } 
    else if (s == "EH") {
     o.setValue(Country::eCountry::EH);
    } 
    else if (s == "ER") {
     o.setValue(Country::eCountry::ER);
    } 
    else if (s == "ES") {
     o.setValue(Country::eCountry::ES);
    } 
    else if (s == "ET") {
     o.setValue(Country::eCountry::ET);
    } 
    else if (s == "FI") {
     o.setValue(Country::eCountry::FI);
    } 
    else if (s == "FJ") {
     o.setValue(Country::eCountry::FJ);
    } 
    else if (s == "FK") {
     o.setValue(Country::eCountry::FK);
    } 
    else if (s == "FM") {
     o.setValue(Country::eCountry::FM);
    } 
    else if (s == "FO") {
     o.setValue(Country::eCountry::FO);
    } 
    else if (s == "FR") {
     o.setValue(Country::eCountry::FR);
    } 
    else if (s == "GA") {
     o.setValue(Country::eCountry::GA);
    } 
    else if (s == "GB") {
     o.setValue(Country::eCountry::GB);
    } 
    else if (s == "GD") {
     o.setValue(Country::eCountry::GD);
    } 
    else if (s == "GE") {
     o.setValue(Country::eCountry::GE);
    } 
    else if (s == "GF") {
     o.setValue(Country::eCountry::GF);
    } 
    else if (s == "GG") {
     o.setValue(Country::eCountry::GG);
    } 
    else if (s == "GH") {
     o.setValue(Country::eCountry::GH);
    } 
    else if (s == "GI") {
     o.setValue(Country::eCountry::GI);
    } 
    else if (s == "GL") {
     o.setValue(Country::eCountry::GL);
    } 
    else if (s == "GM") {
     o.setValue(Country::eCountry::GM);
    } 
    else if (s == "GN") {
     o.setValue(Country::eCountry::GN);
    } 
    else if (s == "GP") {
     o.setValue(Country::eCountry::GP);
    } 
    else if (s == "GQ") {
     o.setValue(Country::eCountry::GQ);
    } 
    else if (s == "GR") {
     o.setValue(Country::eCountry::GR);
    } 
    else if (s == "GS") {
     o.setValue(Country::eCountry::GS);
    } 
    else if (s == "GT") {
     o.setValue(Country::eCountry::GT);
    } 
    else if (s == "GU") {
     o.setValue(Country::eCountry::GU);
    } 
    else if (s == "GW") {
     o.setValue(Country::eCountry::GW);
    } 
    else if (s == "GY") {
     o.setValue(Country::eCountry::GY);
    } 
    else if (s == "HK") {
     o.setValue(Country::eCountry::HK);
    } 
    else if (s == "HM") {
     o.setValue(Country::eCountry::HM);
    } 
    else if (s == "HN") {
     o.setValue(Country::eCountry::HN);
    } 
    else if (s == "HR") {
     o.setValue(Country::eCountry::HR);
    } 
    else if (s == "HT") {
     o.setValue(Country::eCountry::HT);
    } 
    else if (s == "HU") {
     o.setValue(Country::eCountry::HU);
    } 
    else if (s == "ID") {
     o.setValue(Country::eCountry::ID);
    } 
    else if (s == "IE") {
     o.setValue(Country::eCountry::IE);
    } 
    else if (s == "IL") {
     o.setValue(Country::eCountry::IL);
    } 
    else if (s == "IM") {
     o.setValue(Country::eCountry::IM);
    } 
    else if (s == "IN") {
     o.setValue(Country::eCountry::IN);
    } 
    else if (s == "IO") {
     o.setValue(Country::eCountry::IO);
    } 
    else if (s == "IQ") {
     o.setValue(Country::eCountry::IQ);
    } 
    else if (s == "IR") {
     o.setValue(Country::eCountry::IR);
    } 
    else if (s == "IS") {
     o.setValue(Country::eCountry::IS);
    } 
    else if (s == "IT") {
     o.setValue(Country::eCountry::IT);
    } 
    else if (s == "JE") {
     o.setValue(Country::eCountry::JE);
    } 
    else if (s == "JM") {
     o.setValue(Country::eCountry::JM);
    } 
    else if (s == "JO") {
     o.setValue(Country::eCountry::JO);
    } 
    else if (s == "JP") {
     o.setValue(Country::eCountry::JP);
    } 
    else if (s == "KE") {
     o.setValue(Country::eCountry::KE);
    } 
    else if (s == "KG") {
     o.setValue(Country::eCountry::KG);
    } 
    else if (s == "KH") {
     o.setValue(Country::eCountry::KH);
    } 
    else if (s == "KI") {
     o.setValue(Country::eCountry::KI);
    } 
    else if (s == "KM") {
     o.setValue(Country::eCountry::KM);
    } 
    else if (s == "KN") {
     o.setValue(Country::eCountry::KN);
    } 
    else if (s == "KR") {
     o.setValue(Country::eCountry::KR);
    } 
    else if (s == "KW") {
     o.setValue(Country::eCountry::KW);
    } 
    else if (s == "KY") {
     o.setValue(Country::eCountry::KY);
    } 
    else if (s == "KZ") {
     o.setValue(Country::eCountry::KZ);
    } 
    else if (s == "LA") {
     o.setValue(Country::eCountry::LA);
    } 
    else if (s == "LB") {
     o.setValue(Country::eCountry::LB);
    } 
    else if (s == "LC") {
     o.setValue(Country::eCountry::LC);
    } 
    else if (s == "LI") {
     o.setValue(Country::eCountry::LI);
    } 
    else if (s == "LK") {
     o.setValue(Country::eCountry::LK);
    } 
    else if (s == "LR") {
     o.setValue(Country::eCountry::LR);
    } 
    else if (s == "LS") {
     o.setValue(Country::eCountry::LS);
    } 
    else if (s == "LT") {
     o.setValue(Country::eCountry::LT);
    } 
    else if (s == "LU") {
     o.setValue(Country::eCountry::LU);
    } 
    else if (s == "LV") {
     o.setValue(Country::eCountry::LV);
    } 
    else if (s == "LY") {
     o.setValue(Country::eCountry::LY);
    } 
    else if (s == "MA") {
     o.setValue(Country::eCountry::MA);
    } 
    else if (s == "MC") {
     o.setValue(Country::eCountry::MC);
    } 
    else if (s == "MD") {
     o.setValue(Country::eCountry::MD);
    } 
    else if (s == "ME") {
     o.setValue(Country::eCountry::ME);
    } 
    else if (s == "MF") {
     o.setValue(Country::eCountry::MF);
    } 
    else if (s == "MG") {
     o.setValue(Country::eCountry::MG);
    } 
    else if (s == "MH") {
     o.setValue(Country::eCountry::MH);
    } 
    else if (s == "MK") {
     o.setValue(Country::eCountry::MK);
    } 
    else if (s == "ML") {
     o.setValue(Country::eCountry::ML);
    } 
    else if (s == "MM") {
     o.setValue(Country::eCountry::MM);
    } 
    else if (s == "MN") {
     o.setValue(Country::eCountry::MN);
    } 
    else if (s == "MO") {
     o.setValue(Country::eCountry::MO);
    } 
    else if (s == "MP") {
     o.setValue(Country::eCountry::MP);
    } 
    else if (s == "MQ") {
     o.setValue(Country::eCountry::MQ);
    } 
    else if (s == "MR") {
     o.setValue(Country::eCountry::MR);
    } 
    else if (s == "MS") {
     o.setValue(Country::eCountry::MS);
    } 
    else if (s == "MT") {
     o.setValue(Country::eCountry::MT);
    } 
    else if (s == "MU") {
     o.setValue(Country::eCountry::MU);
    } 
    else if (s == "MV") {
     o.setValue(Country::eCountry::MV);
    } 
    else if (s == "MW") {
     o.setValue(Country::eCountry::MW);
    } 
    else if (s == "MX") {
     o.setValue(Country::eCountry::MX);
    } 
    else if (s == "MY") {
     o.setValue(Country::eCountry::MY);
    } 
    else if (s == "MZ") {
     o.setValue(Country::eCountry::MZ);
    } 
    else if (s == "NA") {
     o.setValue(Country::eCountry::NA);
    } 
    else if (s == "NC") {
     o.setValue(Country::eCountry::NC);
    } 
    else if (s == "NE") {
     o.setValue(Country::eCountry::NE);
    } 
    else if (s == "NF") {
     o.setValue(Country::eCountry::NF);
    } 
    else if (s == "NG") {
     o.setValue(Country::eCountry::NG);
    } 
    else if (s == "NI") {
     o.setValue(Country::eCountry::NI);
    } 
    else if (s == "NL") {
     o.setValue(Country::eCountry::NL);
    } 
    else if (s == "NO") {
     o.setValue(Country::eCountry::NO);
    } 
    else if (s == "NP") {
     o.setValue(Country::eCountry::NP);
    } 
    else if (s == "NR") {
     o.setValue(Country::eCountry::NR);
    } 
    else if (s == "NU") {
     o.setValue(Country::eCountry::NU);
    } 
    else if (s == "NZ") {
     o.setValue(Country::eCountry::NZ);
    } 
    else if (s == "OM") {
     o.setValue(Country::eCountry::OM);
    } 
    else if (s == "PA") {
     o.setValue(Country::eCountry::PA);
    } 
    else if (s == "PE") {
     o.setValue(Country::eCountry::PE);
    } 
    else if (s == "PF") {
     o.setValue(Country::eCountry::PF);
    } 
    else if (s == "PG") {
     o.setValue(Country::eCountry::PG);
    } 
    else if (s == "PH") {
     o.setValue(Country::eCountry::PH);
    } 
    else if (s == "PK") {
     o.setValue(Country::eCountry::PK);
    } 
    else if (s == "PL") {
     o.setValue(Country::eCountry::PL);
    } 
    else if (s == "PM") {
     o.setValue(Country::eCountry::PM);
    } 
    else if (s == "PN") {
     o.setValue(Country::eCountry::PN);
    } 
    else if (s == "PR") {
     o.setValue(Country::eCountry::PR);
    } 
    else if (s == "PS") {
     o.setValue(Country::eCountry::PS);
    } 
    else if (s == "PT") {
     o.setValue(Country::eCountry::PT);
    } 
    else if (s == "PW") {
     o.setValue(Country::eCountry::PW);
    } 
    else if (s == "PY") {
     o.setValue(Country::eCountry::PY);
    } 
    else if (s == "QA") {
     o.setValue(Country::eCountry::QA);
    } 
    else if (s == "RE") {
     o.setValue(Country::eCountry::RE);
    } 
    else if (s == "RO") {
     o.setValue(Country::eCountry::RO);
    } 
    else if (s == "RS") {
     o.setValue(Country::eCountry::RS);
    } 
    else if (s == "RU") {
     o.setValue(Country::eCountry::RU);
    } 
    else if (s == "RW") {
     o.setValue(Country::eCountry::RW);
    } 
    else if (s == "SA") {
     o.setValue(Country::eCountry::SA);
    } 
    else if (s == "SB") {
     o.setValue(Country::eCountry::SB);
    } 
    else if (s == "SC") {
     o.setValue(Country::eCountry::SC);
    } 
    else if (s == "SD") {
     o.setValue(Country::eCountry::SD);
    } 
    else if (s == "SE") {
     o.setValue(Country::eCountry::SE);
    } 
    else if (s == "SG") {
     o.setValue(Country::eCountry::SG);
    } 
    else if (s == "SH") {
     o.setValue(Country::eCountry::SH);
    } 
    else if (s == "SI") {
     o.setValue(Country::eCountry::SI);
    } 
    else if (s == "SJ") {
     o.setValue(Country::eCountry::SJ);
    } 
    else if (s == "SK") {
     o.setValue(Country::eCountry::SK);
    } 
    else if (s == "SL") {
     o.setValue(Country::eCountry::SL);
    } 
    else if (s == "SM") {
     o.setValue(Country::eCountry::SM);
    } 
    else if (s == "SN") {
     o.setValue(Country::eCountry::SN);
    } 
    else if (s == "SO") {
     o.setValue(Country::eCountry::SO);
    } 
    else if (s == "SR") {
     o.setValue(Country::eCountry::SR);
    } 
    else if (s == "SS") {
     o.setValue(Country::eCountry::SS);
    } 
    else if (s == "ST") {
     o.setValue(Country::eCountry::ST);
    } 
    else if (s == "SV") {
     o.setValue(Country::eCountry::SV);
    } 
    else if (s == "SX") {
     o.setValue(Country::eCountry::SX);
    } 
    else if (s == "SY") {
     o.setValue(Country::eCountry::SY);
    } 
    else if (s == "SZ") {
     o.setValue(Country::eCountry::SZ);
    } 
    else if (s == "TC") {
     o.setValue(Country::eCountry::TC);
    } 
    else if (s == "TD") {
     o.setValue(Country::eCountry::TD);
    } 
    else if (s == "TF") {
     o.setValue(Country::eCountry::TF);
    } 
    else if (s == "TG") {
     o.setValue(Country::eCountry::TG);
    } 
    else if (s == "TH") {
     o.setValue(Country::eCountry::TH);
    } 
    else if (s == "TJ") {
     o.setValue(Country::eCountry::TJ);
    } 
    else if (s == "TK") {
     o.setValue(Country::eCountry::TK);
    } 
    else if (s == "TL") {
     o.setValue(Country::eCountry::TL);
    } 
    else if (s == "TM") {
     o.setValue(Country::eCountry::TM);
    } 
    else if (s == "TN") {
     o.setValue(Country::eCountry::TN);
    } 
    else if (s == "TO") {
     o.setValue(Country::eCountry::TO);
    } 
    else if (s == "TR") {
     o.setValue(Country::eCountry::TR);
    } 
    else if (s == "TT") {
     o.setValue(Country::eCountry::TT);
    } 
    else if (s == "TV") {
     o.setValue(Country::eCountry::TV);
    } 
    else if (s == "TW") {
     o.setValue(Country::eCountry::TW);
    } 
    else if (s == "TZ") {
     o.setValue(Country::eCountry::TZ);
    } 
    else if (s == "UA") {
     o.setValue(Country::eCountry::UA);
    } 
    else if (s == "UG") {
     o.setValue(Country::eCountry::UG);
    } 
    else if (s == "UM") {
     o.setValue(Country::eCountry::UM);
    } 
    else if (s == "US") {
     o.setValue(Country::eCountry::US);
    } 
    else if (s == "UY") {
     o.setValue(Country::eCountry::UY);
    } 
    else if (s == "UZ") {
     o.setValue(Country::eCountry::UZ);
    } 
    else if (s == "VA") {
     o.setValue(Country::eCountry::VA);
    } 
    else if (s == "VC") {
     o.setValue(Country::eCountry::VC);
    } 
    else if (s == "VE") {
     o.setValue(Country::eCountry::VE);
    } 
    else if (s == "VG") {
     o.setValue(Country::eCountry::VG);
    } 
    else if (s == "VI") {
     o.setValue(Country::eCountry::VI);
    } 
    else if (s == "VN") {
     o.setValue(Country::eCountry::VN);
    } 
    else if (s == "VU") {
     o.setValue(Country::eCountry::VU);
    } 
    else if (s == "WF") {
     o.setValue(Country::eCountry::WF);
    } 
    else if (s == "WS") {
     o.setValue(Country::eCountry::WS);
    } 
    else if (s == "YE") {
     o.setValue(Country::eCountry::YE);
    } 
    else if (s == "YT") {
     o.setValue(Country::eCountry::YT);
    } 
    else if (s == "ZA") {
     o.setValue(Country::eCountry::ZA);
    } 
    else if (s == "ZM") {
     o.setValue(Country::eCountry::ZM);
    } 
    else if (s == "ZW") {
     o.setValue(Country::eCountry::ZW);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " Country::eCountry";
     throw std::invalid_argument(ss.str());
    } 

}

Country::eCountry Country::getValue() const
{
    return m_value;
}
void Country::setValue(Country::eCountry value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

