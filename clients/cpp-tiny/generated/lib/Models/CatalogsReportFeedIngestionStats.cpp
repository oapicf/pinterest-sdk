

#include "CatalogsReportFeedIngestionStats.h"

using namespace Tiny;

CatalogsReportFeedIngestionStats::CatalogsReportFeedIngestionStats()
{
	catalog_id = std::string();
	code = int(0);
	code_label = std::string();
	message = std::string();
	occurrences = int(0);
	report_type = std::string();
	severity = std::string();
}

CatalogsReportFeedIngestionStats::CatalogsReportFeedIngestionStats(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsReportFeedIngestionStats::~CatalogsReportFeedIngestionStats()
{

}

void
CatalogsReportFeedIngestionStats::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsReportFeedIngestionStats::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["code"] = getCode();






    object["code_label"] = getCodeLabel();






    object["message"] = getMessage();






    object["occurrences"] = getOccurrences();






    object["report_type"] = getReportType();






    object["severity"] = getSeverity();



    return object;

}

std::string
CatalogsReportFeedIngestionStats::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportFeedIngestionStats::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

int
CatalogsReportFeedIngestionStats::getCode()
{
	return code;
}

void
CatalogsReportFeedIngestionStats::setCode(int  code)
{
	this->code = code;
}

std::string
CatalogsReportFeedIngestionStats::getCodeLabel()
{
	return code_label;
}

void
CatalogsReportFeedIngestionStats::setCodeLabel(std::string  code_label)
{
	this->code_label = code_label;
}

std::string
CatalogsReportFeedIngestionStats::getMessage()
{
	return message;
}

void
CatalogsReportFeedIngestionStats::setMessage(std::string  message)
{
	this->message = message;
}

int
CatalogsReportFeedIngestionStats::getOccurrences()
{
	return occurrences;
}

void
CatalogsReportFeedIngestionStats::setOccurrences(int  occurrences)
{
	this->occurrences = occurrences;
}

std::string
CatalogsReportFeedIngestionStats::getReportType()
{
	return report_type;
}

void
CatalogsReportFeedIngestionStats::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsReportFeedIngestionStats::getSeverity()
{
	return severity;
}

void
CatalogsReportFeedIngestionStats::setSeverity(std::string  severity)
{
	this->severity = severity;
}



