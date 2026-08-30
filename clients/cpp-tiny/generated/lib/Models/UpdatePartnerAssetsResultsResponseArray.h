
/*
 * UpdatePartnerAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerAssetsResultsResponseArray_H_
#define TINY_CPP_CLIENT_UpdatePartnerAssetsResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePartnerAssetsResult.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetsResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerAssetsResultsResponseArray();
    UpdatePartnerAssetsResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerAssetsResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of assigned/updated partner asset access.
	 */
	std::list<UpdatePartnerAssetsResult> getItems();

	/*! \brief Set List of assigned/updated partner asset access.
	 */
	void setItems(std::list<UpdatePartnerAssetsResult> items);


    private:
    std::list<UpdatePartnerAssetsResult> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerAssetsResultsResponseArray_H_ */
