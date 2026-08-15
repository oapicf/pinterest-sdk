
/*
 * UpdateMemberResultsResponseArray.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberResultsResponseArray_H_
#define TINY_CPP_CLIENT_UpdateMemberResultsResponseArray_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateMemberResult.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateMemberResultsResponseArray{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberResultsResponseArray();
    UpdateMemberResultsResponseArray(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberResultsResponseArray();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of members with updated business access role.
	 */
	std::list<UpdateMemberResult> getItems();

	/*! \brief Set List of members with updated business access role.
	 */
	void setItems(std::list <UpdateMemberResult> items);


    private:
    std::list<UpdateMemberResult> items;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberResultsResponseArray_H_ */
