/*
 * CreativeAssetsVisibilityType.h
 *
 * Creative assets visibility.
 */

#ifndef _CreativeAssetsVisibilityType_H_
#define _CreativeAssetsVisibilityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Creative assets visibility.
 *
 *  \ingroup Models
 *
 */

class CreativeAssetsVisibilityType : public Object {
public:
	/*! \brief Constructor.
	 */
	CreativeAssetsVisibilityType();
	CreativeAssetsVisibilityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreativeAssetsVisibilityType();

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

#endif /* _CreativeAssetsVisibilityType_H_ */
