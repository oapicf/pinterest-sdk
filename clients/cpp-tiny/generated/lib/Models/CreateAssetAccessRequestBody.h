
/*
 * CreateAssetAccessRequestBody.h
 *
 * An object containing a list of all the asset access requests
 */

#ifndef TINY_CPP_CLIENT_CreateAssetAccessRequestBody_H_
#define TINY_CPP_CLIENT_CreateAssetAccessRequestBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateAssetAccessRequestItem.h"
#include <list>

namespace Tiny {


/*! \brief An object containing a list of all the asset access requests
 *
 *  \ingroup Models
 *
 */

class CreateAssetAccessRequestBody{
public:

    /*! \brief Constructor.
	 */
    CreateAssetAccessRequestBody();
    CreateAssetAccessRequestBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateAssetAccessRequestBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CreateAssetAccessRequestItem> getAssetRequests();

	/*! \brief Set 
	 */
	void setAssetRequests(std::list<CreateAssetAccessRequestItem> asset_requests);


    private:
    std::list<CreateAssetAccessRequestItem> asset_requests;
};
}

#endif /* TINY_CPP_CLIENT_CreateAssetAccessRequestBody_H_ */
