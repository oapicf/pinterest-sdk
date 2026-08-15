
/*
 * DeletedMembersResponse.h
 *
 * An object with a list of members that were deleted.
 */

#ifndef TINY_CPP_CLIENT_DeletedMembersResponse_H_
#define TINY_CPP_CLIENT_DeletedMembersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of members that were deleted.
 *
 *  \ingroup Models
 *
 */

class DeletedMembersResponse{
public:

    /*! \brief Constructor.
	 */
    DeletedMembersResponse();
    DeletedMembersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletedMembersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of members whose business membership have been terminated.
	 */
	std::list<std::string> getDeletedMembers();

	/*! \brief Set List of members whose business membership have been terminated.
	 */
	void setDeletedMembers(std::list <std::string> deleted_members);


    private:
    std::list<std::string> deleted_members;
};
}

#endif /* TINY_CPP_CLIENT_DeletedMembersResponse_H_ */
