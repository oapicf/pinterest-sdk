/*
 * AdGroupAudienceSizingCreativeTypes.h
 *
 * 
 */

#ifndef _AdGroupAudienceSizingCreativeTypes_H_
#define _AdGroupAudienceSizingCreativeTypes_H_


#include <string>
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

class AdGroupAudienceSizingCreativeTypes : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupAudienceSizingCreativeTypes();
	AdGroupAudienceSizingCreativeTypes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupAudienceSizingCreativeTypes();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupAudienceSizingCreativeTypes_H_ */
