

#include "LeadsExportStatus.h"

using namespace Tiny;

LeadsExportStatus::LeadsExportStatus()
{
}

LeadsExportStatus::LeadsExportStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadsExportStatus::~LeadsExportStatus()
{

}

void
LeadsExportStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LeadsExportStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



