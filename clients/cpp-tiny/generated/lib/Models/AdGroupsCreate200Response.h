
/*
 * Ad_groups_create_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Ad_groups_create_200_response_H_
#define TINY_CPP_CLIENT_Ad_groups_create_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Ad_groups_create_200_response_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Ad_groups_create_200_response{
public:

    /*! \brief Constructor.
	 */
    Ad_groups_create_200_response();
    Ad_groups_create_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Ad_groups_create_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<Ad_groups_create_200_response_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<Ad_groups_create_200_response_items_inner> items);


    private:
    std::list<Ad_groups_create_200_response_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_Ad_groups_create_200_response_H_ */
