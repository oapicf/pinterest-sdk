

#include "CatalogsReportStats.h"

using namespace Tiny;

CatalogsReportStats::CatalogsReportStats()
{
	catalog_id = std::string();
	code = int(0);
	code_label = std::string();
	message = std::string();
	occurrences = int(0);
	report_type = std::string();
	severity = std::string();
	ineligible_for_ads = bool(false);
	ineligible_for_organic = bool(false);
}

CatalogsReportStats::CatalogsReportStats(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportStats::~CatalogsReportStats()
{

}

void
CatalogsReportStats::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *code_labelKey = "code_label";

    if(object.has_key(code_labelKey))
    {
        bourne::json value = object[code_labelKey];



        jsonToValue(&code_label, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *occurrencesKey = "occurrences";

    if(object.has_key(occurrencesKey))
    {
        bourne::json value = object[occurrencesKey];



        jsonToValue(&occurrences, value, "int");


    }

    const char *report_typeKey = "report_type";

    if(object.has_key(report_typeKey))
    {
        bourne::json value = object[report_typeKey];



        jsonToValue(&report_type, value, "std::string");


    }

    const char *severityKey = "severity";

    if(object.has_key(severityKey))
    {
        bourne::json value = object[severityKey];



        jsonToValue(&severity, value, "std::string");


    }

    const char *ineligible_for_adsKey = "ineligible_for_ads";

    if(object.has_key(ineligible_for_adsKey))
    {
        bourne::json value = object[ineligible_for_adsKey];



        jsonToValue(&ineligible_for_ads, value, "bool");


    }

    const char *ineligible_for_organicKey = "ineligible_for_organic";

    if(object.has_key(ineligible_for_organicKey))
    {
        bourne::json value = object[ineligible_for_organicKey];



        jsonToValue(&ineligible_for_organic, value, "bool");


    }


}

bourne::json
CatalogsReportStats::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["code"] = getCode();






    object["code_label"] = getCodeLabel();






    object["message"] = getMessage();






    object["occurrences"] = getOccurrences();






    object["report_type"] = getReportType();






    object["severity"] = getSeverity();






    object["ineligible_for_ads"] = isIneligibleForAds();






    object["ineligible_for_organic"] = isIneligibleForOrganic();



    return object;

}

std::string
CatalogsReportStats::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportStats::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

int
CatalogsReportStats::getCode()
{
	return code;
}

void
CatalogsReportStats::setCode(int code)
{
	this->code = code;
}

std::string
CatalogsReportStats::getCodeLabel()
{
	return code_label;
}

void
CatalogsReportStats::setCodeLabel(std::string code_label)
{
	this->code_label = code_label;
}

std::string
CatalogsReportStats::getMessage()
{
	return message;
}

void
CatalogsReportStats::setMessage(std::string message)
{
	this->message = message;
}

int
CatalogsReportStats::getOccurrences()
{
	return occurrences;
}

void
CatalogsReportStats::setOccurrences(int occurrences)
{
	this->occurrences = occurrences;
}

std::string
CatalogsReportStats::getReportType()
{
	return report_type;
}

void
CatalogsReportStats::setReportType(std::string report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsReportStats::getSeverity()
{
	return severity;
}

void
CatalogsReportStats::setSeverity(std::string severity)
{
	this->severity = severity;
}

bool
CatalogsReportStats::isIneligibleForAds()
{
	return ineligible_for_ads;
}

void
CatalogsReportStats::setIneligibleForAds(bool ineligible_for_ads)
{
	this->ineligible_for_ads = ineligible_for_ads;
}

bool
CatalogsReportStats::isIneligibleForOrganic()
{
	return ineligible_for_organic;
}

void
CatalogsReportStats::setIneligibleForOrganic(bool ineligible_for_organic)
{
	this->ineligible_for_organic = ineligible_for_organic;
}



