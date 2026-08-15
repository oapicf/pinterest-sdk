
/*
 * AudienceDefinitionResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceDefinitionResponse_H_
#define TINY_CPP_CLIENT_AudienceDefinitionResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceDefinition.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceDefinitionResponse{
public:

    /*! \brief Constructor.
	 */
    AudienceDefinitionResponse();
    AudienceDefinitionResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDefinitionResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AudienceDefinition> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AudienceDefinition> items);


    private:
    std::list<AudienceDefinition> items;
};
}

#endif /* TINY_CPP_CLIENT_AudienceDefinitionResponse_H_ */
