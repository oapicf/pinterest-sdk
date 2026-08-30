

#include "LeadsExports.h"

using namespace Tiny;

LeadsExports::LeadsExports()
{
	leads_export_id = std::string();
}

LeadsExports::LeadsExports(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadsExports::~LeadsExports()
{

}

void
LeadsExports::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *leads_export_idKey = "leads_export_id";

    if(object.has_key(leads_export_idKey))
    {
        bourne::json value = object[leads_export_idKey];



        jsonToValue(&leads_export_id, value, "std::string");


    }


}

bourne::json
LeadsExports::toJson()
{
    bourne::json object = bourne::json::object();





    object["leads_export_id"] = getLeadsExportId();



    return object;

}

std::string
LeadsExports::getLeadsExportId()
{
	return leads_export_id;
}

void
LeadsExports::setLeadsExportId(std::string leads_export_id)
{
	this->leads_export_id = leads_export_id;
}



