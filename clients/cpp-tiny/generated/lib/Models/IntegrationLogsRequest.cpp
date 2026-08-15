

#include "IntegrationLogsRequest.h"

using namespace Tiny;

IntegrationLogsRequest::IntegrationLogsRequest()
{
	logs = std::list<IntegrationLog>();
}

IntegrationLogsRequest::IntegrationLogsRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsRequest::~IntegrationLogsRequest()
{

}

void
IntegrationLogsRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *logsKey = "logs";

    if(object.has_key(logsKey))
    {
        bourne::json value = object[logsKey];


        std::list<IntegrationLog> logs_list;
        IntegrationLog element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            logs_list.push_back(element);
        }
        logs = logs_list;


    }


}

bourne::json
IntegrationLogsRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<IntegrationLog> logs_list = getLogs();
    bourne::json logs_arr = bourne::json::array();

    for(auto& var : logs_list)
    {
        IntegrationLog obj = var;
        logs_arr.append(obj.toJson());
    }
    object["logs"] = logs_arr;




    return object;

}

std::list<IntegrationLog>
IntegrationLogsRequest::getLogs()
{
	return logs;
}

void
IntegrationLogsRequest::setLogs(std::list <IntegrationLog> logs)
{
	this->logs = logs;
}



