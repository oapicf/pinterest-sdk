

#include "CustomerListUpdateWithRequiredBody.h"

using namespace Tiny;

CustomerListUpdateWithRequiredBody::CustomerListUpdateWithRequiredBody()
{
	operation_type = null;
	records = std::string();
	records_v2 = std::list<CustomerListRecordRow>();
}

CustomerListUpdateWithRequiredBody::CustomerListUpdateWithRequiredBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListUpdateWithRequiredBody::~CustomerListUpdateWithRequiredBody()
{

}

void
CustomerListUpdateWithRequiredBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        UserListOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }

    const char *recordsKey = "records";

    if(object.has_key(recordsKey))
    {
        bourne::json value = object[recordsKey];



        jsonToValue(&records, value, "std::string");


    }

    const char *records_v2Key = "records_v2";

    if(object.has_key(records_v2Key))
    {
        bourne::json value = object[records_v2Key];


        std::list<CustomerListRecordRow> records_v2_list;
        CustomerListRecordRow element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            records_v2_list.push_back(element);
        }
        records_v2 = records_v2_list;


    }


}

bourne::json
CustomerListUpdateWithRequiredBody::toJson()
{
    bourne::json object = bourne::json::object();






	object["operation_type"] = getOperationType().toJson();





    object["records"] = getRecords();





    std::list<CustomerListRecordRow> records_v2_list = getRecordsV2();
    bourne::json records_v2_arr = bourne::json::array();

    for(auto& var : records_v2_list)
    {
        CustomerListRecordRow obj = var;
        records_v2_arr.append(obj.toJson());
    }
    object["records_v2"] = records_v2_arr;




    return object;

}

UserListOperationType
CustomerListUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
CustomerListUpdateWithRequiredBody::setOperationType(UserListOperationType operation_type)
{
	this->operation_type = operation_type;
}

std::string
CustomerListUpdateWithRequiredBody::getRecords()
{
	return records;
}

void
CustomerListUpdateWithRequiredBody::setRecords(std::string records)
{
	this->records = records;
}

std::list<CustomerListRecordRow>
CustomerListUpdateWithRequiredBody::getRecordsV2()
{
	return records_v2;
}

void
CustomerListUpdateWithRequiredBody::setRecordsV2(std::list<CustomerListRecordRow> records_v2)
{
	this->records_v2 = records_v2;
}



