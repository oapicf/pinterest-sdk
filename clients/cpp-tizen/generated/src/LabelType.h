/*
 * LabelType.h
 *
 * Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
 */

#ifndef _LabelType_H_
#define _LabelType_H_


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

class LabelType : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelType();
	LabelType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelType();

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

#endif /* _LabelType_H_ */
