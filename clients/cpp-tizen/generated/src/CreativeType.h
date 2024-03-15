/*
 * CreativeType.h
 *
 * Ad creative type enum. For update, only draft ads may update creative type. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 */

#ifndef _CreativeType_H_
#define _CreativeType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad creative type enum. For update, only draft ads may update creative type. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 *
 *  \ingroup Models
 *
 */

class CreativeType : public Object {
public:
	/*! \brief Constructor.
	 */
	CreativeType();
	CreativeType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreativeType();

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

#endif /* _CreativeType_H_ */
