

#include "IntegrationLogsRequestCreate.h"

using namespace Tiny;

IntegrationLogsRequestCreate::IntegrationLogsRequestCreate()
{
	logs = std::list<IntegrationLog>();
}

IntegrationLogsRequestCreate::IntegrationLogsRequestCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogsRequestCreate::~IntegrationLogsRequestCreate()
{

}

void
IntegrationLogsRequestCreate::fromJson(std::string jsonObj)
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
IntegrationLogsRequestCreate::toJson()
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
IntegrationLogsRequestCreate::getLogs()
{
	return logs;
}

void
IntegrationLogsRequestCreate::setLogs(std::list<IntegrationLog> logs)
{
	this->logs = logs;
}



