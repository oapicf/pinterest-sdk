

#include "IntegrationLogsInvalidLogResponse.h"

using namespace Tiny;

IntegrationLogsInvalidLogResponse::IntegrationLogsInvalidLogResponse()
{
	rejected_logs = std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner>();
}

IntegrationLogsInvalidLogResponse::IntegrationLogsInvalidLogResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsInvalidLogResponse::~IntegrationLogsInvalidLogResponse()
{

}

void
IntegrationLogsInvalidLogResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rejected_logsKey = "rejected_logs";

    if(object.has_key(rejected_logsKey))
    {
        bourne::json value = object[rejected_logsKey];


        std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs_list;
        IntegrationLogsInvalidLogResponse_rejected_logs_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            rejected_logs_list.push_back(element);
        }
        rejected_logs = rejected_logs_list;


    }


}

bourne::json
IntegrationLogsInvalidLogResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs_list = getRejectedLogs();
    bourne::json rejected_logs_arr = bourne::json::array();

    for(auto& var : rejected_logs_list)
    {
        IntegrationLogsInvalidLogResponse_rejected_logs_inner obj = var;
        rejected_logs_arr.append(obj.toJson());
    }
    object["rejected_logs"] = rejected_logs_arr;




    return object;

}

std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner>
IntegrationLogsInvalidLogResponse::getRejectedLogs()
{
	return rejected_logs;
}

void
IntegrationLogsInvalidLogResponse::setRejectedLogs(std::list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs)
{
	this->rejected_logs = rejected_logs;
}



