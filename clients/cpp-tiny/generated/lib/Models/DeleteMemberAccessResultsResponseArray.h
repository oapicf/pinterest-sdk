
/*
 * DeleteMemberAccessResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeleteMemberAccessResultsResponseArray_H_
#define TINY_CPP_CLIENT_DeleteMemberAccessResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeleteMemberAccessResult.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeleteMemberAccessResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    DeleteMemberAccessResultsResponseArray();
    DeleteMemberAccessResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteMemberAccessResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of member asset permissions that were deleted.
	 */
	std::list<DeleteMemberAccessResult> getItems();

	/*! \brief Set List of member asset permissions that were deleted.
	 */
	void setItems(std::list<DeleteMemberAccessResult> items);


    private:
    std::list<DeleteMemberAccessResult> items;
};
}

#endif /* TINY_CPP_CLIENT_DeleteMemberAccessResultsResponseArray_H_ */
