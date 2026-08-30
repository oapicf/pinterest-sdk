
/*
 * AudienceDefinition.h
 *
 * Queryable audience representation.
 */

#ifndef TINY_CPP_CLIENT_AudienceDefinition_H_
#define TINY_CPP_CLIENT_AudienceDefinition_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Queryable audience representation.
 *
 *  \ingroup Models
 *
 */

class AudienceDefinition{
public:

    /*! \brief Constructor.
	 */
    AudienceDefinition();
    AudienceDefinition(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceDefinition();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Generation date
	 */
	std::string getDate();

	/*! \brief Set Generation date
	 */
	void setDate(std::string date);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string scope);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string type);


    private:
    std::string date{};
    std::string scope{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceDefinition_H_ */
