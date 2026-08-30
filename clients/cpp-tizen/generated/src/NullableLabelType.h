/*
 * NullableLabelType.h
 *
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

#ifndef _NullableLabelType_H_
#define _NullableLabelType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 *
 *  \ingroup Models
 *
 */

class NullableLabelType : public Object {
public:
	/*! \brief Constructor.
	 */
	NullableLabelType();
	NullableLabelType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullableLabelType();

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

#endif /* _NullableLabelType_H_ */
