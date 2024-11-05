/*
 * GridClickType.h
 *
 * Where a user is taken after clicking on an ad in grid. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt;  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
 */

#ifndef _GridClickType_H_
#define _GridClickType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
 *
 *  \ingroup Models
 *
 */

class GridClickType : public Object {
public:
	/*! \brief Constructor.
	 */
	GridClickType();
	GridClickType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GridClickType();

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

#endif /* _GridClickType_H_ */
