/*
 * AdGroupCreateRequest_allOf.h
 *
 * 
 */

#ifndef _AdGroupCreateRequest_allOf_H_
#define _AdGroupCreateRequest_allOf_H_


#include <string>
#include "TargetingSpec.h"
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

class AdGroupCreateRequest_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupCreateRequest_allOf();
	AdGroupCreateRequest_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupCreateRequest_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TargetingSpec getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpec  targeting_spec);

private:
	TargetingSpec targeting_spec;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCreateRequest_allOf_H_ */
