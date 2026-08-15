
/*
 * Get_invites_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Get_invites_200_response_H_
#define TINY_CPP_CLIENT_Get_invites_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Get_invites_200_response{
public:

    /*! \brief Constructor.
	 */
    Get_invites_200_response();
    Get_invites_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Get_invites_200_response();


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
	/*! \brief Get List of invite and request data.
	 */
	std::list<InviteResponse> getItems();

	/*! \brief Set List of invite and request data.
	 */
	void setItems(std::list <InviteResponse> items);


    private:
    std::string bookmark{};
    std::list<InviteResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_Get_invites_200_response_H_ */
