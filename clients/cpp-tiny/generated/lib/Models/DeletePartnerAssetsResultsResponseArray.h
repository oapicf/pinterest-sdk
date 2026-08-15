
/*
 * DeletePartnerAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeletePartnerAssetsResultsResponseArray_H_
#define TINY_CPP_CLIENT_DeletePartnerAssetsResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeletePartnerAssetsResult.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetsResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    DeletePartnerAssetsResultsResponseArray();
    DeletePartnerAssetsResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnerAssetsResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of terminated asset access.
	 */
	std::list<DeletePartnerAssetsResult> getItems();

	/*! \brief Set List of terminated asset access.
	 */
	void setItems(std::list <DeletePartnerAssetsResult> items);


    private:
    std::list<DeletePartnerAssetsResult> items;
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnerAssetsResultsResponseArray_H_ */
