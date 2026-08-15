
/*
 * LeadFormArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadFormArrayResponse_H_
#define TINY_CPP_CLIENT_LeadFormArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LeadFormArrayResponse_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadFormArrayResponse{
public:

    /*! \brief Constructor.
	 */
    LeadFormArrayResponse();
    LeadFormArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<LeadFormArrayResponse_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <LeadFormArrayResponse_items_inner> items);


    private:
    std::list<LeadFormArrayResponse_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_LeadFormArrayResponse_H_ */
