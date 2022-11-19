/*
 * SingleInterestTargetingOptionResponse.h
 *
 * 
 */

#ifndef _SingleInterestTargetingOptionResponse_H_
#define _SingleInterestTargetingOptionResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SingleInterestTargetingOptionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SingleInterestTargetingOptionResponse();
	SingleInterestTargetingOptionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SingleInterestTargetingOptionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<std::string> getChildInterests();

	/*! \brief Set 
	 */
	void setChildInterests(std::list <std::string> child_interests);
	/*! \brief Get 
	 */
	int getLevel();

	/*! \brief Set 
	 */
	void setLevel(int  level);

private:
	std::string id;
	std::string name;
	std::list <std::string>child_interests;
	int level;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SingleInterestTargetingOptionResponse_H_ */
