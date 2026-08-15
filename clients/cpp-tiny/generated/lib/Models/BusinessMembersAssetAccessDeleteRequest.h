
/*
 * Business_members_asset_access_delete_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Business_members_asset_access_delete_request_H_
#define TINY_CPP_CLIENT_Business_members_asset_access_delete_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Business_members_asset_access_delete_request_accesses_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Business_members_asset_access_delete_request{
public:

    /*! \brief Constructor.
	 */
    Business_members_asset_access_delete_request();
    Business_members_asset_access_delete_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Business_members_asset_access_delete_request();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of members asset access to be deleted
	 */
	std::list<Business_members_asset_access_delete_request_accesses_inner> getAccesses();

	/*! \brief Set List of members asset access to be deleted
	 */
	void setAccesses(std::list <Business_members_asset_access_delete_request_accesses_inner> accesses);


    private:
    std::list<Business_members_asset_access_delete_request_accesses_inner> accesses;
};
}

#endif /* TINY_CPP_CLIENT_Business_members_asset_access_delete_request_H_ */
