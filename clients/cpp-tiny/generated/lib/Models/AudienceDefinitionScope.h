
/*
 * AudienceDefinitionScope.h
 *
 * Generated audience scope to request.
 */

#ifndef TINY_CPP_CLIENT_AudienceDefinitionScope_H_
#define TINY_CPP_CLIENT_AudienceDefinitionScope_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Generated audience scope to request.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinitionScope{
public:

    /*! \brief Constructor.
	 */
    AudienceDefinitionScope();
    AudienceDefinitionScope(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDefinitionScope();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);


    private:
    std::string scope{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceDefinitionScope_H_ */
