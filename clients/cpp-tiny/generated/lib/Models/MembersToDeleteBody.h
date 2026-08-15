
/*
 * MembersToDeleteBody.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MembersToDeleteBody_H_
#define TINY_CPP_CLIENT_MembersToDeleteBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MembersToDeleteBody_members_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MembersToDeleteBody{
public:

    /*! \brief Constructor.
	 */
    MembersToDeleteBody();
    MembersToDeleteBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MembersToDeleteBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<MembersToDeleteBody_members_inner> getMembers();

	/*! \brief Set 
	 */
	void setMembers(std::list <MembersToDeleteBody_members_inner> members);


    private:
    std::list<MembersToDeleteBody_members_inner> members;
};
}

#endif /* TINY_CPP_CLIENT_MembersToDeleteBody_H_ */
