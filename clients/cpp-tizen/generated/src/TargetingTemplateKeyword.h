/*
 * TargetingTemplateKeyword.h
 *
 * 
 */

#ifndef _TargetingTemplateKeyword_H_
#define _TargetingTemplateKeyword_H_


#include <string>
#include "MatchType.h"
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

class TargetingTemplateKeyword : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingTemplateKeyword();
	TargetingTemplateKeyword(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingTemplateKeyword();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MatchType getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(MatchType  match_type);
	/*! \brief Get The keyword targeting (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set The keyword targeting (120 chars max).
	 */
	void setValue(std::string  value);

private:
	MatchType match_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingTemplateKeyword_H_ */
