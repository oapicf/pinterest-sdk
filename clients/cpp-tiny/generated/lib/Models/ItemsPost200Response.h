
/*
 * Items_post_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Items_post_200_response_H_
#define TINY_CPP_CLIENT_Items_post_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Items_post_200_response{
public:

    /*! \brief Constructor.
	 */
    Items_post_200_response();
    Items_post_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Items_post_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ItemResponse> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<ItemResponse> items);


    private:
    std::list<ItemResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Items_post_200_response_H_ */
