/*
 * UpdatePartnerAssetAccessBody.h
 *
 * An object with a list of partner asset accesses to assign or update.
 */

#ifndef _UpdatePartnerAssetAccessBody_H_
#define _UpdatePartnerAssetAccessBody_H_


#include <string>
#include "UpdatePartnerAssetAccessItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of partner asset accesses to assign or update.
 *
 *  \ingroup Models
 *
 */

class UpdatePartnerAssetAccessBody : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerAssetAccessBody();
	UpdatePartnerAssetAccessBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerAssetAccessBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of partner asset accesses to assign or update.
	 */
	std::list<UpdatePartnerAssetAccessItem> getAccesses();

	/*! \brief Set List of partner asset accesses to assign or update.
	 */
	void setAccesses(std::list <UpdatePartnerAssetAccessItem> accesses);

private:
	std::list <UpdatePartnerAssetAccessItem>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerAssetAccessBody_H_ */
