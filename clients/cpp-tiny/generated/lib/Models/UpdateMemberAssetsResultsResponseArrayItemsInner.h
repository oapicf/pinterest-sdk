
/*
 * UpdateMemberAssetsResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_items_inner_H_
#define TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UsersForIndividualAssetResponse.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateMemberAssetsResultsResponseArray_items_inner{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberAssetsResultsResponseArray_items_inner();
    UpdateMemberAssetsResultsResponseArray_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberAssetsResultsResponseArray_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UsersForIndividualAssetResponse getResponse();

	/*! \brief Set 
	 */
	void setResponse(UsersForIndividualAssetResponse  response);


    private:
    UsersForIndividualAssetResponse response;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_items_inner_H_ */
