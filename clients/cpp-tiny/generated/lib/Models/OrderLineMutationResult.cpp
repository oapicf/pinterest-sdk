

#include "OrderLineMutationResult.h"

using namespace Tiny;

OrderLineMutationResult::OrderLineMutationResult()
{
	errors = std::list<OrderLineMutationError>();
	order_line = std::list<OrderLine>();
}

OrderLineMutationResult::OrderLineMutationResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineMutationResult::~OrderLineMutationResult()
{

}

void
OrderLineMutationResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<OrderLineMutationError> errors_list;
        OrderLineMutationError element;
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
OrderLineMutationResult::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderLineMutationError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        OrderLineMutationError obj = var;
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

std::list<OrderLineMutationError>
OrderLineMutationResult::getErrors()
{
	return errors;
}

void
OrderLineMutationResult::setErrors(std::list<OrderLineMutationError> errors)
{
	this->errors = errors;
}

std::list<OrderLine>
OrderLineMutationResult::getOrderLine()
{
	return order_line;
}

void
OrderLineMutationResult::setOrderLine(std::list<OrderLine> order_line)
{
	this->order_line = order_line;
}



