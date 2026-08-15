
/*
 * AudienceDefinitionType.h
 *
 * Generated audience type to request.
 */

#ifndef TINY_CPP_CLIENT_AudienceDefinitionType_H_
#define TINY_CPP_CLIENT_AudienceDefinitionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Generated audience type to request.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinitionType{
public:

    /*! \brief Constructor.
	 */
    AudienceDefinitionType();
    AudienceDefinitionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDefinitionType();


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

#endif /* TINY_CPP_CLIENT_AudienceDefinitionType_H_ */
