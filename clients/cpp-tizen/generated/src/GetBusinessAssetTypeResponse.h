/*
 * GetBusinessAssetTypeResponse.h
 *
 * Type of asset.
 */

#ifndef _GetBusinessAssetTypeResponse_H_
#define _GetBusinessAssetTypeResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Type of asset.
 *
 *  \ingroup Models
 *
 */

class GetBusinessAssetTypeResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessAssetTypeResponse();
	GetBusinessAssetTypeResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessAssetTypeResponse();

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

#endif /* _GetBusinessAssetTypeResponse_H_ */
