/*
 * PreferredMediaType.h
 *
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 */

#ifndef _PreferredMediaType_H_
#define _PreferredMediaType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 *
 *  \ingroup Models
 *
 */

class PreferredMediaType : public Object {
public:
	/*! \brief Constructor.
	 */
	PreferredMediaType();
	PreferredMediaType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PreferredMediaType();

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

#endif /* _PreferredMediaType_H_ */
