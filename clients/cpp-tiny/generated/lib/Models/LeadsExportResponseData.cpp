

#include "LeadsExportResponseData.h"

using namespace Tiny;

LeadsExportResponseData::LeadsExportResponseData()
{
	download_url = std::string();
	export_status = LeadsExportStatus();
}

LeadsExportResponseData::LeadsExportResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadsExportResponseData::~LeadsExportResponseData()
{

}

void
LeadsExportResponseData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *download_urlKey = "download_url";

    if(object.has_key(download_urlKey))
    {
        bourne::json value = object[download_urlKey];



        jsonToValue(&download_url, value, "std::string");


    }

    const char *export_statusKey = "export_status";

    if(object.has_key(export_statusKey))
    {
        bourne::json value = object[export_statusKey];




        LeadsExportStatus* obj = &export_status;
		obj->fromJson(value.dump());

    }


}

bourne::json
LeadsExportResponseData::toJson()
{
    bourne::json object = bourne::json::object();





    object["download_url"] = getDownloadUrl();







	object["export_status"] = getExportStatus().toJson();


    return object;

}

std::string
LeadsExportResponseData::getDownloadUrl()
{
	return download_url;
}

void
LeadsExportResponseData::setDownloadUrl(std::string download_url)
{
	this->download_url = download_url;
}

LeadsExportStatus
LeadsExportResponseData::getExportStatus()
{
	return export_status;
}

void
LeadsExportResponseData::setExportStatus(LeadsExportStatus export_status)
{
	this->export_status = export_status;
}



