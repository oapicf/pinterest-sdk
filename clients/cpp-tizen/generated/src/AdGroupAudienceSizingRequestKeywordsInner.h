/*
 * AdGroupAudienceSizingRequest_keywords_inner.h
 *
 * 
 */

#ifndef _AdGroupAudienceSizingRequest_keywords_inner_H_
#define _AdGroupAudienceSizingRequest_keywords_inner_H_


#include <string>
#include "MatchTypeResponse.h"
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

class AdGroupAudienceSizingRequest_keywords_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingRequest_keywords_inner();
	AdGroupAudienceSizingRequest_keywords_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingRequest_keywords_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MatchTypeResponse getMatchType();

	/*! \brief Set 
	 */
	void setMatchType(MatchTypeResponse  match_type);
	/*! \brief Get Keyword value (120 chars max).
	 */
	std::string getValue();

	/*! \brief Set Keyword value (120 chars max).
	 */
	void setValue(std::string  value);

private:
	MatchTypeResponse match_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupAudienceSizingRequest_keywords_inner_H_ */
