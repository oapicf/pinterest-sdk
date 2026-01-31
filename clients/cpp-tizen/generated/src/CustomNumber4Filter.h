/*
 * CustomNumber4Filter.h
 *
 * 
 */

#ifndef _CustomNumber4Filter_H_
#define _CustomNumber4Filter_H_


#include <string>
#include "CatalogsProductGroupUint32Criteria.h"
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

class CustomNumber4Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomNumber4Filter();
	CustomNumber4Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomNumber4Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_4);

private:
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomNumber4Filter_H_ */
