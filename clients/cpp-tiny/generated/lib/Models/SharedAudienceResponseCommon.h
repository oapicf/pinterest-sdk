
/*
 * SharedAudienceResponseCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SharedAudienceResponseCommon_H_
#define TINY_CPP_CLIENT_SharedAudienceResponseCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Role.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudienceResponseCommon{
public:

    /*! \brief Constructor.
	 */
    SharedAudienceResponseCommon();
    SharedAudienceResponseCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SharedAudienceResponseCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audience ID that was shared
	 */
	std::string getAudienceId();

	/*! \brief Set Audience ID that was shared
	 */
	void setAudienceId(std::string  audience_id);
	/*! \brief Get 
	 */
	std::list<Role> getPermissions();

	/*! \brief Set 
	 */
	void setPermissions(std::list <Role> permissions);


    private:
    std::string audience_id{};
    std::list<Role> permissions;
};
}

#endif /* TINY_CPP_CLIENT_SharedAudienceResponseCommon_H_ */
