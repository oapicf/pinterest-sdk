
/*
 * Business_assets_get_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Business_assets_get_200_response_H_
#define TINY_CPP_CLIENT_Business_assets_get_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetBusinessAssetsResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Business_assets_get_200_response{
public:

    /*! \brief Constructor.
	 */
    Business_assets_get_200_response();
    Business_assets_get_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Business_assets_get_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get List of assets the requesting business has access to.
	 */
	std::list<GetBusinessAssetsResponse> getItems();

	/*! \brief Set List of assets the requesting business has access to.
	 */
	void setItems(std::list <GetBusinessAssetsResponse> items);


    private:
    std::string bookmark{};
    std::list<GetBusinessAssetsResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Business_assets_get_200_response_H_ */
