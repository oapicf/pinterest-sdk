
/*
 * UpdatePartnerResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_H_
#define TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePartnerResultsResponseArray_items_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    UpdatePartnerResultsResponseArray();
    UpdatePartnerResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePartnerResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<UpdatePartnerResultsResponseArray_items_inner> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <UpdatePartnerResultsResponseArray_items_inner> items);


    private:
    std::list<UpdatePartnerResultsResponseArray_items_inner> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePartnerResultsResponseArray_H_ */
