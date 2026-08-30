
/*
 * Campaigns_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Campaigns_list_200_response_H_
#define TINY_CPP_CLIENT_Campaigns_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Campaign.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Campaigns_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Campaigns_list_200_response();
    Campaigns_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Campaigns_list_200_response();


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
	void setBookmark(std::string bookmark);
	/*! \brief Get 
	 */
	std::list<Campaign> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<Campaign> items);


    private:
    std::string bookmark{};
    std::list<Campaign> items;
};
}

#endif /* TINY_CPP_CLIENT_Campaigns_list_200_response_H_ */
