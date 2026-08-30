
/*
 * UpdateMemberAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_H_
#define TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateMemberAssetResultItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateMemberAssetsResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberAssetsResultsResponseArray();
    UpdateMemberAssetsResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberAssetsResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
	 */
	std::list<UpdateMemberAssetResultItem> getItems();

	/*! \brief Set List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
	 */
	void setItems(std::list<UpdateMemberAssetResultItem> items);


    private:
    std::list<UpdateMemberAssetResultItem> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberAssetsResultsResponseArray_H_ */
