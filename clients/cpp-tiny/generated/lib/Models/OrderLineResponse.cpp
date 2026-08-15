

#include "OrderLineResponse.h"

using namespace Tiny;

OrderLineResponse::OrderLineResponse()
{
	errors = std::list<OrderLineError>();
	order_line = std::list<OrderLine>();
}

OrderLineResponse::OrderLineResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineResponse::~OrderLineResponse()
{

}

void
OrderLineResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<OrderLineError> errors_list;
        OrderLineError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *order_lineKey = "order_line";

    if(object.has_key(order_lineKey))
    {
        bourne::json value = object[order_lineKey];


        std::list<OrderLine> order_line_list;
        OrderLine element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            order_line_list.push_back(element);
        }
        order_line = order_line_list;


    }


}

bourne::json
OrderLineResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderLineError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OrderLineError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<OrderLine> order_line_list = getOrderLine();
    bourne::json order_line_arr = bourne::json::array();

    for(auto& var : order_line_list)
    {
        OrderLine obj = var;
        order_line_arr.append(obj.toJson());
    }
    object["order_line"] = order_line_arr;




    return object;

}

std::list<OrderLineError>
OrderLineResponse::getErrors()
{
	return errors;
}

void
OrderLineResponse::setErrors(std::list <OrderLineError> errors)
{
	this->errors = errors;
}

std::list<OrderLine>
OrderLineResponse::getOrderLine()
{
	return order_line;
}

void
OrderLineResponse::setOrderLine(std::list <OrderLine> order_line)
{
	this->order_line = order_line;
}



