/*
 * CatalogsCreativeAssetsProductGroupFilterKeys.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsProductGroupFilterKeys_H_
#define _CatalogsCreativeAssetsProductGroupFilterKeys_H_


#include <string>
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"
#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"
#include "CatalogsProductGroupMultipleStringListCriteria.h"
#include "CreativeAssetsIdFilter.h"
#include "CustomLabel0Filter.h"
#include "CustomLabel1Filter.h"
#include "CustomLabel2Filter.h"
#include "CustomLabel3Filter.h"
#include "CustomLabel4Filter.h"
#include "GoogleProductCategory0Filter.h"
#include "GoogleProductCategory1Filter.h"
#include "GoogleProductCategory2Filter.h"
#include "GoogleProductCategory3Filter.h"
#include "GoogleProductCategory4Filter.h"
#include "GoogleProductCategory5Filter.h"
#include "GoogleProductCategory6Filter.h"
#include "LinkFilter.h"
#include "MediaTypeFilter.h"
#include "TitleKeywordsFilter.h"
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

class CatalogsCreativeAssetsProductGroupFilterKeys : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupFilterKeys();
	CatalogsCreativeAssetsProductGroupFilterKeys(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupFilterKeys();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID();

	/*! \brief Set 
	 */
	void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL2();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL2(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE();

	/*! \brief Set 
	 */
	void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE);
	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getLINK();

	/*! \brief Set 
	 */
	void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria  lINK);

private:
	CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_1;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_2;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_3;
	CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
	CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE;
	CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
	CatalogsProductGroupFilterOperatorTypeCriteria lINK;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupFilterKeys_H_ */
