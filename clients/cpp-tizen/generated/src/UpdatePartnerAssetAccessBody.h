/*
 * UpdatePartnerAssetAccessBody.h
 *
 * 
 */

#ifndef _UpdatePartnerAssetAccessBody_H_
#define _UpdatePartnerAssetAccessBody_H_


#include <string>
#include "UpdatePartnerAssetAccessBody_accesses_inner.h"
#include <list>
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

	/*! \brief Get 
	 */
	std::list<UpdatePartnerAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <UpdatePartnerAssetAccessBody_accesses_inner> accesses);

private:
	std::list <UpdatePartnerAssetAccessBody_accesses_inner>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerAssetAccessBody_H_ */
