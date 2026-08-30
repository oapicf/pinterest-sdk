
/*
 * Ad_groups_create_200_response_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ad_groups_create_200_response_items_inner_H_
#define TINY_CPP_CLIENT_Ad_groups_create_200_response_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdGroup.h"
#include "Pinterest.Lib.BatchItemException.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ad_groups_create_200_response_items_inner{
public:

    /*! \brief Constructor.
	 */
    Ad_groups_create_200_response_items_inner();
    Ad_groups_create_200_response_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ad_groups_create_200_response_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdGroup getData();

	/*! \brief Set 
	 */
	void setData(AdGroup data);
	/*! \brief Get 
	 */
	std::list<Pinterest.Lib.BatchItemException> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list<Pinterest.Lib.BatchItemException> exceptions);


    private:
    AdGroup data;
    std::list<Pinterest.Lib.BatchItemException> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_Ad_groups_create_200_response_items_inner_H_ */
