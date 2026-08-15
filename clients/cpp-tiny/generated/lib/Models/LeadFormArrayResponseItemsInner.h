
/*
 * LeadFormArrayResponse_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadFormArrayResponse_items_inner_H_
#define TINY_CPP_CLIENT_LeadFormArrayResponse_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Exception.h"
#include "LeadFormResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadFormArrayResponse_items_inner{
public:

    /*! \brief Constructor.
	 */
    LeadFormArrayResponse_items_inner();
    LeadFormArrayResponse_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormArrayResponse_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	LeadFormResponse getData();

	/*! \brief Set 
	 */
	void setData(LeadFormResponse  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);


    private:
    LeadFormResponse data;
    std::list<Exception> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_LeadFormArrayResponse_items_inner_H_ */
