

#include "IntegrationLogClientRequest.h"

using namespace Tiny;

IntegrationLogClientRequest::IntegrationLogClientRequest()
{
	host = std::string();
	method = std::string();
	path = std::string();
	request_headers = null<std::string>();
	response_headers = null<std::string>();
	response_status_code = int(0);
}

IntegrationLogClientRequest::IntegrationLogClientRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogClientRequest::~IntegrationLogClientRequest()
{

}

void
IntegrationLogClientRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hostKey = "host";

    if(object.has_key(hostKey))
    {
        bourne::json value = object[hostKey];



        jsonToValue(&host, value, "std::string");


    }

    const char *methodKey = "method";

    if(object.has_key(methodKey))
    {
        bourne::json value = object[methodKey];



        jsonToValue(&method, value, "std::string");


    }

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];



        jsonToValue(&path, value, "std::string");


    }

    const char *request_headersKey = "request_headers";

    if(object.has_key(request_headersKey))
    {
        bourne::json value = object[request_headersKey];


    }

    const char *response_headersKey = "response_headers";

    if(object.has_key(response_headersKey))
    {
        bourne::json value = object[response_headersKey];


    }

    const char *response_status_codeKey = "response_status_code";

    if(object.has_key(response_status_codeKey))
    {
        bourne::json value = object[response_status_codeKey];



        jsonToValue(&response_status_code, value, "int");


    }


}

bourne::json
IntegrationLogClientRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["host"] = getHost();






    object["method"] = getMethod();






    object["path"] = getPath();












    object["response_status_code"] = getResponseStatusCode();



    return object;

}

std::string
IntegrationLogClientRequest::getHost()
{
	return host;
}

void
IntegrationLogClientRequest::setHost(std::string  host)
{
	this->host = host;
}

std::string
IntegrationLogClientRequest::getMethod()
{
	return method;
}

void
IntegrationLogClientRequest::setMethod(std::string  method)
{
	this->method = method;
}

std::string
IntegrationLogClientRequest::getPath()
{
	return path;
}

void
IntegrationLogClientRequest::setPath(std::string  path)
{
	this->path = path;
}

Map<string, string>
IntegrationLogClientRequest::getRequestHeaders()
{
	return request_headers;
}

void
IntegrationLogClientRequest::setRequestHeaders(Map <string, string> request_headers)
{
	this->request_headers = request_headers;
}

Map<string, string>
IntegrationLogClientRequest::getResponseHeaders()
{
	return response_headers;
}

void
IntegrationLogClientRequest::setResponseHeaders(Map <string, string> response_headers)
{
	this->response_headers = response_headers;
}

int
IntegrationLogClientRequest::getResponseStatusCode()
{
	return response_status_code;
}

void
IntegrationLogClientRequest::setResponseStatusCode(int  response_status_code)
{
	this->response_status_code = response_status_code;
}



