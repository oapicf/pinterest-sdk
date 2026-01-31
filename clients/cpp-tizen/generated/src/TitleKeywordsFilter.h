/*
 * TitleKeywordsFilter.h
 *
 * 
 */

#ifndef _TitleKeywordsFilter_H_
#define _TitleKeywordsFilter_H_


#include <string>
#include "CatalogsProductGroupMultipleStringCriteria.h"
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

class TitleKeywordsFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	TitleKeywordsFilter();
	TitleKeywordsFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TitleKeywordsFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS);

private:
	CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TitleKeywordsFilter_H_ */
