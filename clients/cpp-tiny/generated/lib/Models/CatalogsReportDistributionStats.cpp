

#include "CatalogsReportDistributionStats.h"

using namespace Tiny;

CatalogsReportDistributionStats::CatalogsReportDistributionStats()
{
	catalog_id = std::string();
	code = int(0);
	code_label = std::string();
	ineligible_for_ads = bool(false);
	ineligible_for_organic = bool(false);
	message = std::string();
	occurrences = int(0);
	report_type = std::string();
}

CatalogsReportDistributionStats::CatalogsReportDistributionStats(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportDistributionStats::~CatalogsReportDistributionStats()
{

}

void
CatalogsReportDistributionStats::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsReportDistributionStats::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["code"] = getCode();






    object["code_label"] = getCodeLabel();






    object["ineligible_for_ads"] = isIneligibleForAds();






    object["ineligible_for_organic"] = isIneligibleForOrganic();






    object["message"] = getMessage();






    object["occurrences"] = getOccurrences();






    object["report_type"] = getReportType();



    return object;

}

std::string
CatalogsReportDistributionStats::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportDistributionStats::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

int
CatalogsReportDistributionStats::getCode()
{
	return code;
}

void
CatalogsReportDistributionStats::setCode(int code)
{
	this->code = code;
}

std::string
CatalogsReportDistributionStats::getCodeLabel()
{
	return code_label;
}

void
CatalogsReportDistributionStats::setCodeLabel(std::string code_label)
{
	this->code_label = code_label;
}

bool
CatalogsReportDistributionStats::isIneligibleForAds()
{
	return ineligible_for_ads;
}

void
CatalogsReportDistributionStats::setIneligibleForAds(bool ineligible_for_ads)
{
	this->ineligible_for_ads = ineligible_for_ads;
}

bool
CatalogsReportDistributionStats::isIneligibleForOrganic()
{
	return ineligible_for_organic;
}

void
CatalogsReportDistributionStats::setIneligibleForOrganic(bool ineligible_for_organic)
{
	this->ineligible_for_organic = ineligible_for_organic;
}

std::string
CatalogsReportDistributionStats::getMessage()
{
	return message;
}

void
CatalogsReportDistributionStats::setMessage(std::string message)
{
	this->message = message;
}

int
CatalogsReportDistributionStats::getOccurrences()
{
	return occurrences;
}

void
CatalogsReportDistributionStats::setOccurrences(int occurrences)
{
	this->occurrences = occurrences;
}

std::string
CatalogsReportDistributionStats::getReportType()
{
	return report_type;
}

void
CatalogsReportDistributionStats::setReportType(std::string report_type)
{
	this->report_type = report_type;
}



