

#include "TemplateBasedReport.h"

using namespace Tiny;

TemplateBasedReport::TemplateBasedReport()
{
	message = std::string();
	report_status = BulkReportingJobStatus();
	template_id = std::string();
	token = std::string();
}

TemplateBasedReport::TemplateBasedReport(std::string jsonString)
{
	this->fromJson(jsonString);
}

TemplateBasedReport::~TemplateBasedReport()
{

}

void
TemplateBasedReport::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *report_statusKey = "report_status";

    if(object.has_key(report_statusKey))
    {
        bourne::json value = object[report_statusKey];




        BulkReportingJobStatus* obj = &report_status;
		obj->fromJson(value.dump());

    }

    const char *template_idKey = "template_id";

    if(object.has_key(template_idKey))
    {
        bourne::json value = object[template_idKey];



        jsonToValue(&template_id, value, "std::string");


    }

    const char *tokenKey = "token";

    if(object.has_key(tokenKey))
    {
        bourne::json value = object[tokenKey];



        jsonToValue(&token, value, "std::string");


    }


}

bourne::json
TemplateBasedReport::toJson()
{
    bourne::json object = bourne::json::object();





    object["message"] = getMessage();







	object["report_status"] = getReportStatus().toJson();





    object["template_id"] = getTemplateId();






    object["token"] = getToken();



    return object;

}

std::string
TemplateBasedReport::getMessage()
{
	return message;
}

void
TemplateBasedReport::setMessage(std::string message)
{
	this->message = message;
}

BulkReportingJobStatus
TemplateBasedReport::getReportStatus()
{
	return report_status;
}

void
TemplateBasedReport::setReportStatus(BulkReportingJobStatus report_status)
{
	this->report_status = report_status;
}

std::string
TemplateBasedReport::getTemplateId()
{
	return template_id;
}

void
TemplateBasedReport::setTemplateId(std::string template_id)
{
	this->template_id = template_id;
}

std::string
TemplateBasedReport::getToken()
{
	return token;
}

void
TemplateBasedReport::setToken(std::string token)
{
	this->token = token;
}



