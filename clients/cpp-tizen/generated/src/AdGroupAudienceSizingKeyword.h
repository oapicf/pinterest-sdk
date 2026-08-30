/*
 * AdGroupAudienceSizingKeyword.h
 *
 * 
 */

#ifndef _AdGroupAudienceSizingKeyword_H_
#define _AdGroupAudienceSizingKeyword_H_


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

class AdGroupAudienceSizingKeyword : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingKeyword();
	AdGroupAudienceSizingKeyword(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingKeyword();

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
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
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

#endif /* _AdGroupAudienceSizingKeyword_H_ */
